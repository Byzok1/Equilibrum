package unit;

import java.util.ArrayList;

import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class BioMech extends Unit
{
	private int stress;
	public BioMech(String name, int health, int energy, Team team, double posX,
			double posY, Tile tilePos, ArrayList<Ressource> buildRessourceList,
			int stress)
	{
		super(name, health, energy, team, posX, posY, tilePos,
				buildRessourceList);
		this.stress = stress;
	}
	public int getStress()
	{
		return stress;
	}
	public void setStress(int stress)
	{
		this.stress = stress;
	}

}
