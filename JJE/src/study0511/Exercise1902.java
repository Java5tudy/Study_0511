package study0511;

class Business implements Cloneable{
	private String company;
	private String work; 
	
	public Business (String company, String work) {
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo() {
		System.out.println("ȸ�� : "+ company);
		System.out.println("���� : " + work);
	}
}

class PersonalInfo implements Cloneable{
	private String name; 
	private int age;
	private Business bz;
	
	public PersonalInfo(String name, int age, String company, String work) {
		this.name = name;
		this.age = age;
		bz = new Business(company, work);
	}
	public void showPersonalInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		bz.showBusinessInfo();
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}	
}

public class Exercise1902 {
	public static void main(String[] args) {
		PersonalInfo p = new PersonalInfo("������", 5, "�ƾƾ�", "�ƾ�");
		PersonalInfo cpy;
		
		try{
			cpy = (PersonalInfo)p.clone();
			p.showPersonalInfo();
			cpy.showPersonalInfo();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
