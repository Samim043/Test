
public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	public Point()
	{
		this(1,1);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString()
	{
		String s="Akhi";
		System.out.println("This is toString Method");
		return s;
	}
	public double distance(Point point)
	{
		double d=12.5;
		System.out.println("This is distance Method");
		return d;
	}
}
