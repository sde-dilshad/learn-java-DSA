package Lec1;

import java.util.*;

public class Grade_card {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();

		if (grade >= 75) {
			System.out.println("A");
		} else if (grade >= 65) {
			System.out.println("B");
		} else if (grade >= 55) {
			System.out.println("C");
		} else if (grade >= 45) {
			System.out.println("D");
		} else {
			System.out.println("Fail");
		}
	}
}
