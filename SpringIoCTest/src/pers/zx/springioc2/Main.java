package pers.zx.springioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	      Ioctest objA = (Ioctest) context.getBean("helloWorld");

	      objA.getMessage1();
	      objA.getMessage2();

	      IoctestIndia objB = (IoctestIndia) context.getBean("helloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
	   }

}
