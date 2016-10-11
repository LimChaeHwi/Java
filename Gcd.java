package day3_3;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		System.out.println("gcd(2,5) -> " + gcd(2, 5));
		System.out.println("gcd(5,15) -> " + gcd(5, 15));
		System.out.println("gcd(250,30) -> " + gcd(250, 30));
	}
	public static int gcd(int a, int b){
		int large = 0;	//Å«¼ö (¹üÀ§)
		int gcd = 1;	//ÃÖ´ë°ø¾à¼ö
		
		if(a<b)
			large = b;
		else
			large = a;
		
		for(int i=1;i<large;i++){
			if(a%i==0 && b%i==0){
				gcd = i;
			}
		}
		return gcd;
	}
}
