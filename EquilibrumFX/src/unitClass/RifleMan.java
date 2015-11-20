package unitClass;

import java.awt.Point;
import java.util.ArrayList;

import controller.Controller;
import actions.Attacking;
import actions.Calming;
import actions.CarryingUnit;
import actions.Dying;
import actions.Feeding;
import actions.Healing;
import actions.HoldingPosition;
import actions.Moving;
import actions.Sacrificing;
import actions.Suiciding;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Bio;
import unit.BioMech;
import unit.Unit;
import world.World;

public class RifleMan extends BioMech implements Moving, Attacking,
		CarryingUnit, Calming, Dying, Feeding, Healing, HoldingPosition,
		Sacrificing, Suiciding
{
	public RifleMan(Team team, Point pos)
	{
		super(100, 75, team, pos, Controller.getController().getWorld().getTile(pos), World.testRessList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suicide()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacrifice(Unit unit)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void holdPosition()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void heal(Unit unit, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feed(Bio bio, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die()
	{
		// TODO Auto-generated method stub
		
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
		return 'R';
	}

}
