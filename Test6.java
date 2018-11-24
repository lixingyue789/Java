public class Test6{
	
	public static void arrayInit(){
		//动态初始化
		//基本数据类型
		int [] a = new int [5];
		for(int i = 0;i < 5;i++){
			System.out.println(a[i]);
		}
		//a.length获取数组长度
		int [] a1 = new int [5];
		for(int i = 0;i < a1.length;i++){
			System.out.println(a1[i]);
		}
		//引用数据类型
		String [] b = new String [5];
		for(int j = 0;j < 5;j++){
			System.out.println(b[j]);
		}
		boolean [] c = new boolean [5];
		for(int j = 0;j < 5;j++){
			System.out.println(c[j]);
		}
		//静态初始化
		int [] e = {1,2,3,4,5};
		int [] f = new int[]{1,2,3,4,5};
	}
	public static void factor(){
		//数组实例化
        int [] d = new int [5];
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		for(int i = 0;i < d.length;i++){
			System.out.println(d[i]);
		}
	}
	
	public static void main(String[] args){
		//二维数组的初始化
		int [][] h = new int [2][3];
		h[0][0] = 1;
		h[1][1] = 2;
		for(int i= 0;i <h.length;i++){
			for(int j = 0;j < h[i].length;j++){
				System.out.print(h[i][j]+"\t");
			}
		}
		System.out.println();
		//静态初始化
		int [][] l = new int [][]{
		{1,2,3},{2,3,4,6},{1,2,3,6}
		};
		for(int i= 0;i <l.length;i++){
			for(int j = 0;j < l[i].length;j++){
				System.out.print(l[i][j]+"\t");
			}
			System.out.println();
		}
	}
}