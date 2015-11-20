package terrainClass;

import java.awt.Point;

import tile.Terrain;
import tile.TerrainEntity;

public class Water extends Terrain
{

	public Water(Point pos)
	{
		super(pos,false, false, true, true);
	}
	
	public Water(TerrainEntity entity, Point pos)
	{
		super(entity, pos, false, true, true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public char toChar()
	{
		// TODO Auto-generated method stub
		return'W';
	}

}
