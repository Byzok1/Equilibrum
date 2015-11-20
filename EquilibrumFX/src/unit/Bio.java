package unit;

import java.awt.Point;
import java.util.ArrayList;

import controller.Controller;
import actions.Moving;
import player.Player;
import player.Team;
import ressource.Ressource;
import tile.TerrainEntity;
import tile.Tile;
import world.World;

public abstract class Bio extends Unit implements Moving
{
	
	public Bio(World world, Point position, int radius, Direction direction, UnitAI ai, int health,
			int energy, Team team, boolean blocking,
			ArrayList<Ressource> buildRessourceList)
	{
		super(world, radius, direction, ai, health, energy, team, position, blocking, buildRessourceList);
		// TODO Auto-generated constructor stub
	}
	private int food;

	@Override
	public void move(int x, int y)
	{
		//if the unit has no path
		if(getAi().getPath() == null || !getAi().getPath().getCoor().equals(new Point(x, y)))
		{
			getAi().setPath(getAi().generatePath(getPosition(), new Point(x, y)));
			moveTo(getAi().getPath().getDestructiveFirst().getCoor());
		}
		if(this.getPosition().equals(getAi().getPath().getFirst().getCoor()))
		{
			moveTo(getAi().getPath().getDestructiveFirst().getCoor());
		}
		if(getAi().getPath().getFirst().getCoor().equals(new Point(x, y)))
		{
			getAi().setPath(null);
		}
		

	}

	@Override
	public void move(Point coor)
	{
		if(getAi().getPath() == null || !getAi().getPath().getCoor().equals(coor))
		{
			getAi().setPath(getAi().generatePath(getPosition(), coor));
			moveTo(getAi().getPath().getDestructiveFirst().getCoor());
		}
		if(this.getPosition().equals(getAi().getPath().getFirst().getCoor()))
		{
			moveTo(getAi().getPath().getDestructiveFirst().getCoor());
		}
		if(getAi().getPath().getFirst().getCoor().equals(coor))
		{
			getAi().setPath(null);
		}
		
	}

	@Override
	public void move(Tile tile)
	{
		

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

	public int getFood()
	{
		return food;
	}
	public void setFood(int food)
	{
		this.food = food;
	}
	

}
