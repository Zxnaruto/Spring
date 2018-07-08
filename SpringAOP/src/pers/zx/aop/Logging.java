package pers.zx.aop;

public class Logging {

	 //前建议
	public void beforeAdvice(){
		System.out.println("Gonig to setup student profile");
	}
	//后建议
	public void afterAdvice(){
		System.out.println("student profile has been setup");
	}
	//执行后建议
	public void afterReturningAdvice(Object retVal){
		System.out.println("Returning:"+retVal.toString());
	}
	//异常建议
	public void afterThrowingAdvice(IllegalArgumentException e){
		System.out.println("There has been an exception:"+e.toString());
	}
}
