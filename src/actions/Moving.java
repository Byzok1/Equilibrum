package actions;

import java.awt.Point;

import tile.TerrainEntity;
import tile.Tile;
import unit.Unit;

public interface Moving
{
	public void move(int x, int y);
	public void move(Point coor);
	public void move(Tile tile);
	public void move(Unit unit);
	public void move(TerrainEntity entity);
}
