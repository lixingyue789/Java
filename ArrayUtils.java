public class ArrayUtils{
	
	public static void printArray(int [] a){
		if(a == null){
			return;
		}
		for(int i = 0;i < a.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

    //1.计算数组中最大值
    public static int arrayMaxElement(int [] data){
		if(data == null){
			//lllegalArgumentExpection参数异常
			throw new IllegalArgumentException("data must be not null");
		}
        int max = Integer.MIN_VALUE;
		for(int i = 0;i < data.length;i++){
		   if(data[i] > max){
			    max = data[i];
		    }
		}                   
		return max;
    }
    
    //2.计算数组中最小值
    public static int arrayMinElement(int [] data){
		if(data == null){
			throw new IllegalArgumentException("data must be not null");
		}
        int min = Integer.MAX_VALUE;
		for(int i=0;i<data.length;i++){
		  if(data[i]<min)
		  min=data[i];
		}
		return min;
    }
    
    
    //3.计算数组值之和
    public static int arrayElementSum(int [] data){
		if(data == null){
			throw new IllegalArgumentException("data must be not null");
		}
        int sum = 0;
		for(int i = 0;i < data.length;i++){
			sum = sum + data[i];
		}
		return sum;
    }
    
    //4.数组拼接
    public static int[] arrayJoin(int[] a, int[] b){
		if(a == null){
			throw new IllegalArgumentException("a must be not null");
		}
		if(b == null){
			throw new IllegalArgumentException("b must be not null");
		}
		int len = a.length + b.length;
		int [] c = new int [len];
		for(int i = 0;i < a.length;i++){
			c[i] = a[i];
		}
		for(int j = a.length;j < c.length;j++){
			c[j] = b[j-a.length];
		}
		return c;
    }

    //5.数组截取
    //[start, end)
    public static int[] arraySub(int[] a, int start , int end){
		if(a == null){
			throw new IllegalArgumentException("a must be not null");
		}
		if(start < 0 || end < 0){
			throw new IllegalArgumentException("start or end must be > 0");
		}
		if(end < start){
			throw new IllegalArgumentException("end > start");
		}
		if(start > a.length){
			throw new IllegalArgumentException("start must be < a.length");
		}
        int count = end - start;
		if(count > a.length){
			throw new IllegalArgumentException("sub.length must be <= a.length");
		} 
		int [] b = new int [count];
		for(int i = start;i < end;i++){
			b[i -start] = a[i];
		}
		return b;
    }
    
    
    public static void main(String[] args){
		int [] a = new int []{23,45,76,98,34};
		int [] b = new int []{2,3,4};
        int max = arrayMaxElement(a);
		System.out.println(max);
		int min = arrayMinElement(a);
		System.out.println(min);
		int sum = arrayElementSum(a);
		System.out.println(sum);
		int [] access = arrayJoin(a,b);
		printArray(access);
        int [] sub = arraySub(a,0,5);
		printArray(sub);
        
    }
}