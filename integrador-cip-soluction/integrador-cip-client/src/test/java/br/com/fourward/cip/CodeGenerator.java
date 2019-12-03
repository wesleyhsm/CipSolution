
package br.com.fourward.cip;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;

import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

public class CodeGenerator {

	private static final String CREATE_DATA_REST_REPOSITORY = "package ${package}.restrepository;" + //
			"\r\n" + //
			"${imports}\r\n" + //
			"@RepositoryRestResource(collectionResourceRel = \"${className}\", path = \"${className}\")\r\n" + //
			"public interface ${className}Repository extenting JpaRepository<${className}, Long>{\r\n" + //
			"\r\n" + //
			"${findByMetohd}\r\n" + //
			"\r\n" + //
			"}";

	private static final String FIND_BY_METHOD_TEXT =
			"    public Page<${className}> findBy${attributeNameJpa}(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}Containing(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IgnoreCase(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IgnoreCaseContaining(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}StartsWith(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}EndsWith(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IgnoreCaseStartsWith(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IgnoreCaseEndsWith(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IsNull(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IsNotNull(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}Not(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}In(@Param(\"${attributeName}s\") final Collection<${attributeType}> ${attributeName}s, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}NotIn(@Param(\"${attributeName}s\") final Collection<${attributeType}> ${attributeName}s, final Pageable pageable);\r\n";

	private static final String FIND_BY_METHOD_NUMBER_DATE =
			"    public Page<${className}> findBy${attributeNameJpa}(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}Between(@Param(\"begin\") final ${attributeType} begin,(@Param(\"end\") final ${attributeType} end, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}LessThan(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}LessThanEqual(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}GreaterThan(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}GreaterThanEqual(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IsNull(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IsNotNull(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}Not(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}In(@Param(\"${attributeName}s\") final Collection<${attributeType}> ${attributeName}s, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}NotIn(@Param(\"${attributeName}s\") final Collection<${attributeType}> ${attributeName}s, final Pageable pageable);\r\n";

	private static final String FIND_BY_METHOD_BOOLEAN =
			"    public Page<${className}> findBy${attributeNameJpa}(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}True(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}False(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}GreaterThanEqual(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n"
					+ //
					"    public Page<${className}> findBy${attributeNameJpa}IsNull(@Param(\"${attributeName}\") final ${attributeType} ${attributeName}, final Pageable pageable);\r\n";

	private static final String CREATE_METHOD_TEMPLATE = "public ${className} create${className}(){\r\n" //
			+ "\r\n" //
			+ "${variables}" //
			+ "\r\n" //
			+ "return ${className}Builder //\r\n" //
			+ ".create() //\r\n" //
			+ "${create_setters}" //
			+ ".build(); \r\n" //
			+ "}\r\n"; //

	private static String CREATE_SETTERS_TEMPLATE = ".${setterName}(${attributeName}) //\r\n";

	private static String VARIABLE_TEMPLATE = "final ${attributeType}$ ${attributeName} = null;\r\n";

	private static final String IMPORT_TEMPLATE = "import ${referenceClassName};\r\n";
	private static final String ATTRIBUTES_TEMPLATE = "\tprivate ${attributeType} ${attributeName};\r\n";
	private static final String BUILDER_SET_TEMPLATE =
			"\tpublic ${className}Builder ${setterName}(final ${attributeType} ${attributeName}){\r\n" //
					+ //
					"\t\tthis.${attributeName} = ${attributeName};\r\n"
					+ //
					"\t\treturn this;\r\n"
					+ //
					"\t}\r\n\r\n";

