package pers.zx.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MessageMapper implements RowMapper<Message>{

	@Override
	public Message mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Message message=new Message();
		message.setId(rs.getInt("Id"));
		message.setName(rs.getString("Name"));
		message.setAge(rs.getInt("Age"));
		return message;
	}

}
