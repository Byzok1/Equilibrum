package unitClass;

import java.util.ArrayList;

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

public class Bird extends Bio implements Moving, Dying, HoldingPosition, Eating
{

	public Bird(String name, int health, int energy, Team team, double posX,
			double posY, Tile tilePos, ArrayList<Ressource> buildRessourceList,
			int food)
	{
		super(name, health, energy, team, posX, posY, tilePos, buildRessourceList, food);
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
	public void move(double x, double y)
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
	public void eat(Ressource ress, int amount)
	{
		// TODO Auto-generated method stub
		
	}

	

	



}
