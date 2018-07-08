package pers.zx.springioc;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String[] args){
		/*�� Spring �У��д����� BeanFactory �ӿڵ�ʵ�֡����У����ʹ�õ��� XmlBeanFactory �ࡣ
		 * ���������һ�� XML �ļ��ж�ȡ����Ԫ���ݣ�����ЩԪ����������һ�������û���ϵͳ����Ӧ�á�
		 * ����Դ������ƶ��豸���߻��� applet ��Ӧ�õ��У� BeanFactory �ᱻ����ѡ��
		 * ����һ��ʹ�õ��� ApplicationContext*/
		/*@SuppressWarnings("unused")
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IoCTest obj=(IoCTest)factory.getBean("ioctest");
		obj.getMessage();*/
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/*Application Context �� spring �нϸ߼����������� BeanFactory ���ƣ������Լ��������ļ���
		 * ����� bean�������е� bean ������һ�𣬵��������ʱ����� bean��
		 * FileSystemXmlApplicationContext���������� XML �ļ��м����ѱ������ bean�����������Ҫ�ṩ�������� XML �ļ�������·����
		 * ClassPathXmlApplicationContext���������� XML �ļ��м����ѱ������ bean��������㲻��Ҫ�ṩ XML �ļ�������·����ֻ��
		 * ��ȷ���� CLASSPATH �����������ɣ���Ϊ��������� CLASSPATH ������ bean �����ļ�*/
		//ApplicationContext context=new FileSystemXmlApplicationContext("F:/Meecplise/Spring/SpringIoCTest/src/applicationContext.xml");
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//IoCTest obj=(IoCTest)context.getBean("ioctest");
		//obj.getMessage();
		
		
		//Bean �������� singleton & prototype
		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IoCTest objA=(IoCTest)context.getBean("ioctest");
		objA.setMessage("I'm obj A");
		objA.getMessage();
		IoCTest objB=(IoCTest)context.getBean("ioctest");
		objB.getMessage();*/
		
		//��������&���ò���
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IoCTest obj=(IoCTest)context.getBean("ioctest");
		obj.getMessage();
		((AbstractApplicationContext) context).registerShutdownHook();//ע��һ���� AbstractApplicationContext ���������Ĺر� hook �� registerShutdownHook() ����������ȷ�������رգ����ҵ�����ص� destroy ����
		
	}
}
