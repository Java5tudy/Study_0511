/*
 * 탐색의 기준을 이름으로 변경하시오
 */

package study0511;

import java.util.Arrays;

class Person2 implements Comparable{
	private String name;
	private int age; 
	
	public Person2(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.name.compareTo(p.name); // 이름을 비교하기
	}
	@Override
	public String toString() {
		return name + " : " +age;
	}
}

public class Exercise2003 {
	public static void main(String[] args) {
		Person2[] ar = new Person2[3];
		ar[0] = new Person2("lee", 29);
		ar[1] = new Person2("goo", 15);
		ar[2] = new Person2("soo", 37);
		
		int idx = Arrays.binarySearch(ar, new Person2("goo",49));
		System.out.println(ar[idx]);
	}
}
