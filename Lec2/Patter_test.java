package Lec2;
import java.util.Scanner;

public class Patter_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n - 1;
		int rows = 1;
		
		while(rows <= n) {
			int i = 1;
			while(i<= space) {
				System.out.print("  ");
				i++;
			}
			
			int j = 1;
			while(j<= star) {
				System.out.print("* ");
				j++;
			}
			
			rows++;
			space--;
			star += 2;
			System.out.println();
		}
	}

}
