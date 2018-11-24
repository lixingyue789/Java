//打印乘法口诀
public class Factor{
	public static void main(String[] args){
		int row = 1;
		int col = 1;
		int sum = 1;
		for(row = 1;row < 10;row++){
			for(col = 1;col <= row;col++){
				sum = row * col;
				System.out.print(row + "*" + col + "=" + sum +"\t");
			}
			System.out.println();
		}
	}
}