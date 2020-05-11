class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company=company;
		this.work=work;
	}
	public void showBusinessInfo() {
		System.out.println("회사:" + company);
		System.out.println("업무:" + work);
	}
	public void changeInfo(String company, String work) {
		this.company= company;
		this.work=work;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // clone메서드 오버라이딩. 복사본 생성!
	}
}

class PersonalInfo implements Cloneable {
	private String name;
	private int age;
	private Business bz; //Business bz = new Business(company, work) 

	public PersonalInfo(String name, int age, String company, String work) {
		this.name=name;
		this.age=age;
		bz=new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("이릅:"+name);
		System.out.println("나이:"+age);
		bz.showBusinessInfo();
	}
	public void changeInfo(String name, int age, String company, String work) {
		this.name=name;
		this.age=age;
		bz.changeInfo(company, work);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		//Object 클래스의 Clone메서드 호출, 복사본 생성!
		PersonalInfo cpyInfo = (PersonalInfo)super.clone(); //형변환
//		cpyInfo.name = new String(name); //이름 깊은복사. 사실 String은 깊은 복사 할 필요가 없음
		cpyInfo.bz = (Business)bz.clone(); // bz 깊은 복사
		return cpyInfo; //완성된 복사본 참조값 반환
	}
}
public class Clone19_2 {
	public static void main(String[] args) {
		PersonalInfo info = new PersonalInfo("John", 28, "IBM", "Marketing");
		PersonalInfo cpyInfo;
		try {
			cpyInfo = (PersonalInfo)info.clone();
			info.changeInfo("Jenny", 30, "Google", "Development");
			info.showPersonalInfo();
			cpyInfo.showPersonalInfo();
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

} 