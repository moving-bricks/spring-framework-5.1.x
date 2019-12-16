package com.zwd.bean.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.lang.Nullable;

public class Teacher implements BeanNameAware, BeanFactoryAware,InitializingBean, BeanFactoryPostProcessor, BeanPostProcessor  {


private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher() {
		System.out.println("构造函数");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactoryAware " + beanFactory);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("beanNameAware " + name);
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("InitializingBean afterPropertiesSet");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("beanFactoryPostProcessor " + beanFactory);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor 初始化前" + bean +" "+beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("BeanPostProcessor 初始化后" + bean +" "+beanName);
		return null;
	}

}
