package pers.zx.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zx
 * 
 * ����ע�����
 *
 */
public class Main {

	public static void main(String[] args){

		//����Spring�����ļ�
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡBean����
		ArrayIocTest test=(ArrayIocTest)context.getBean("arrayioctest");
		//����Bean���󷽷�
	    test.testData();
	    System.out.println("llllll"+test.getList().get(0));
	}
}
