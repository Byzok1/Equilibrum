package terrainEntityClass;

import java.awt.Point;

import player.Team;
import tile.TerrainEntity;
import world.World;

public class Tree extends TerrainEntity
{
	public Tree(Point pos)
	{
		super(1, 1, pos, World.NEUTRAL, 0, true, false, true,
				World.empty);
	}

	public Tree(int x, int y)
	{
		super(1, 1, new Point(x, y), World.NEUTRAL, 0, true, false, true, World.testRessList);
	}

	@Override
	public char toChar()
	{
		return 't';
	}

	@Override
	public char toCharSelected()
	{
		// TODO Auto-generated method stub
		return 'T';
	}

}