	private static final String BUILDER_TEMPLATE = "" + //
			"package ${package}.builder;\r\n" + //
			"\r\n" + //
			"${imports}\r\n" + //
			"public class ${className}Builder {\r\n" + //
			"\r\n" + //
			"\tpublic static ${className}Builder create(){\r\n" + //
			"\t\treturn new ${className}Builder();\r\n" + //
			"\t}\r\n" + //
			"\r\n" + //
			"\tprivate ${className}Builder(){\r\n" + //
			"\r\n" + //
			"\t}" + //
			"\r\n\r\n" + //
			"${attributes}" + //
			"\r\n\r\n" + //
			"${setters}" + //
			"\r\n\r\n" + //
			"\tpublic ${className} build(){\r\n" + //
			"\t\treturn new ${className}(${constructorArgs});\r\n" + //
			"\t}\r\n" + //
			"}\r\n";
	private final List<Class<?>> existList = new ArrayList<>();

	@Test
	public void createJavaBuildersOutputFile() throws IOException {
		final String[] packages = { "br.com.fourward.cip.canonical" };

		Arrays.asList(packages).forEach(packageName -> {
			try {
				ClassPath //
						.from(ClassLoader.getSystemClassLoader()) //
						.getTopLevelClasses(packageName) //
						.forEach(action -> {
							Arrays.asList(OptionGen.values()).forEach(option -> {
								try {
									print(action,
											genCode(Class.forName(action.getName()), model -> generateBuilder(model)));
									print(action,
											genCode(Class.forName(action.getName()),
													model -> generateCreateMethods(model)));
									print(action,
											genCode(Class.forName(action.getName()),
													model -> generateDataRestRespository(model)));
								} catch (final ClassNotFoundException e) {
									e.printStackTrace();
								}
							});
						});
			} catch (final IOException e) {
				e.printStackTrace();
			}
		});
	}

	private void print(final ClassInfo classInfo, final String code) {
		System.out.println(code);
		System.out.println("--------------------------------------");
	}

	public <T> String generateCreateMethods(final Class<T> objectType) {
		existList.clear();
		String template = CodeGenerator.CREATE_METHOD_TEMPLATE;
		template = template.replace("${className}", objectType.getSimpleName());
		final StringBuilder stringBuilderSetter = new StringBuilder();
		final StringBuilder stringBuilderVariable = new StringBuilder();

		// VARIABLE_TEMPLATE
		String variableTemplate = "";

		// ${attributeType}$ ${attributeName}

		for (final Field field : objectType.getDeclaredFields()) {
			if (!Modifier.isStatic(field.getModifiers())) {
				variableTemplate =
						CodeGenerator.VARIABLE_TEMPLATE.replace("${attributeType}$", field.getType().getSimpleName());
				variableTemplate = variableTemplate.replace("${attributeName}", field.getName());
				stringBuilderVariable.append(variableTemplate);
			}
		}

		template = template.replace("${variables}", stringBuilderVariable.toString());

		String settersTemplate = "";

		for (final Field field : objectType.getDeclaredFields()) {
			if (!Modifier.isStatic(field.getModifiers())) {
				final String setterName = setterJavaName(field.getName());
				settersTemplate = CodeGenerator.CREATE_SETTERS_TEMPLATE.replace("${setterName}", setterName);
				settersTemplate = settersTemplate.replace("${attributeName}", field.getName());
				stringBuilderSetter.append(settersTemplate);
			}
		}
		template = template.replace("${create_setters}", stringBuilderSetter.toString());

		return template;

	}

