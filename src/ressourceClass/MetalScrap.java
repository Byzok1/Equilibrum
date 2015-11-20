package ressourceClass;

import java.awt.Point;

import ressource.Ressource;

public class MetalScrap extends Ressource
{
	public MetalScrap(int x, int y, int amount)
	{
		super(new Point(x, y), amount);
	}

	public MetalScrap(Point point, int amount)
	{
		super(point, amount);
		// TODO Auto-generated constructor stub
	}

}
