package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMsgGenerator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println(" main method from client app--------------------");
		//Locate config file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//Acitvate BeanFactory container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		
		// get the bean class obj
		//WishMsgGenerator bean = (WishMsgGenerator) factory.getBean("wish"); type cast required
		WishMsgGenerator bean = factory.getBean("wish", WishMsgGenerator.class);
		
		//call business logic method
		String result = bean.generateMsg();
		 
		System.out.println(result);
	}
}
