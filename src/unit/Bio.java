package unit;

import java.util.ArrayList;

import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class Bio extends Unit
{
	private int food;
	public Bio(String name, int health, int energy, Team team, double posX,
			double posY, Tile tilePos, ArrayList<Ressource> buildRessourceList,
			int food)
	{
		super(name, health, energy, team, posX, posY, tilePos,
				buildRessourceList);
		this.food = food;
	}
	public int getFood()
	{
		return food;
	}
	public void setFood(int food)
	{
		this.food = food;
	}
	

}
