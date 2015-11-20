package actions;

import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Structure;

public interface CarryingRessource
{
	public void pickUp(Ressource ress);
	public void pickUp(Ressource ress, int amount);
	public void pickUp(Structure struct);
	public void dropOff();
	public void dropOff(double x, double y);
	public void dropOff(Tile tile);
	public void dropOff(Structure struct);
}
