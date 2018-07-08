package pers.zx.dao;

import java.util.List;

import javax.sql.DataSource;

import pers.zx.bean.Message;

/**
 * @author zx
 *  声明数据库操作
 *
 */
public interface MessageDao {

	public void setDataSource(DataSource ds);//初始化链接
	public void creat(Integer Id,String Name,Integer Age);//创建记录
	public Message getMessage(Integer Id);//根据Id得到信息
	public List<Message> listMessage();//链表存放信息
	public void delete(Integer Id);//根据Id删除
	public void update(Integer Id,Integer Age);//更新年龄
	
}
