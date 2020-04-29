package com.github.leonardowiest.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Leonardo Wiest
 *
 *
 *         Usamos o proxyBeanMethodsatributo do Spring Boot para evitar o uso de
 *         cglib e quaisquer outros proxies que não sejam JDK da aplicação.
 *         GraalVM_hates_ non-JDK proxies e mesmo com JDK proxies, há trabalho a
 *         ser feito para tornar o GraalVM ciente disso. Este atributo é novo na
 *         estrutura 5.2 do Spring Boot e foi projetado, em parte, para suportar
 *         aplicativos GraalVM.
 * 
 * @see https://spring.io/blog/2020/04/16/spring-tips-the-graalvm-native-image-builder-feature
 *
 */
@SpringBootApplication(proxyBeanMethods = false)
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
