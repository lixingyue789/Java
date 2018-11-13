public class Test2{
	
	public static void printArray(Person[] persons){
		for(int i = 0;i < persons.length;i++){
			System.out.println(persons[i]);
		}
	}
	
	public static void main(String[] args){
		//对象数组
		//Person person = new Person(1,"张三");
		//System.out.println(person);
		//动态初始化
		Person[] persons = new Person[3];
	    persons[0] = new Person(1,"张三");//匿名对象
	    persons[1] = new Person(2,"李四","lisi@qq.com");
	    persons[2] = new Person(3,"王老五","wanglaowu@qq.com","3527847384");
		Test2.printArray(persons);
		
		//静态初始化
		Person[] persons2 = new Person[]{
			new Person(4,"Tony")
		};
		Test2.printArray(persons2);
		System.out.println(persons2.length);
	}
}

class Person{
	
	private int id;
	private String name;
	private String email;
	private String phone;
	
	public Person(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public Person(int id,String name,String email){
		this(id,name);
		this.email = email;
	}
	
	public Person(int id,String name,String email,String phone){
		this(id,name,email);
		this.phone = phone;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public String toString(){
		return "编号为 :"+ this.id +"姓名为 :"+ this.name+"邮箱为 :" +this.email+"电话为 :" +this.phone;
	}
	
}