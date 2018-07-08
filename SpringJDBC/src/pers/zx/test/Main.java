package pers.zx.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.zx.bean.Message;
import pers.zx.dao.MessageJDBCTemplate;

/**
 * @author zx
 * spring 数据库链接，完成插入删除，修改，读取
 *
 */
public class Main {

	public static void main(String[] args){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageJDBCTemplate messageJDBCTemplate=(MessageJDBCTemplate)context.getBean("messageJDBCTemplate");
		/*System.out.println("-----Record Creation--------");
		messageJDBCTemplate.creat(2,"zx", 22);
		messageJDBCTemplate.creat(3,"xx", 20);*/
		System.out.println("---------Listing Multiple Records-------");
		List<Message>messages=messageJDBCTemplate.listMessage();
		for(Message record:messages){
			System.out.print("Id:"+record.getId());
			System.out.print(", Name:"+record.getName());
			System.out.println(", Age:"+record.getAge());
		}
		System.out.println("---------Updating Record whi id=1-------");
		messageJDBCTemplate.update(1, 19);
		System.out.println("---------Listing Record wit id=2-------");
		Message message=messageJDBCTemplate.getMessage(2);
		System.out.print("Id:"+message.getId());
		System.out.print(", Name:"+message.getName());
		System.out.println(", Age:"+message.getAge());
		
	}
}
