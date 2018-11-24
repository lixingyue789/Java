//快递员送花之代理模式(张三 让 快递员 送花给 女朋友 李四)
public class SendGiftTest{
	public static void main(String[] args){
		BoyFriendSendGift object = new BoyFriendSendGift("张三","李四");
		CourierSendGift proxyObject = new CourierSendGift(object);
		proxyObject.sendGift();
	}
}
//代理模式
interface SendGift{
	void sendGift();
}
//业务类
class BoyFriendSendGift implements SendGift{
	private String boyFriendNmae;
	private String grilFriendName;
	public BoyFriendSendGift(String boyFriendNmae,String grilFriendName){
		this.boyFriendNmae = boyFriendNmae;
		this.grilFriendName = grilFriendName;
	}
	public void sendGift(){
		System.out.println(this.boyFriendNmae+"送礼物给"+this.grilFriendName);
	}
}
//代理类
class CourierSendGift implements SendGift{
	private SendGift target;
	public CourierSendGift(SendGift target){
		this.target = target;
	}
	public void sendGift(){
		System.out.println("快递员打电话给客户");
		this.target.sendGift();
		System.out.println("客户签收");
	}
}