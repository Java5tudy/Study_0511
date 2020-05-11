

import java.lang.reflect.Array;
import java.util.Arrays;

class PersonName implements Comparable {
	private String name;
	private int age;
	public PersonName(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Object o) {
		PersonName p = (PersonName)o;
		return this.name.length()-p.name.length();
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
}
public class ArrayObjSearch20_3 {
	public static void main(String[] args) {
		PersonName[] ar = new PersonName[3];
		ar[0] = new PersonName("Lily", 29);
		ar[1] = new PersonName("George", 15);
		ar[2] = new PersonName("Sam", 37);
		Arrays.sort(ar);
		int idx = Arrays.binarySearch(ar, new PersonName("Lily", 0));
		System.out.println(ar[idx]);
	}

}
