package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import pers.zx.bean.StudentMarks;

public interface StudentDao {

	
	public void setDataSource(DataSource dateSource);//���ݿ��ʼ��
	public void create(Integer Id,String Name,Integer Age,Integer Marks,Integer Year);//����
	public List<StudentMarks> listStudents();//�г���Ϣ
	
	
}
