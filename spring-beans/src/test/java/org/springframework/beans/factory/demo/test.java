package org.springframework.beans.factory.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class test {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/customeBean.xml"));
		User user = (User)factory.getBean("testBean");
		System.out.println(user.getUserName()+"--"+user.getEmail());
	}

}
