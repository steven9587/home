package student;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		double answer = 3.5;
		
		System.out.println("請輸入3.5的k次方=");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		double k = Double.parseDouble(line);
		
		if(k==0) {
			System.out.println(answer*0);
		}
		
		if(k>0) {
			for(int a = 1;a<k;a++)
				answer =answer*answer; 
			System.out.println(answer);
		}
		
		if(k==-1) {
				answer =(1/answer); 
			System.out.println(answer);
		}
		
		if(k<-1) {
			for(int b =-1;b>k;b--)
			answer =(1/answer)*(1/answer); 
		System.out.println(answer);
	}
		
	}

}
