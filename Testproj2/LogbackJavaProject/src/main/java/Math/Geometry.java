package Math;


public class Geometry {
	
	public int sq(int i)
	{
		return i*i; 
	}
	public int dist_square(int x1,int y1,int x2,int y2)
	{
		return (sq(x1-x2)+sq(y1-y2));
	}
}


