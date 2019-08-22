package com.zwd.bean;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import com.zwd.bean.domain.SayService;
import com.zwd.bean.domain.Teacher;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpringIoTest {

	@Test
	public void test1() {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		Teacher teacher = (Teacher) context.getBean("teacher");


	}
}
