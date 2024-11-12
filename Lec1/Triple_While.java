package Lec1;

import java.util.*;

public class Triple_While {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(n>i) {
			System.out.println(i);
			while(n>j) {
				System.out.println(j);
				while(n>k) {
					System.out.println(k);
					k++;
				}
				j++;
			}
			i++;
		}
	}
}
