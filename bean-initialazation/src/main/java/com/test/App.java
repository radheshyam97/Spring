package com.test;

import java.net.Socket;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.test.bean.ConnectionConfig;
import com.test.factory.SocketFactory;

 
public class App {
	public static void main(String[] args) {
		System.out.println("START");
		Resource resource = new FileSystemResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		//processConstructorArg(beanFactory);
		processFactoryExample(beanFactory);
		
		System.out.println("END");
		
	}
	private static void processConstructorArg(BeanFactory beanFactory) {
		ConnectionConfig defaultConfig = beanFactory.getBean("config1", ConnectionConfig.class);
		System.out.println("defaultConfig: " + defaultConfig);

		ConnectionConfig config2 = beanFactory.getBean("config2", ConnectionConfig.class);
		System.out.println("config2: " + config2);

		ConnectionConfig config3 = beanFactory.getBean("config3", ConnectionConfig.class);
		System.out.println("config3: " + config3);
	}
	private static void processFactoryExample(BeanFactory beanFactory) {
		
		 Socket socket = beanFactory.getBean("socketFactory",Socket.class);
		 System.out.println("socket: "+socket);
		 
		 Object socketFactory1 = beanFactory.getBean("socketFactory");
		 System.out.println("socketFactory1: "+socketFactory1);
		
		 
		 Socket socket2 = beanFactory.getBean("socketFactory2",Socket.class);
		 System.out.println("socket2: "+socket2);
		
		 
		 Socket socket3= beanFactory.getBean("socketFactory2",Socket.class);
		 System.out.println("socket3: "+socket3);
		
		 
		 
		 SocketFactory s1= beanFactory.getBean("s1",SocketFactory.class);
		 System.out.println("s1: "+s1);
		 
		 Socket s2= beanFactory.getBean("s2",Socket.class);
		 System.out.println("s2: "+s2);
		 Socket s3= beanFactory.getBean("s2",Socket.class);
		 System.out.println("s3: "+s3);
		 
	}
}
