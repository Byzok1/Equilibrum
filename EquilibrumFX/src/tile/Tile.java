package tile;

import java.awt.Point;

import terrainClass.Land;
import world.World;

public class Tile
{
	/**
	 * the floating size of a tile in both X and Y, meaning tiles are square
	 * shaped. COULD be realted to pixel size
	 */
	public static final int FLOATING_SIZE = 50;
	private Point pos;
	private boolean exist;
	private Terrain terrain;
	private World world;

	public Tile(World world, Point p)
	{
		this.world = world;
		this.pos = p;
		this.exist = true;
		this.terrain = new Land(p);
	}

	public Tile(World world, Point pos, boolean exist, Terrain terrain)
	{
		this.world = world;
		this.pos = pos;
		this.exist = exist;
		this.terrain = terrain;
	}

	public boolean exist()
	{
		return exist;
	}

	public void setExist(boolean exist)
	{
		this.exist = exist;
	}

	public Terrain getTerrain()
	{
		return terrain;
	}

	public void setTerrain(Terrain terrain)
	{
		this.terrain = terrain;
	}

	public char toChar()
	{
		char ans = 'X';

		if (exist)
		{
			ans = 'O';
		}
		return ans;
	}

	public Point getPos()
	{
		return pos;
	}

	public void setPos(Point pos)
	{
		this.pos = pos;
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
