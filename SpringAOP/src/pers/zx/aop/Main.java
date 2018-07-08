package pers.zx.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zx
 * 利用spring oap xml架构实现几个建议
 *
 */
public class Main {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student=(Student)context.getBean("student");
		student.getName();
		student.getAge();
		student.printThrowException();
	}
}
