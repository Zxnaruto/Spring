package pers.zx.springioc;

/**
 * @author zx
 * ���ǹ���spring IoC������Ӧ��
 *
 */
public class IoCTest {

	private String message;
	public void setMessage(String message){
		this.message=message;
	}
	public void getMessage(){
		System.out.println("�����"+message);
	}
	
	//��������
	public void init(){
		System.out.println("��ʼ��");
	}
	public void destory(){
		System.out.println("����");
	}
}
