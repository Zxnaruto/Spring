package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import pers.zx.bean.Message;
import pers.zx.bean.MessageMapper;

public class MessageJDBCTemplate implements MessageDao{

	private DataSource dataSource;

	private JdbcTemplate jabcTemplateObject;
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		this.dataSource=dataSource;
		this.jabcTemplateObject=new JdbcTemplate(dataSource);
	}

	public void creat(Integer Id,String Name, Integer Age) {
		// TODO Auto-generated method stub
		String SQL="INSERT INTO message (Id,Name,Age) VALUES (?,?,?)";
		jabcTemplateObject.update(SQL, Id,Name,Age);
		System.out.println("Created record Name="+Name+" Age="+Age);
		return;
	}

	public Message getMessage(Integer Id) {
		// TODO Auto-generated method stub
		String SQL="SELECT *from message WHERE Id=?";
		Message message=jabcTemplateObject.queryForObject(SQL, new Object[]{Id},new MessageMapper());
		return message;
}

	public List<Message> listMessage() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM message";
		List <Message>messages=jabcTemplateObject.query(SQL, new MessageMapper());
		return messages;
	}

	public void delete(Integer Id){
		// TODO Auto-generated method stub
		String SQL="DELETE FROM message where Id=?";
		jabcTemplateObject.update(SQL,Id);
		System.out.println("Deleted record with Id="+Id);
		return;
	}

	public void update(Integer Id, Integer Age) {
		// TODO Auto-generated method stub
		String SQL="UPDATE message SET Age=? WHERE Id=?";
		jabcTemplateObject.update(SQL, Age, Id);
		System.out.println("Updated record whit Id="+Id);
		return;
	}



	
}
