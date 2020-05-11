package studyJava.studyJava.objects;
/***
 * 다음 클래스 정의에서 PersonalInfo의 clone메소드 호출 시 깊은 복사가 이뤄지도록 
 * clone메소드를 오버라이딩 하자 
 * @author kate
 */
class Business implements Cloneable{
	private String company;
	private String work;
	public Business (String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("회사 : "+company);
		System.out.println("업무 : "+work);
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		Business cp1 = (Business)super.clone();
		cp1.company = new String(company);
		cp1.work = new String(work);
		return cp1;
	}
}
class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bz;
	public PersonalInfo(String name, int age, String company, String work) {
		this.name=name;
		this.age=age;
		bz = new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		bz.showBusinessInfo();
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return (PersonalInfo)(super.clone());
		
	}
}
public class Exercise19_2 {

	public static void main(String[] args) {
		PersonalInfo person = new PersonalInfo("홍길동",493,"구글코리아","복사");
		PersonalInfo human;
		
		try {
			human = (PersonalInfo)person.clone();
			human.showPersonalInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
