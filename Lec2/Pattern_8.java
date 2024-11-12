package Lec2;
import java.util.*;
public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space1 = 0;
		int space2 = n-2;
		
		while(row<= n) {
			// space
			int i = 1;
			while(i<= space1) {
				System.out.print("  ");
				i++;
			}

			// star
			System.out.print("* ");

			// space
			int j = 1;
			while(j<= space2) {
				System.out.print("  ");
				j++;
			}
			// star
			if(row != n/2 + 1) {
			System.out.print("* ");
			}
			// mirror
			// next line
			if(row <= n/2) {
				space1++;
				space2-=2;
			} else {
				space1--;
				space2+=2;
			}
			row++;
			System.out.println();
		}
	}

}
