package unit;

import java.awt.Point;
import java.util.ArrayList;

import player.Player;
import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class BioMech extends Unit
{
	
	private int stress;

	public BioMech(int x, int y, int moveCoolDown, UnitAI ai, int health,
			int energy, Team team, Point root,
			Tile tile, ArrayList<Ressource> buildRessourceList)
	{
		super(x, y, moveCoolDown, ai, health, energy, team, root, tile,
				buildRessourceList);
		// TODO Auto-generated constructor stub
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
