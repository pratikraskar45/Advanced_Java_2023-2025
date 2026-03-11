package practice;

import java.util.Scanner;

public class Factors {
	public static void isfactor(int n) {
		for (int i = 1; i<=n; i++) {
			if (n%i==0) {
				System.out.println(i+"");
				
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		isfactor(n);
	}

}
