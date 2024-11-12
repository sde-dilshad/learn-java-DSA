package Lec1;
import java.util.*;
public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println(sc);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		
		int interest = (p * r * t)/100;
		
		System.out.println(interest);
	}

}
