package unitClass;

import java.awt.Point;

import controller.Controller;
import actions.Dying;
import actions.Eating;
import actions.HoldingPosition;
import actions.Moving;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Bio;
import unit.Unit;
import world.World;

public class Bird extends Bio implements Moving, Dying, HoldingPosition, Eating
{
	public Bird(Team team, Point pos)
	{
		super(100, 75, team, pos, Controller.getController().getWorld().getTile(pos), World.testRessList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void holdPosition()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die()
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
	public void eat(Ressource ress, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char toChar()
	{
		// TODO Auto-generated method stub
		return 'b';
	}



	

	



}
