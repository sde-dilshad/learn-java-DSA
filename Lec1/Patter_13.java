package Lec1;

import java.util.*;
public class Patter_13 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(n>i) {
			int j = 1;
			String x = "*";
			while(i>j) {
				x = x + " *";
				j++;
			}
			i++;
			System.out.println(x);
		}
		
		while(i>0) {
			int j = i;
			String x = "";
			while(j>0) {
				x = x + "* ";
				j--;
			}
			i--;
			System.out.println(x);
		}
	}

}
