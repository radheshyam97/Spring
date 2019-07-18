package com.test.hello;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

import com.test.hello.service.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "START" );
    	DefaultListableBeanFactory beanks=new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader xb=new XmlBeanDefinitionReader(beanks);
    	xb.loadBeanDefinitions(new FileSystemResource("mybeans.xml"));
    	
    	HelloService helloService=(HelloService )beanks.getBean("helloService");
    	System.out.println(helloService);
    	    	
    	HelloService helloService1=(HelloService )beanks.getBean("helloService");
    	System.out.println(helloService1);
    	
    	
    	System.out.println("Message: "+helloService.getMessage());
    	System.out.println( "END" );
        
    }
}
