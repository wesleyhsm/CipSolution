/**
 *
 */
package br.com.fourward.logger;

import java.util.Optional;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Manipulador de logs.
 *
 * @author 4ward:rcabral
 */
@Aspect
@Component
public class LoggingHandler {

	/**
	 * Registra o log
	 */
	@Pointcut("within(@br.com.fourward.logger.Logger *)")
	public void logger() {
		//
	}

	@Pointcut("execution(* *.*(..))")
	protected void loggerAllMethod() {
		//
	}

	@Pointcut("execution(public * *(..))")
	protected void loggerPublicMethod() {
		//
	}

	/**
	 * Registra o log antes da execução do recurso.
	 *
	 * @param joinPoint {@link JoinPoint}
	 */
	@Before("logger() && loggerPublicMethod()")
	public void loggerAnyResourceBeforeOperation(final JoinPoint joinPoint) {
		final Signature signature = joinPoint.getSignature();
		final Logger logger = LoggerFactory
				.getLogger(signature.getDeclaringType());

		logger.info("Method={}", signature.getName());
		logger.info("Params={}", getParams(joinPoint.getArgs()));

	}

	private String getParams(final Object[] params) {
		StringBuffer buffer = new StringBuffer();
		for (Object param : params) {
			buffer.append(toString(param));
			buffer.append(", ");
		}

		return buffer.toString();
	}

	/**
	 * Registra o log após a execução do recurso.
	 *
	 * @param joinPoint {@link JoinPoint}
	 * @param result {@link Object} resultado da operação.
	 */
	@AfterReturning(pointcut = "logger() && loggerPublicMethod()", returning = "result")
	public void loggerAnyResourceAfterOperation(JoinPoint joinPoint,
			Object result) {
		final Signature signature = joinPoint.getSignature();
		final Logger logger = LoggerFactory
				.getLogger(signature.getDeclaringType());

		logger.info("Method={}", signature.getName());
		logger.info("Return={}", toString(result));
	}

	/**
	 * Registra o log após uma execução de erro.
	 *
	 * @param joinPoint {@link JoinPoint}
	 * @param exception {@link Throwable}
	 */
	@AfterThrowing(pointcut = "logger() && loggerPublicMethod()", throwing = "exception")
	public void loggerAfterThrowable(JoinPoint joinPoint, Throwable exception) {
		final Signature signature = joinPoint.getSignature();
		final Logger logger = LoggerFactory
				.getLogger(signature.getDeclaringType());

		logger.error("Method={}", signature.getName());
		logger.error("Cause={}", toString(exception.getCause()));
	}

	/**
	 * Recupera o resultado processado.
	 *
	 * @param joinPoint {@link ProceedingJoinPoint}
	 * @return {@link Object}
	 * @throws Throwable erro de processamento.
	 */
	@Around("logger() && loggerPublicMethod()")
	public Object getProceed(ProceedingJoinPoint joinPoint) throws Throwable {
		final Signature signature = joinPoint.getSignature();
		final Logger logger = LoggerFactory
				.getLogger(signature.getDeclaringType());

		final Long timeOfStart = System.currentTimeMillis();
		try {
			Object result = joinPoint.proceed();
			final Long timeOfEnd = System.currentTimeMillis() - timeOfStart;
			logger.info("Method={}, Execution time={} in ms",
					signature.getName(), timeOfEnd);

			return result;
		} catch (IllegalArgumentException e) {
			logger.error("Params={}", getParams(joinPoint.getArgs()));
			throw e;
		}
	}

	private String toString(final Object value) {
		if (Optional.ofNullable(value).isPresent()) {
			if (hasReflection(value)) {
				return ReflectionToStringBuilder.toString(value,
						ToStringStyle.SHORT_PREFIX_STYLE);
			}

			return value.toString();
		}
		return null;
	}

	private static Boolean hasReflection(final Object value) {
		return value.toString()
				.endsWith("@" + Integer.toHexString(value.hashCode()));
	}
}
