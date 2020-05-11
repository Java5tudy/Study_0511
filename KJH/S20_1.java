package may0511;
import java.util.*;

public class S20_1 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("작은 값을 입력하시오 : ");
	int a = s.nextInt();
	System.out.print("큰 값을 입력하시오 : ");
	int z = s.nextInt();
	Random r = new Random();
	for(int i = 0; i<10; i++) {
		int x = r.nextInt(1000);
		if(a<x && z>x) {
			System.out.println(x);
			}
		else {
			i--;
		}
		}
	}	
}
