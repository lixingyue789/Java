public class Test5{
	
	public static void main(String[] args){
		//Person person = new Person("张三");//抽象类无法实例化(即便抽象类中没有方法)
		Person person = new Student("张三");
		System.out.println(person.getPersonInfo());//抽象类的实例化可以通过子类实例化（多态）
		Person person1 = new Teacher("李四");
		System.out.println(person1.getPersonInfo());
		Person person2 = Person.getPersonObject();
		System.out.println(person2.getPersonInfo());
		//匿名内部类
		/*
		Person info = new Person("唐曾"){
			public String getPersonInfo(){
				return "医生姓名: "+this.getName();
			}
		};
		System.out.println(info.getPersonInfo());*/
		
		String info = new Person("唐曾"){
			public String getPersonInfo(){
				return "医生姓名: "+this.getName();
			}
		}.getPersonInfo();
		System.out.println(info);
	}
}

abstract class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public abstract String getPersonInfo();
	//1.方法内部类
	//2.匿名内部类
	/*
	public static Person getPersonObject(){//
	    class Worker extends Person{
			public Worker(String name){
		     super(name);
	        }
			public String getPersonInfo(){
				return "工人姓名 :"+this.getName();
			}
		}
		return new Worker("王五");
	}*/
	//2.匿名内部类
	public static Person getPersonObject(){
	return new Person("王五"){
		public String getPersonInfo(){
			return "工人姓名 :"+this.getName();
		}
	  };
	}
}

//子类继承抽象类必须实现父类的抽象方法（所有），若没有实现就必须用abstract修饰子类
class Student extends Person{
	
	public Student(String name){
		super(name);
	}
	public String getPersonInfo(){
		return "学生姓名为 :"+ this.getName();
	}
}

class Teacher extends Person{
	
	public Teacher(String name){
		super(name);
	}
	public String getPersonInfo(){
		return "老师姓名为 :"+ this.getName();
	}
}