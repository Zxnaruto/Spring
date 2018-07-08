package pers.zx.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pers.zx.bean.StudentMarks;
import pers.zx.dao.StudentJDBCTemplate;

public class Main {

	public static void main(String[] args){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentJDBCTemplate studentJDBCTemplate=(StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
		System.out.println("---------creat-------------");
		studentJDBCTemplate.create(1, "zx", 22, 90, 2018);
		studentJDBCTemplate.create(2, "xx", 16, 80,2016);
		System.out.println("---------list-------------");
		List<StudentMarks> studentMarks=studentJDBCTemplate.listStudents();
		for(StudentMarks record:studentMarks){
			System.out.print("Id:"+record.getId());
			System.out.print(", Name:"+record.getName());
			System.out.print(", Age:"+record.getAge());
			System.out.print(",Marks:"+record.getMarks());
			System.out.println(",Year:"+record.getYear());
			
		}
	}
}
