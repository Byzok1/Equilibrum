package player;

import java.awt.Point;
import java.util.ArrayList;

import controller.Controller;
import unit.Unit;
import world.World;

public class Player
{
	private World world;
	private ArrayList<Unit> selection;
	private String name;
	private Team team;
	private boolean human;
	private AI ai;
	
	public Player()
	{
		this.selection = new ArrayList<Unit>();
		this.name = "Player1";
		this.team = World.ALLY;
		this.human = true;
		this.ai = null;
	}
	public Player(ArrayList<Unit> selection, String name, Team team,
			boolean human, AI ai)
	{
		this.selection = selection;
		this.name = name;
		this.team = team;
		this.human = human;
		this.ai = ai;
	}
	public void clearSelection()
	{
		for(Unit u : selection)
		{
			u.setSelection(null);
		}
		selection.clear();
	}
	
	public void unselect(Unit unit)
	{
		unit.setSelection(null);
		selection.remove(unit);
	}
	public void select(Unit unit)
	{
		if(!selection.contains(unit))
		{
			selection.add(unit);
			unit.setSelection(this);
		}
	}
	public void select(ArrayList<Unit> units)
	{
		for(Unit u : units)
		{
			if(!selection.contains(u))
			{
				selection.add(u);
				u.setSelection(this);
			}
		}
	}
	public void selectAll()
	{
		ArrayList<Unit> list = world.getUnits();
		for(Unit u : list)
		{
			if(u.getTeam() == this.getTeam())
			{
				if(!list.contains(u))
				{
					selection.add(u);
					u.setSelection(this);
				}
			}
		}
	}
	
	public void giveCommand(Point target)
	{
		
	}
	public ArrayList<Unit> getSelection()
	{
		return selection;
	}
	public void setSelection(ArrayList<Unit> selection)
	{
		this.selection = selection;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Team getTeam()
	{
		return team;
	}
	public void setTeam(Team team)
	{
		this.team = team;
	}
	public boolean isHuman()
	{
		return human;
	}
	public void setHuman(boolean human)
	{
		this.human = human;
	}
	public AI getAi()
	{
		return ai;
	}
	public void setAi(AI ai)
	{
		this.ai = ai;
	}
	public World getWorld()
	{
		return world;
	}
	public void setWorld(World world)
	{
		this.world = world;
	}
}
