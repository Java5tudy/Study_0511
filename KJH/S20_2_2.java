package may0511;
import java.util.Arrays;

class Person1 implements Comparable {
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person1 p = (Person1)o;
		return this.name.length() - p.name.length();
		
	}
	@Override
	public String toString() {
		return name + ": " + age;
	}
}
public class S20_2_2 {
	public static void main(String[] args) {
		Person1[] ar = new Person1[3];
		ar[0] = new Person1("LeeSunShin", 29);
		ar[1] = new Person1("Gsadfasdfasdfasdfasdfoo", 15);
		ar[2] = new Person1("SooNaedasdfas", 37);
		
		Arrays.sort(ar);
		for(Person1 p : ar) {
			System.out.println(p);
		}
	}

}