package pers.zx.springioc;

/**
 * @author zx
 * 这是关于spring IoC容器的应用
 *
 */
public class IoCTest {

	private String message;
	public void setMessage(String message){
		this.message=message;
	}
	public void getMessage(){
		System.out.println("输出："+message);
	}
	
	//生命周期
	public void init(){
		System.out.println("初始化");
	}
	public void destory(){
		System.out.println("销毁");
	}
}
