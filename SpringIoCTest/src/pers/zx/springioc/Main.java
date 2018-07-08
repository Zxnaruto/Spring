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
		/*在 Spring 中，有大量对 BeanFactory 接口的实现。其中，最常被使用的是 XmlBeanFactory 类。
		 * 这个容器从一个 XML 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。
		 * 在资源宝贵的移动设备或者基于 applet 的应用当中， BeanFactory 会被优先选择。
		 * 否则，一般使用的是 ApplicationContext*/
		/*@SuppressWarnings("unused")
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		IoCTest obj=(IoCTest)factory.getBean("ioctest");
		obj.getMessage();*/
		
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		/*Application Context 是 spring 中较高级的容器。和 BeanFactory 类似，它可以加载配置文件中
		 * 定义的 bean，将所有的 bean 集中在一起，当有请求的时候分配 bean。
		 * FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径。
		 * ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需
		 * 正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件*/
		//ApplicationContext context=new FileSystemXmlApplicationContext("F:/Meecplise/Spring/SpringIoCTest/src/applicationContext.xml");
		//ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//IoCTest obj=(IoCTest)context.getBean("ioctest");
		//obj.getMessage();
		
		
		//Bean 的作用域 singleton & prototype
		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IoCTest objA=(IoCTest)context.getBean("ioctest");
		objA.setMessage("I'm obj A");
		objA.getMessage();
		IoCTest objB=(IoCTest)context.getBean("ioctest");
		objB.getMessage();*/
		
		//生命周期&后置操作
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		IoCTest obj=(IoCTest)context.getBean("ioctest");
		obj.getMessage();
		((AbstractApplicationContext) context).registerShutdownHook();//注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法
		
	}
}
