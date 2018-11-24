import java.util.Scanner;
public class DesignParttern{
	public static void code1(){
		/*普通方法
		Client client = new Client();
		//高内聚，低耦合   耦合（子类有太多的联系，如果修改就要都修改）
		client.buy(new MacbookProComputer());
		client.buy(new SurfaceComputer());
		client.buy(new AlienwareComputer());*/
		
		
		/*解耦
		Client client = new Client();
		client.buy(SimpleFactorPattern.getInstance("mac"));
		//client.buy(SimpleFactorPattern.getInstance("mi"));//null*/
		
		
		/*
		//1.通过参数
		Client client = new Client();
		if(args.length > 0){
			String type = args[0];
			Computer computer = SimpleFactorPattern.getInstance(type);
			if(computer == null){
				System.out.println("输入的类型："+type+"不支持");
			}else{
				client.buy(computer);
				}
		}else{
			System.out.println("请输入计算机类型：mac,surface,alienware");
		}*/
		
		
		/*
		//2.通过读取客户端用户输入数据(控制台)java.util.Scanner
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("请输入计算机类型：mac,surface,alienware,输入q 退出");
		    String type = scanner.nextLine();
			if(type.equals("q")){
				break;
			}
		    Client client = new Client();
		    Computer computer = SimpleFactorPattern.getInstance(type);
		    if(computer == null){
				System.out.println("输入的类型："+type+"不支持");
	        }else{
				client.buy(computer);
		    }
		}*/
	}
	
	public static void main(String[] args){
		/*
		Client client = new Client();
		//客户端与工厂类耦合
		ComputerFactory computerfactory = new MacbookProComputerFactory();
		Computer computer = computerfactory.creatComputer();
		client.buy(computer);*/
		
		ProductFactory productfactory = new AppleProductFactory();
		Computer computer = productfactory.creatComputer();
		OperatorySystem system = productfactory.creatSystem();
		//computer.printComputer();
		//system.printSystem();
		
		Product product = new Product(system,computer);
		product.printProducyInfo();
	}
}

class Client{
	
	public void buy(Computer computer){
		computer.printComputer();
	}
}

class Product{
	
	private OperatorySystem system;
	private Computer computer;
	public Product(OperatorySystem system,Computer computer){
		this.system = system;
		this.computer = computer;
	}
	public void printProducyInfo(){
		this.computer.printComputer();
		this.system.printSystem();
	}
}

interface Computer{
	
	void printComputer();
}

interface OperatorySystem{
	void printSystem();
}

//简单工厂模式，将实例化对象交给工厂来实现，有共同的父类。（抽象类，具体产品类，一个工厂）
class SimpleFactorPattern{
	public static Computer getInstance(String type){
		Computer computer = null;
		switch(type){
			case "mac":
			computer = new MacbookProComputer();
			break;
			case "surface":
			computer = new SurfaceComputer();
			break;
			case "alien":
			computer = new AlienwareComputer();
			break;
			default:
			System.out.println("计算机工厂不能创造指定类型"+type+"的计算机");
		}
		return computer;
	}
}


//工厂方法（一个抽象类，多个具体产品类，一个抽象工厂，多个具体工厂-每个具体产品对应一个具体工厂）
interface ComputerFactory{
	Computer creatComputer();
}


//抽象工厂（多个抽象产品类，具体产品类，抽象工厂类-声明（一组）返回抽象产品的方法，具体工厂类-生成具体产品）
interface ProductFactory{
	//工厂创建计算机
	Computer creatComputer();
	//工厂创建操作系统
	OperatorySystem creatSystem();
	//创建的产品
	Product creatProduct();
}
class MacbookProComputer implements Computer{
	
	public void printComputer(){
		System.out.println("这是一个MacbookProComputer");
	}
}

class MacbookProComputerFactory implements ComputerFactory{
	public Computer creatComputer(){
		return new MacbookProComputer();
	}
}

class MacOs implements OperatorySystem{
	public void printSystem(){
		System.out.println("这是MacOS操作系统");
	}
}

class AppleProductFactory implements ProductFactory{
	public Computer creatComputer(){
		return new MacbookProComputer();
	}
	public OperatorySystem creatSystem(){
		return new MacOs();
	}
	
}

class SurfaceComputer implements Computer{
	
	public void printComputer(){
		System.out.println("这是一个SurfaceComputer");
	}
}

class SurfaceComputerFactor implements ComputerFactory{
	public Computer creatComputer(){
		return new SurfaceComputer();
	}
}

class Windows8 implements OperatorySystem{
	public void printSystem(){
		System.out.println("这是一个Windows8的操作系统");
	}
	
}
class MsProductFactory implements ProductFactory{
	public Computer creatComputer(){
		return new SurfaceComputer();
	}
	public OperatorySystem creatSystem(){
		return new Windows8();
	}
	
}

class AlienwareComputer implements Computer{
	
	public void printComputer(){
		System.out.println("这是一个AlienwareComputer");
	}
}