package unit;

import java.util.ArrayList;

import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class Structure extends Unit
{

	public Structure(String name, int health, int energy, Team team,
			double posX, double posY, Tile tilePos,
			ArrayList<Ressource> buildRessourceList)
	{
		super(name, health, energy, team, posX, posY, tilePos, buildRessourceList);
		// TODO Auto-generated constructor stub
	}

}
