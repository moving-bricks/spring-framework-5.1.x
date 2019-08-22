package com.zwd.bean.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class ChangeTeacherBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		BeanDefinition teacher = beanFactory.getBeanDefinition("teacher");
		MutablePropertyValues propertyValues = teacher.getPropertyValues();
		if (propertyValues.contains("smoking")){
			propertyValues.add("smoking",false);
		}

	}
}
