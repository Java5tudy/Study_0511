/*
 * 이름의 길이로 정렬하기
 */

package study0511;

import java.util.Arrays;

class Person1 implements Comparable{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.name = name; 
		this.age = age;
	}
	@Override
	public int compareTo(Object o) { // length()를 사용해, 이름이 길이를 추출. 
		Person1 p = (Person1)o;
		if(this.name.length() > p.name.length())
			return -1;
		else if(this.name.length() < p.name.length())
			return 1;
		else 
			return 0;
	}
	@Override
	public String toString() {
		return name + ": " +age; 
	}
}

public class Exercise200202 {
	public static void main(String[] args) {
		Person1[] ar = new Person1[3];
		ar[0] = new Person1("le", 29);
		ar[1] = new Person1("goooooo", 15);
		ar[2] = new Person1("soooo", 37);
		
		Arrays.sort(ar);
		for(Person1 p : ar)
			System.out.println(p);
	}

}
