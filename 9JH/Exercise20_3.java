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
		return this.name.compareTo(p.name);
		/* 문자열 비교 
		 * a=a : 0
		 * a>b : 1 (좌측 값이 큰 경우)
		 * b<a : -1 (좌측 값이 작은 경우) */
		
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
		
		int idx = Arrays.binarySearch(ar,new Person("kee",29));
		//29는 배열내에 존재하지만 탐색기준인 'kee'가 없으므로 에러
		System.out.println(ar[idx]);

	}
}
