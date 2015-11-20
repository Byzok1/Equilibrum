package unitClass;

import java.util.ArrayList;

import actions.Dying;
import actions.Healing;
import actions.Suiciding;
import player.Team;
import ressource.Ressource;
import tile.Tile;
import unit.Structure;
import unit.Unit;

public class MedicalStation extends Structure implements Dying, Healing, Suiciding
{

	public MedicalStation(String name, int health, int energy, Team team,
			double posX, double posY, Tile tilePos,
			ArrayList<Ressource> buildRessourceList)
	{
		super(name, health, energy, team, posX, posY, tilePos, buildRessourceList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suicide()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal(Unit unit, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die()
	{
		// TODO Auto-generated method stub
		
	}

}
