package pers.zx.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zx
 * ����spring oap xml�ܹ�ʵ�ּ�������
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
