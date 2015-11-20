package unit;

import java.awt.Point;

import controller.Controller;
import pathfinding.Node;
import pathfinding.Pathfinding;
import world.World;

public class UnitAI
{
	private Node path;
	private World world;
	
	public UnitAI(World world)
	{
		this.world = world;
	}

	public Node getPath()
	{
		return path;
	}

	public void setPath(Node path)
	{
		this.path = path;
	}
	
	public Node generatePath(Point start, Point end)
	{
		
		return Pathfinding.getPath(start, end, world);
	}

	public World getWorld()
	{
		return world;
	}

	public void setWorld(World world)
	{
		this.world = world;
	}
}
