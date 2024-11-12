package Lec1;

public class Number_Swap_without_temp {
	public static void main(String[] args) {
		int x = 9;
		int y = 4;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(y);
//		System.out.println(y);
	}
}
