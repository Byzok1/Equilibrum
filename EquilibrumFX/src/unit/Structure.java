package unit;

import java.awt.Point;
import java.util.ArrayList;

import player.Player;
import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class Structure extends Unit
{


	

	public Structure(int x, int y, int moveCoolDown, UnitAI ai, int health,
			int energy, Team team, Point root,
			Tile tile, ArrayList<Ressource> buildRessourceList)
	{
		super(x, y, moveCoolDown, ai, health, energy, team, root, tile, buildRessourceList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public abstract char toChar();

	@Override
	public abstract char toCharSelected();

}
