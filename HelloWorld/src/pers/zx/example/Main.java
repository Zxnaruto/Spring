package pers.zx.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zx
 * ≤‚ ‘¿‡
 */
public class Main {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld obj=(HelloWorld)context.getBean("helloworld");
		obj.getMessage();
	}
}
