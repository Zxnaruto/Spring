package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import pers.zx.bean.Message;

/**
 * @author zx
 *  �������ݿ����
 *
 */
public interface MessageDao {

	public void setDataSource(DataSource ds);//��ʼ������
	public void creat(Integer Id,String Name,Integer Age);//������¼
	public Message getMessage(Integer Id);//����Id�õ���Ϣ
	public List<Message> listMessage();//��������Ϣ
	public void delete(Integer Id);//����Idɾ��
	public void update(Integer Id,Integer Age);//��������
	
}
