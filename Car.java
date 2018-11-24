public class Car{
	
	private  String color;
	private int price;
	private String brand;
	
	
	public Car(String color,int price){
		this.color = color;
		this.price = price;
	}
	public Car(String color,int price,String brand){
		this(color,price);
		this.brand = brand;
	}
	
	public String carInfo(){
		return "这辆车的颜色为"+color+",价格为"+price+",品牌为"+brand;
	}
	
	public static void main(String[] args){
		Car car = new Car("red",50000,"bengchi");
		System.out.println(car.carInfo());
	}
	
}