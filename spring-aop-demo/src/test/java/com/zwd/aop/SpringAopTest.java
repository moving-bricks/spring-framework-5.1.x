package com.zwd.aop;

import com.zwd.aop.domain.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {

	@Test
	public void test1() {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Teacher teacher = (Teacher) context.getBean("teacher");

		teacher.say();

	}
}
