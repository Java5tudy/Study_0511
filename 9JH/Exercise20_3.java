package studyJava.studyJava.objects;
import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		if(this.name.equals(p.name))
			return age;
		return 0;
	}
	
	
	@Override
	public String toString() {
		return name+": "+age;
	}
}
public class Exercise20_3 {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee",29);
		ar[1] = new Person("Goo",15);
		ar[2] = new Person("Soo",37);
		
		Arrays.sort(ar);
		
		int idx = Arrays.binarySearch(ar,"Soo");
		System.out.println(ar[idx]);

		
	}
}

