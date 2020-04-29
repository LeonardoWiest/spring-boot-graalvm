package com.github.leonardowiest.api.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		log.info(String.format("Calling bean post processor before init for bean: %s - class name: ", beanName, bean.getClass()));

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		log.info(String.format("Calling bean post processor after init for bean: %s - class name: %s", beanName,
				bean.getClass()));

		return bean;
	}
}
