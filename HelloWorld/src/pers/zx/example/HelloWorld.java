package pers.zx.example;

/**
 * @author zx
 * 这是Spring入门的HelloWorld
 */
public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("输出成功："+ message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
