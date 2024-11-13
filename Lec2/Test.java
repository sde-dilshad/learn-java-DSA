package Lec2;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row = 1;
	        int star = n;
	        int space = n-2;

	        int i =1;
	        while(i<=star){
	            System.out.print("*");
	            i++;
	        }
	        System.out.println();

	        while(row <= n - 2){
	            int k =1;
	            while(k<=space){
	                System.out.print(" ");
	                k++;
	            }
	            System.out.print("*");
	            space--;
	            System.out.println();
	            row++;
	        }

	        int j = 1;
	        while(j<=star){
	            System.out.print("*");
	            j++;
	        }
	}

}


