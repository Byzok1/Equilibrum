package unitClass;

import java.awt.Point;
import java.util.ArrayList;

import controller.Controller;
import actions.Calming;
import actions.CarryingRessource;
import actions.CarryingUnit;
import actions.Dying;
import actions.Feeding;
import actions.HoldingPosition;
import actions.Moving;
import actions.Repairing;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Bio;
import unit.BioMech;
import unit.Mech;
import unit.Unit;
import world.World;

public class Worker extends BioMech implements CarryingRessource, Moving,
		HoldingPosition, Dying, Repairing, Feeding, CarryingUnit, Calming
{
	public Worker(Team team, Point pos)
	{
		super(50, 45, team, pos, Controller.getController().getWorld().getTile(pos), World.testRessList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calm(BioMech bioMech, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pickUp(Unit unit)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed(Bio bio, int amount)
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
	public void holdPosition()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(int x, int y)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(Tile tile)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(Unit unit)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move(TerrainEntity entity)
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
		// TODO Auto-generated method stub
		return 'W';
	}

}
