package unit;

import java.awt.Point;
import java.util.ArrayList;

import player.Player;
import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class Mech extends Unit
{
	private ConditionType condition;
	private int conditionAmount;
	
	public enum ConditionType
	{
		NEW, GOOD, AVERAGE, BAD, CRITICAL, BROKEN
	}

	
	public Mech(int x, int y, int moveCoolDown, UnitAI ai, int health,
			int energy, Team team, Point root,
			Tile tile, ArrayList<Ressource> buildRessourceList)
	{
		super(x, y, moveCoolDown, ai, health, energy, team, root, tile,
				buildRessourceList);
		// TODO Auto-generated constructor stub
	}

	public ConditionType checkConditionType()
	{
		ConditionType cond = ConditionType.NEW;
		
		return cond;
	}

	public ConditionType getCondition()
	{
		return condition;
	}

	public void setCondition(ConditionType condition)
	{
		this.condition = condition;
	}

	public int getConditionAmount()
	{
		return conditionAmount;
	}

	public void setConditionAmount(int conditionAmount)
	{
		this.conditionAmount = conditionAmount;
	}

}
