package unit;

import java.util.ArrayList;

import player.Team;
import ressource.Ressource;
import tile.Tile;

public abstract class Unit
{
	private String name;
	private int health;
	private int energy;
	private Team team;
	private double posX, posY;
	private Tile tilePos;
	private ArrayList<Ressource> buildRessourceList;
	public Unit(String name, int health, int energy, Team team, double posX,
			double posY, Tile tilePos, ArrayList<Ressource> buildRessourceList)
	{
		this.name = name;
		this.health = health;
		this.energy = energy;
		this.team = team;
		this.posX = posX;
		this.posY = posY;
		this.tilePos = tilePos;
		this.buildRessourceList = buildRessourceList;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getHealth()
	{
		return health;
	}
	public void setHealth(int health)
	{
		this.health = health;
	}
	public int getEnergy()
	{
		return energy;
	}
	public void setEnergy(int energy)
	{
		this.energy = energy;
	}
	public Team getTeam()
	{
		return team;
	}
	public void setTeam(Team team)
	{
		this.team = team;
	}
	public double getPosX()
	{
		return posX;
	}
	public void setPosX(double posX)
	{
		this.posX = posX;
	}
	public double getPosY()
	{
		return posY;
	}
	public void setPosY(double posY)
	{
		this.posY = posY;
	}
	public Tile getTilePos()
	{
		return tilePos;
	}
	public void setTilePos(Tile tilePos)
	{
		this.tilePos = tilePos;
	}
	public ArrayList<Ressource> getBuildRessourceList()
	{
		return buildRessourceList;
	}
	public void setBuildRessourceList(ArrayList<Ressource> buildRessourceList)
	{
		this.buildRessourceList = buildRessourceList;
	}
	

}
