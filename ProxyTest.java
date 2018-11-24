public class ProxyTest{
	
	public static void main(String[] args){
		RealSubject realsubject = new RealSubject();
		ProxySubject proxysubject = new ProxySubject(realsubject);
		proxysubject.computer();
		
	} 
}
//代理模式
interface Computer{
	
	void computer();
}
//真正业务
class RealSubject implements Computer{
	
	public void computer(){
		System.out.println("购买一台外星人笔记本");
	}
}
//代理类
class ProxySubject implements Computer{
	
	private final Computer target;
	public ProxySubject(Computer target){
		this.target = target;
	}
	public void computer(){
		System.out.println("生产外星人笔记本");  
		this.target.computer();
		System.out.println("外星人笔记本的售后团队正式为你服务");
	}
}