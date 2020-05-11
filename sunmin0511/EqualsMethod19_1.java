package JavaStudy;

class Point {
	private int xPos; //int형 타입 변수 xPos, yPos선언
	private int yPos;
	@Override
	public boolean equals(Object obj) { //Object class의 equals메서드 오버라이딩
		Point p = (Point)obj;
		if(xPos == p.xPos && yPos ==p.yPos)
			//obj는 object타입. xPos값을 참조하기 위해 Point 타입으로 형변환
			//주소값이 아닌 멤버변수 값을 비교하기 위해서 오버라이딩.
			return true;
		else
			return false;
	}
	public Point(int x, int y) { //Point 생성자, 좌표역할
		this.xPos=x;
		this.yPos=y;
	}
}

class Rectangle { //Point형(좌표형) 타입 변수  upperLeft와 lowerRight 선언.
	private Point upperLeft; //좌측상단(xPos좌표, yPos좌표)
	private Point lowerRight; //우측하단
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			// 마찬가지로 obj를 Rectangle타입으로 형변환
			return true;
		else
			return false;
	}
	public Rectangle(int x1, int y1, int x2, int y2) { //4개의 int형 변수를 가지고 있는 Rectangle 생성자.
		upperLeft = new Point (x1, y1);
		lowerRight = new Point (x2, y2);
	}
}

public class EqualsMethod19_1 {
	public static void main(String[] args) {
		
		Point p1 = new Point(10, 7);
		Point p2 = new Point(10, 7);
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(1,2,3,4);

		
		if(p1 == p2)
			System.out.println( "p1과 p2는 주소값이 같습니다.");
		else
			System.out.println("p1과 p2는 주소값이 다릅니다.");
		
		if(p1.equals(p2))
			System.out.println("p1과 p2는 좌표가 같습니다.");
		else
			System.out.println("p1과 p2는 좌표가 다릅니다.");
		if(r1 == r2)
			System.out.println( "r1과 r2는 주소값이 같습니다.");
		else
			System.out.println("r1과 r2는 주소값이 다릅니다.");
		
		if(r1.equals(r2))
			System.out.println("r1과 r2는 좌표가 같습니다.");
		else
			System.out.println("r1과 r2는 좌표가 다릅니다.");



	}

}
