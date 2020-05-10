package study0511;

class point{
	private int xPos;
	private int yPos;
	
	public point(int x, int y) {
		xPos = x; 
		yPos = y; 
	}
	@Override
	public boolean equals(Object obj) {
		if(xPos == ((point)obj).xPos && yPos==((point)obj).yPos)
			return true;
		else
			return false;
	}
}
class Rectangle{
	private point upperleft;
	private point lowerright;
	
	public Rectangle(int x1, int  y1, int x2, int y2) {
		upperleft = new point(x1, y1);
		lowerright = new point(x2, y2);
	}
	@Override
	public boolean equals(Object obj) {
		if(upperleft == ((Rectangle)obj).upperleft && lowerright == ((Rectangle)obj).lowerright)
			return true;
		else
			return false;
	}
}


public class Exercise1901 {
	public static void main(String[] args) {
		point p1 = new point(3,4);
		point p2 = new point(3,4);
		
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(1,2,3,4);
		
		if(p1.equals(p2))
			System.out.println("내용이 동일하다");
		else
			System.out.println("내용이 다르다");
		
		if(r1.equals(r2))
			System.out.println("내용이 동일하다");
		else
			System.out.println("내용이 다르다");

	}

}
