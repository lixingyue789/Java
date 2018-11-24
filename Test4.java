//覆写(子类会完全覆盖父类对象)
public class Test4{
	public static void main(String[] args){
		//Person person5 = new Person();
		//person5.print();
        //Student student5 = new Student();
		//student5.print();
		Person person = new Student();//向上转型
		person.hello();//调用子类对象的方法
		System.out.println(person.getPersonInfo());
		//System.out.println(person.getStudentInfo());//不行
		Student student = (Student)person;//向下转型要强转
		System.out.println(student.getPersonInfo());
		student.hello();
		//对象 instanceof 类名
		System.out.println(person instanceof Student);
		System.out.println(student instanceof Person);
		//判断是否能转换
		Person person1 = new Person();//不能转换
		if(person1 instanceof Student){
			Student student1 = (Student)person;
		}else{
			System.out.println("Person对象不能转换为Student对象");
		}
		
		Person person2 = new Student();//可以转换
		if(person2 instanceof Student){
			Student student2 = (Student)person;
		}else{
			System.out.println("Person对象不能转换为Student对象");
		}
		byte b1 = 1;
		byte b2 = b1;
	}
}

class Person{
	
	public void print(){
		System.out.println("这是Person的print方法");
	}
	public void hello(){
		System.out.println("这是Person的hello方法");
	}
	public String getPersonInfo(){
		return "Person info";
	}
}

class Student extends Person{
	//default 包私有
	public void print(){
		System.out.println("这是Student的print方法");
	}
	public void hello(){
		System.out.println("这是Student的hello方法");
	}
	public String getStudentInfo(){
		return "Student info";
	}
}