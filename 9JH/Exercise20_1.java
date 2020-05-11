package studyJava.studyJava.objects;
import java.util.Scanner;
import java.util.Random;
/***
 * 프로그램 사용자로부터 임의의 정수 A 와 Z를 입력받는다. 
 * A와 Z 사이에 있는 난수 10개를 생성하여 출력하는 프로그램을 작성해 보자.
 * @author kate
 */
public class Exercise20_1 {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a :");
		int num1 = sc.nextInt();
		System.out.print("z :");
		int num2 = sc.nextInt();
		
		System.out.println("a~z 임의의 난수 10개!");
		
		Random rand = new Random();
		for(int i=0;i<10;i++)
			System.out.printf("%d/",rand.nextInt(num2-num1+1)+num1);
		
		sc.close();
	}
}
