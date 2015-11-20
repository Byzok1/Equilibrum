package actions;

import tile.Tile;
import unit.Structure;
import unit.Unit;

public interface CarryingUnit
{
	public void pickUp(Unit unit);
	public void dropOff();
	public void dropOff(double x, double y);
	public void dropOff(Tile tile);
}
