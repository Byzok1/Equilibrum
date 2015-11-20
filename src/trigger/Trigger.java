package trigger;

import java.awt.Point;
import java.util.ArrayList;

import world.World;


public abstract class Trigger
{
	private int height, width;
	private Point root;
	private ArrayList<Point> area;
	private World world;

	public Trigger(World world, Point pos)
	{
		this.world = world;
		this.area = new ArrayList<Point>();
		this.root = pos;
		this.area.add(new Point(root.x, root.y));
	}
	
	public Trigger(World world, Point pos,int x, int y)
	{
		this.world = world;
		this.area = new ArrayList<Point>();
		this.root = pos;
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < height; j++)
			{
				this.area.add(new Point(root.x + i, root.y + j));
			}
		}
	}
	
	public abstract boolean condition();
	
	public abstract void execute();

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int height)
	{
		this.height = height;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public Point getRoot()
	{
		return root;
	}

	public void setRoot(Point root)
	{
		this.root = root;
	}

	public ArrayList<Point> getArea()
	{
		return area;
	}

	public void setArea(ArrayList<Point> area)
	{
		this.area = area;
	}

	public abstract char toChar();

	public World getWorld()
	{
		return world;
	}

	public void setWorld(World world)
	{
		this.world = world;
	}
}
