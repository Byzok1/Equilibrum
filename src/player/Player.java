package player;

import java.util.ArrayList;

import unit.Unit;

public class Player
{
	private ArrayList<Unit> selection;
	private String name;
	private Team team;
	private boolean human;
	private AI ai;
	public Player(ArrayList<Unit> selection, String name, Team team,
			boolean human, AI ai)
	{
		super();
		this.selection = selection;
		this.name = name;
		this.team = team;
		this.human = human;
		this.ai = ai;
	}
	public void clearSelection()
	{
		
	}
	public void select(Unit unit)
	{
		
	}
	public void select(ArrayList<Unit> units)
	{
		
	}
	public void selectAll()
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
}
