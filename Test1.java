public class Test1{
	
	public static void main(String[] args){
		Outer outer = new Outer();
		outer.display(15);
		
	}
}
	
interface MyInterface{
		
		void test();
	}
	
class Outer{
	
	private int num = 20;
	public void display(int value){
		//匿名内部类 实现了一个接口
		 new MyInterface(){
			
			public void test(){
				System.out.println("value ="+ value);
				System.out.println("num ="+ num);
			}
		}.test();
	}
}
	
