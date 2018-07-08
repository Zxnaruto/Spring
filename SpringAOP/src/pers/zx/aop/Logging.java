package pers.zx.aop;

public class Logging {

	 //ǰ����
	public void beforeAdvice(){
		System.out.println("Gonig to setup student profile");
	}
	//����
	public void afterAdvice(){
		System.out.println("student profile has been setup");
	}
	//ִ�к���
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning:"+retVal.toString());
	}
	//�쳣����
	public void afterThrowingAdvice(IllegalArgumentException e){
		System.out.println("There has been an exception:"+e.toString());
	}
}
