class Business implements Cloneable {
	private String company;
	private String work;

	public Business(String company, String work) {
		this.company=company;
		this.work=work;
	}
	public void showBusinessInfo() {
		System.out.println("ȸ��:" + company);
		System.out.println("����:" + work);
	}
	public void changeInfo(String company, String work) {
		this.company= company;
		this.work=work;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // clone�޼��� �������̵�. ���纻 ����!
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
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
		bz.showBusinessInfo();
	}
	public void changeInfo(String name, int age, String company, String work) {
		this.name=name;
		this.age=age;
		bz.changeInfo(company, work);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		//Object Ŭ������ Clone�޼��� ȣ��, ���纻 ����!
		PersonalInfo cpyInfo = (PersonalInfo)super.clone(); //����ȯ
//		cpyInfo.name = new String(name); //�̸� ��������. ��� String�� ���� ���� �� �ʿ䰡 ����
		cpyInfo.bz = (Business)bz.clone(); // bz ���� ����
		return cpyInfo; //�ϼ��� ���纻 ������ ��ȯ
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