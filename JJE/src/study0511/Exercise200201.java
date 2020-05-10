/*
 * 나이를 역순으로 정렬
 */

package study0511;

import java.util.Arrays;

class Person implements Comparable{
	String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	@Override
	public int compareTo(Object o) { // 리턴 값을 반대로 줌으로써, 반대로 정렬이 되도록함
		Person p = (Person)o;
		if(this.age > p.age)
			return -1;
		else if(this.age < p.age)
			return 1;
		else 
			return 0;
	}
	@Override
	public String toString() {
		return name + ": " +age; 
	}
}

public class Exercise200201 {
	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("lee", 29);
		ar[1] = new Person("goo", 15);
		ar[2] = new Person("soo", 37);
		
		Arrays.sort(ar);
		for(Person p : ar)
			System.out.println(p);
	}
}
