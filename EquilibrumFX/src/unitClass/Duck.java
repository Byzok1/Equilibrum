package unitClass;

import java.awt.Point;

import controller.Controller;
import actions.Dying;
import actions.Eating;
import actions.HoldingPosition;
import actions.Moving;
import pathfinding.Node;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import unit.Bio;
import unit.Unit;
import unit.UnitAI;
import world.World;

public class Duck extends Bio implements Dying, HoldingPosition, Eating
{
	public Duck(World world, Team team, Point position)
	{
		super(world, position, 10, Direction.LEFT, new UnitAI(world), 10, 10, team, true, World.empty);
	}

	

	@Override
	public void die()
	{
		// TODO Auto-generated method stub

	}

	

	@Override
	public void eat(Ressource ress, int amount)
	{
		// TODO Auto-generated method stub
	
	}

	@Override
	public char toChar()
	{
		// TODO Auto-generated method stub
		return 'd';
	}

	@Override
	public char toCharSelected()
	{
		return 'D';
	}



	@Override
	public void holdPosition()
	{
		// TODO Auto-generated method stub
		
	}

}
