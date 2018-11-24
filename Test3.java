public class Test3{
	
	public static void main(String[] args){
		Student student = new Student("张三","male","3456","陕科大");
		System.out.println(student);
		
	}
}
//继承
class Student extends Person{
	private String num;
	private String school;
	
	public Student(String name,String gender,String num,String school){
		super(name,gender);
		this.num = num;
		this.school = school;
		System.out.println("这是Student子类的构造方法");
	}
	public String getNum(){
		return this.num;
	}
	public String getSchool(){
		return this.school;
	}
	/*
	public String toString(){
		return " 姓名为 "+ this.getName()+" 性别为 "+this.getGender()+" 学号为 "+this.getNum()+" 学校为 "+this.getSchool();
	}*/
	//方法覆写
	public String toString(){
		return  super.toString()+" 学号为 "+this.getNum()+" 学校为 "+this.getSchool();
	}
}
	
class Person{
	
	private String name;
	private String gender;
	
	public Person(String name,String gender){
		this.name = name;
		this.gender = gender;
		System.out.println("这是Person父类的构造方法");
	}
	public String getName(){
		return this.name;
	}
	public String getGender(){
		return this.gender;
	}
	public String toString(){
		return "姓名为 :"+ this.name+" 性别为 :"+this.gender;
	}

}