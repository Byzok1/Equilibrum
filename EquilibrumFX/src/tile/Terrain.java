package tile;

import java.awt.Point;

import controller.Controller;

public abstract class Terrain
{
	private TerrainEntity entity;
	private Point pos;
	private boolean blocking;
	private boolean isWater, isGround, isAir;
	
	public Terrain(Point pos,boolean blocking, boolean isWater, boolean isGround, boolean isAir)
	{
		this.blocking = blocking;
		this.pos = pos;
		this.isWater = isWater;
		this.isGround = isGround;
		this.isAir = isAir;
	}
	
	public Terrain(TerrainEntity entity, Point pos, boolean isWater, boolean isGround,
			boolean isAir)
	{
		this.entity = entity;
		this.isWater = isWater;
		this.isGround = isGround;
		this.isAir = isAir;
	}
	public TerrainEntity getEntity()
	{
		return entity;
	}
	public void setEntity(TerrainEntity entity)
	{
		this.entity = entity;
	}
	
	public abstract char toChar();

	public Point getPos()
	{
		return pos;
	}

	public void setPos(Point pos)
	{
		this.pos = pos;
	}

	public boolean isBlocking()
	{
		return blocking;
	}

	public void setBlocking(boolean blocking)
	{
		this.blocking = blocking;
	}

	public boolean isWater()
	{
		return isWater;
	}

	public void setWater(boolean isWater)
	{
		this.isWater = isWater;
	}

	public boolean isGround()
	{
		return isGround;
	}

	public void setGround(boolean isGround)
	{
		this.isGround = isGround;
	}

	public boolean isAir()
	{
		return isAir;
	}

	public void setAir(boolean isAir)
	{
		this.isAir = isAir;
	}
}
