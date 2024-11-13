package Lec2;
import java.util.*;

public class Pattern_Hard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n/2;
		int val = 1;
		
		while(row <= n) {
			int val2 = val;
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while(j<=star) {
				System.out.print(val2 + " ");
				if(j<= star/2) {
					val2++;
				} else {
					val2--;
				}
				j++;
			}
			
			if(row<= n/2) {
				space--;
				star+=2;
			} else {
				space++;
				star-=2;
			}
			
			
			row++;
			val++;
			System.out.println();
		}
	}

}
