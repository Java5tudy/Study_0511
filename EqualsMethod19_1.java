package JavaStudy;

class Point {
	private int xPos; //int�� Ÿ�� ���� xPos, yPos����
	private int yPos;
	@Override
	public boolean equals(Object obj) { //Object class�� equals�޼��� �������̵�
		Point p = (Point)obj;
		if(xPos == p.xPos && yPos ==p.yPos)
			//obj�� objectŸ��. xPos���� �����ϱ� ���� Point Ÿ������ ����ȯ
			//�ּҰ��� �ƴ� ������� ���� ���ϱ� ���ؼ� �������̵�.
			return true;
		else
			return false;
	}
	public Point(int x, int y) { //Point ������, ��ǥ����
		this.xPos=x;
		this.yPos=y;
	}
}

class Rectangle { //Point��(��ǥ��) Ÿ�� ����  upperLeft�� lowerRight ����.
	private Point upperLeft; //�������(xPos��ǥ, yPos��ǥ)
	private Point lowerRight; //�����ϴ�
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(upperLeft.equals(r.upperLeft) && lowerRight.equals(r.lowerRight))
			// ���������� obj�� RectangleŸ������ ����ȯ
			return true;
		else
			return false;
	}
	public Rectangle(int x1, int y1, int x2, int y2) { //4���� int�� ������ ������ �ִ� Rectangle ������.
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
			System.out.println( "p1�� p2�� �ּҰ��� �����ϴ�.");
		else
			System.out.println("p1�� p2�� �ּҰ��� �ٸ��ϴ�.");
		
		if(p1.equals(p2))
			System.out.println("p1�� p2�� ��ǥ�� �����ϴ�.");
		else
			System.out.println("p1�� p2�� ��ǥ�� �ٸ��ϴ�.");
		if(r1 == r2)
			System.out.println( "r1�� r2�� �ּҰ��� �����ϴ�.");
		else
			System.out.println("r1�� r2�� �ּҰ��� �ٸ��ϴ�.");
		
		if(r1.equals(r2))
			System.out.println("r1�� r2�� ��ǥ�� �����ϴ�.");
		else
			System.out.println("r1�� r2�� ��ǥ�� �ٸ��ϴ�.");



	}

}
