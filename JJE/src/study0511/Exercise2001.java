package study0511;

import java.util.Random;
import java.util.Scanner;

public class Exercise2001 {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		int A = S.nextInt();
		int Z = S.nextInt();
		
		int max, min;
		if (A>Z) {
			max = A;
			min = Z;
		}
		else {
			max = Z; min = A;
		}
		Random rand = new Random();
		
		for(int i = 0; i<10; i++) {
			System.out.println(rand.nextInt(max-min+1));
		}
	}

}
