package Lec2;
import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int row = 1;
		int star = (n * 2) - 1;
		int space = 0;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while(j<= star) {
				if(j%2 != 0) {
					System.out.print("* ");
				} else {
					System.out.print("! ");
				}
				
				j++;
			}
			
			System.out.println();
			star -= 2; 
			row++;
			space++;
		}
	}

}
