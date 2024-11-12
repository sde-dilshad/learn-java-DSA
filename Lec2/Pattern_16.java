package Lec2;
import java.util.*;

public class Pattern_16 {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = n - 1;
		
		while(row <= (n*2) -1) {
			// Space
			int i = 1;
			while(i<= space) {
				System.out.print("  ");
				i++;
			}
			// Star
			int j = 1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			// Row
			row++;
			if(row > n) {				
				star++;
				space++;
			} else {
				space--;
				star--;
			}
			System.out.println();
		}
		
	}
}
