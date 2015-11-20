package unitClass;

import java.awt.Point;

import controller.Controller;
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
import world.World;

public class Warehouse extends Structure implements CarryingRessource,
		CarryingUnit, Dying, Repairing, Suiciding
{
	public Warehouse(Team team, Point pos)
	{
		super(0, 100, 0, team, pos, Controller.getController().getWorld().getTile(pos), World.empty);
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
	public char toChar()
	{
		return 'W';
	}

	@Override
	public char toCharSelected()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
