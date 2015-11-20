package unitClass;

import java.util.ArrayList;

import actions.CarryingRessource;
import actions.CarryingUnit;
import actions.Dying;
import actions.Repairing;
import actions.Suiciding;
import player.Team;
import ressource.Ressource;
import tile.Tile;
import unit.Mech;
import unit.Structure;
import unit.Unit;

public class Warehouse extends Structure implements CarryingRessource, CarryingUnit, Dying, Repairing, Suiciding
{

	public Warehouse(String name, int health, int energy, Team team,
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
	public void repair(Mech mech, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Unit unit)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Ressource ress)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Ressource ress, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Structure struct)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropOff()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropOff(double x, double y)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropOff(Tile tile)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dropOff(Structure struct)
	{
		// TODO Auto-generated method stub
		
	}

}
