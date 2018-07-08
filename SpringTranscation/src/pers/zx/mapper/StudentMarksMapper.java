package pers.zx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pers.zx.bean.StudentMarks;

//±éÀúÊı¾İ¿â
public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		StudentMarks studentMarks=new StudentMarks();
		studentMarks.setId(rs.getInt("Id"));
		studentMarks.setName(rs.getString("Name"));
		studentMarks.setAge(rs.getInt("Age"));
		studentMarks.setSid(rs.getInt("Sid"));
		studentMarks.setMarks(rs.getInt("Marks"));
		studentMarks.setYear(rs.getInt("Year"));
		return studentMarks;
	}

	
}
