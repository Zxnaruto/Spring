package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import pers.zx.bean.StudentMarks;
import pers.zx.mapper.StudentMarksMapper;

//数据库操作的实现
public class StudentJDBCTemplate implements StudentDao{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	private PlatformTransactionManager transactionManager;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	public void create(Integer Id, String Name, Integer Age, Integer Marks,
			Integer Year) {
		// TODO Auto-generated method stub
		TransactionDefinition def=new DefaultTransactionDefinition();
		TransactionStatus status=transactionManager.getTransaction(def);
		
		try {
			String sql1 = "INSERT INTO student (Id,Name,Age) VALUES(?,?,?)";//插入信息
			jdbcTemplateObject.update(sql1, Id, Name, Age);
			String sql2 = "SELECT max(Id) FROM student";//选取学生表中最大Id
			int sid = jdbcTemplateObject.queryForInt(sql2);
			String sql3 = "INSERT INTO mark (Sid,Marks,Year) VALUES(?,?,?)";
			jdbcTemplateObject.update(sql3, sid, Marks, Year);//
			System.out.println("Created Id=" + Id + ", Name=" + Name + ", Age="
					+ Age);
			transactionManager.commit(status);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR in creating record,rolling back");
			transactionManager.rollback(status);
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return;
		
	}

	public List<StudentMarks> listStudents() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM student,mark WHERE student.Id=mark.Sid";
		List <StudentMarks>studentMarks=jdbcTemplateObject.query(sql, new StudentMarksMapper());
		return studentMarks;
	}
	
	
	
}
