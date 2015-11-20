package unit;

import java.util.ArrayList;

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
	public Mech(String name, int health, int energy, Team team, double posX,
			double posY, Tile tilePos, ArrayList<Ressource> buildRessourceList, int condition)
	{
		super(name, health, energy, team, posX, posY, tilePos, buildRessourceList);
		this.conditionAmount = condition;
		if(conditionAmount <= 100 && conditionAmount > 80)
		{
			this.condition = ConditionType.NEW;
		}
		else if(conditionAmount <= 80 && conditionAmount > 60)
		{
			this.condition = ConditionType.GOOD;
		}
		else if(conditionAmount <= 60 && conditionAmount > 40)
		{
			this.condition = ConditionType.AVERAGE;
		}
		else if(conditionAmount <= 40 && conditionAmount > 20)
		{
			this.condition = ConditionType.BAD;
		}
		else if(conditionAmount <= 20 && conditionAmount > 0)
		{
			this.condition = ConditionType.CRITICAL;
		}
		else if(conditionAmount <= 0)
		{
			this.condition = ConditionType.BROKEN;
		}
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
