package unitClass;

import java.awt.Point;

import controller.Controller;
import actions.Attacking;
import actions.CarryingRessource;
import actions.CarryingUnit;
import actions.Dying;
import actions.HoldingPosition;
import actions.Moving;
import actions.Suiciding;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Mech;
import unit.Unit;
import world.World;

public class Car extends Mech implements Moving, HoldingPosition, Attacking, CarryingRessource, CarryingUnit, Dying, Suiciding
{
	public Car(Team team, Point pos)
	{
		super(75, 50, team, pos, Controller.getController().getWorld().getTile(pos), World.testRessList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suicide()
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
	public void attack(Unit unit, int damage)
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
	public char toChar()
	{
		// TODO Auto-generated method stub
		return 'C';
	}



}
