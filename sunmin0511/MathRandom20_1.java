import java.util.Random;
import java.util.Scanner;
public class MathRandom20_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("int�� ���� A�� �Է��ϼ���.");
		int A = scan.nextInt();
		System.out.println("int�� ���� B�� �Է��ϼ���.");
		int B = scan.nextInt();
		
		Random ran = new Random();
		for(int i=0; i<10; i++) {
			System.out.println(ran.nextInt(B)+A);
		}
		
	}

}