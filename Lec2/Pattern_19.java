package Lec2;
import java.util.*;
public class Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n/2 +1;
		int space = -1;
		
		while(row <= n) {
			//star
			int i = 1;
			if(row == 1 || row == n) {
				i = 2;
			}
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			//space
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			//star
			int k = 1;
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			//net row
			System.out.println();
			if(row <= n/2) {
				star--;
				space+=2;
			} else {
				star++;
				space-=2;
			}
			row++;
		}
	}

}
