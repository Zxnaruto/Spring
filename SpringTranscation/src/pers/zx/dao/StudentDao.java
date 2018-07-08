package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import pers.zx.bean.StudentMarks;

public interface StudentDao {

	
	public void setDataSource(DataSource dateSource);//数据库初始化
	public void create(Integer Id,String Name,Integer Age,Integer Marks,Integer Year);//插入
	public List<StudentMarks> listStudents();//列出信息
	
	
}
