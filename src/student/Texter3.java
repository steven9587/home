package student;

public class Texter3 {
	
	public static void main(String[] args) {

		for (int i = 0; i <= 25; i++) {
			//´«¦æ
			if (i % 8 == 0) {
				System.out.println();
			}
			System.out.print(fib(i) + "\t");
		}
		System.out.print("......");
	}

	public static int fib(int n) {
		if(n==0||n==1) {
			return n; 
		}else {
			return fib(n-1)+fib(n-2);
		}
			
	}

}
