
public class Line {

	private Point start = new Point();
	private Point end = new Point();
	
	public Line(Point start, Point end)
	{
		this.start=start;
		this.end= end;
	}
	
	public Line (int x1,int y1, int x2,int y2)
	{
		start.setX(x1);
		start.setY(y1);
		end.setX(x2);
		end.setY(y2);
	}
	
	public Point getStart()
	{
		return start;
	}
	
	public Point getEnd()
	{
		return end;
	}
	public void setStart(Point start)
	{
		this.start=start;
	}
	
	public void setEnd(Point end)
	{
		this.end=end;
	}
	public double length()
	{
		double length = 23.344;
		System.out.println("This is a method for calculating the length of a line");
		return length;
	}
	
	
	public static void main(String args[])
	{
		Line line = new Line(2,3,4,5);
		line.length();
	}
}

