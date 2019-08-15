package com.zwd.bean;

import com.zwd.bean.domain.SayService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoTest {

	@Test
	public void test1() {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		SayService test = (SayService) context.getBean("test");

		test.say();

	}
}
