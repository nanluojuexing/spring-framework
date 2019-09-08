package org.springframework.beans.factory.xml;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.tests.MyTestBean;

import static org.junit.Assert.assertEquals;

@SuppressWarnings("deprecation")
public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/beanFactoryTest.xml"));
		MyTestBean factoryBean = (MyTestBean)factory.getBean("myTestBean");
		assertEquals("testStr",factoryBean.getTestStr());
	}
}
