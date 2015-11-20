package actions;

import tile.TerrainEntity;
import tile.Tile;
import unit.Unit;

public interface Moving
{
	public void move(double x, double y);
	public void move(Tile tile);
	public void move(Unit unit);
	public void move(TerrainEntity entity);
}
