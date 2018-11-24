public class Car1{
	private static String brand = "bengchi";
	private String color;
	private int price;

    public Car1(String color,int price){
		this.color = color;
		this.price = price;
	}
	public Car1(String color,int price,String brand){
		this(color,price);
		this.brand = brand;
		Car1.brand = "dazhong";
	}
	
	public String car1Info(){
		return "这辆车的颜色为"+color+",价格为"+price+",品牌为"+brand;
	}
	
	public static void main(String[] args){
		Car1 car2 = new Car1("red",50000);
		System.out.println(car1.carInfo());
		Car1 car3 = new Car1("red",50000);
		System.out.println(car1.carInfo());
	}
}