package br.com.fourward.cip.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.com.fourward.cip.validator.CertificateValidator;

@Constraint(validatedBy = { CertificateValidator.class })
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface ExistValidCertificate {
	
	String message() default "O arquivo não existe ou extensão esta inválida (.pfx ou .cer)";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
}
