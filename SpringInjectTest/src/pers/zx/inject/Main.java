package pers.zx.inject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zx
 * 
 * 依赖注入测试
 *
 */
public class Main {

	public static void main(String[] args){

		//加载Spring配置文件
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取Bean对象
		ArrayIocTest test=(ArrayIocTest)context.getBean("arrayioctest");
		//调用Bean对象方法
	    test.testData();
	    System.out.println("llllll"+test.getList().get(0));
	}
}
