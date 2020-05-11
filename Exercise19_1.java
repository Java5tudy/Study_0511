package studyJava.studyJava.objects;
/***
 * 아래의 Point 클래스와 Rectangle클래스에 내용 비교를 위한 equals메소드를 각각 삽입하자.
 * 그리고 정의한 equals메소드의 확인을 위한 main메소드도 직접 정의하자.
 * @author kate
 */
class Point {
	private int xPos;
	private int yPos;
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.xPos==((Point)obj).xPos)
			return true;
		if(this.yPos==((Point)obj).yPos)
			return true;
		else
			return false;
	}
}
class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
		
		if(upperLeft==((Rectangle)obj).upperLeft)
			return true;
		if(lowerRight==((Rectangle)obj).lowerRight)
			return true;
		else
			return false;	
	}
}

public class Exercise19_1 {

	public static void main(String[] args) {
		Object upperLeft1 = new Point(3,4);
		Point upperLeft2 = new Point(3,4);
		
		if(upperLeft1.equals(upperLeft2))
			System.out.println("이렇게 하면 되는건가?");
		else
			System.out.println("정말 어려워!");
		
		if(upperLeft1==upperLeft2)
			System.out.println("이럴수가...");
		else
			System.out.println("두시간도 더걸렸어");
	}

}
