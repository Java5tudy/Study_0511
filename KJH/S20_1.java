package may0511;
import java.util.*;

public class S20_1 {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("���� ���� �Է��Ͻÿ� : ");
	int a = s.nextInt();
	System.out.print("ū ���� �Է��Ͻÿ� : ");
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