	public <T> String generateDataRestRespository(final Class<T> objectType) {

		String template = CodeGenerator.CREATE_DATA_REST_REPOSITORY;

		final StringBuilder stringBuilder = new StringBuilder();
		template = template.replace("${package}", objectType.getPackage().getName());
		stringBuilder.append(template);

		String templateAttribute = "";
		String imports = "import " + objectType.getName() + ";\r\n";
		for (final Field field : objectType.getDeclaredFields()) {
			if (!Modifier.isStatic(field.getModifiers())) {

				if (Boolean.class.equals(field.getType()) || boolean.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodBoolean(field);
				} else if (Byte.class.equals(field.getType()) || byte.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Short.class.equals(field.getType()) || short.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Integer.class.equals(field.getType()) || int.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Long.class.equals(field.getType()) || long.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Float.class.equals(field.getType()) || float.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Double.class.equals(field.getType()) || double.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (BigInteger.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (BigDecimal.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (Date.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodNumberDate(field);
				} else if (String.class.equals(field.getType())) {
					templateAttribute += generateFindByMethodString(field);
				}

				imports += generateImport(field);
			}
		}
		template = template.replace("${findByMetohd}", templateAttribute);
		template = template.replace("${imports}", imports);
		template = template.replace("${className}", objectType.getSimpleName());
		return template;
	}

	private String generateFindByMethodBoolean(final Field field) {
		return CodeGenerator.FIND_BY_METHOD_BOOLEAN.replace("${attributeNameJpa}", upper(field.getName())) //
				.replace("${attributeType}", field.getType().getSimpleName()) //
				.replace("${attributeName}", field.getName());
	}

	private String generateFindByMethodString(final Field field) {
		return CodeGenerator.FIND_BY_METHOD_TEXT //
				.replace("${attributeNameJpa}", upper(field.getName())) //
				.replace("${attributeType}", field.getType().getSimpleName()) //
				.replace("${attributeName}", field.getName());
	}

	private String generateFindByMethodNumberDate(final Field field) {
		return CodeGenerator.FIND_BY_METHOD_NUMBER_DATE //
				.replace("${attributeNameJpa}", upper(field.getName())) //
				.replace("${attributeType}", field.getType().getSimpleName()) //
				.replace("${attributeName}", field.getName());
	}

	public <T> String generateBuilder(final Class<T> objectType) {
		String template = CodeGenerator.BUILDER_TEMPLATE;
		final StringBuilder stringBuilder = new StringBuilder();
		template = template.replace("${package}", objectType.getPackage().getName());
		template = template.replace("${className}", objectType.getSimpleName());
		stringBuilder.append(template);
		String templateAttribute = "";
		String templateSetter = "";
		String constructorArgs = "";
		String imports = "import " + objectType.getName() + ";\r\n";
		int i = 0;
		for (final Field field : objectType.getDeclaredFields()) {
			if (!Modifier.isStatic(field.getModifiers())) {
				templateAttribute += generateAttributes(field);
				templateSetter += generateSetterBuild(objectType, field);
				imports += generateImport(field);
				if (i == 0) {
					constructorArgs += field.getName();
					i++;
				} else {
					constructorArgs += ", " + field.getName();
				}
			}
		}
		template = template.replace("${attributes}", templateAttribute);
		template = template.replace("${setters}", templateSetter);
		template = template.replace("${constructorArgs}", constructorArgs);
		template = template.replace("${imports}", imports);
		return template;
	}

	private String generateImport(final Field field) {
		if (!existList.contains(field.getType())) {
			if (!field.getType().getName().contains("java.lang.")) {
				existList.add(field.getType());
				return CodeGenerator.IMPORT_TEMPLATE.replace("${referenceClassName}", field.getType().getName());
			}
		}
		return "";
	}

	private String generateAttributes(final Field field) {
		return CodeGenerator.ATTRIBUTES_TEMPLATE.replace("${attributeType}", field.getType().getSimpleName())
				.replace("${attributeName}", field.getName());
	}

	private <T> String generateSetterBuild(final Class<T> objectType, final Field field) {
		return CodeGenerator.BUILDER_SET_TEMPLATE.replace("${className}", objectType.getSimpleName()) //
				.replace("${setterName}", setterJavaName(field.getName())) //
				.replace("${attributeType}", field.getType().getSimpleName()) //
				.replace("${attributeName}", field.getName()); //
	}

	public String setterJavaName(final String attributeName) {
		return "set" + attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
	}

	public String upper(final String attributeName) {
		return attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
	}

	public <T> String genCode(final Class<T> objectType, final Function<Class<T>, String> function) {
		return function.apply(objectType);
	}

	public enum OptionGen {
		builderClass,
		createMethod,
		jpaRepository;
	}
}
