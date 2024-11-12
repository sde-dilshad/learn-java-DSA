package Lec1;
import java.util.*;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Gives Vote");
		} else {
			System.out.println("Won't give Vote");
		}
	}

}
