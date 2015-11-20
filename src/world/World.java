package world;

import java.util.ArrayList;

import player.Player;
import player.Team;
import ressource.Ressource;
import tile.Tile;
import unit.Unit;

public class World
{
	public World(double posX, double posY, ArrayList<Tile> tileGrid,
			ArrayList<Unit> units, ArrayList<Ressource> ressources,
			ArrayList<Player> players, ArrayList<Team> teams)
	{
		super();
		PosX = posX;
		PosY = posY;
		this.tileGrid = tileGrid;
		this.units = units;
		this.ressources = ressources;
		this.players = players;
		this.teams = teams;
	}

	private double PosX, PosY;
	private ArrayList<Tile> tileGrid;
	private ArrayList<Unit> units;
	private ArrayList<Ressource> ressources;
	private ArrayList<Player> players;
	private ArrayList<Team> teams;
	
	public World(int sizeX, int sizeY)
	{
		
	}
	
	public void addTile(Tile tile)
	{
		
	}
	public void addTeam(Team team)
	{
		
	}
	public void removeTeam(Team team)
	{
		
	}
	public void addPlayer(Player player, Team team)
	{
		
	}
	
	public void removePlayer(Player player)
	{
		
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param unit
	 */
	public void addUnit(double x, double y, Unit unit)
	{
		
	}
	
	public void removeUnit(Unit unit)
	{
		
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param ress
	 * @param amount
	 */
	public void addRessource(double x, double y, Ressource ress, int amount)
	{
		
	}
	
	public void removeRessource(Ressource ress, int amount)
	{
		
	}

	public double getPosX()
	{
		return PosX;
	}

	public void setPosX(double posX)
	{
		PosX = posX;
	}

	public double getPosY()
	{
		return PosY;
	}

	public void setPosY(double posY)
	{
		PosY = posY;
	}

	public ArrayList<Tile> getTileGrid()
	{
		return tileGrid;
	}

	public void setTileGrid(ArrayList<Tile> tileGrid)
	{
		this.tileGrid = tileGrid;
	}

	public ArrayList<Unit> getUnits()
	{
		return units;
	}

	public void setUnits(ArrayList<Unit> units)
	{
		this.units = units;
	}

	public ArrayList<Ressource> getRessources()
	{
		return ressources;
	}

	public void setRessources(ArrayList<Ressource> ressources)
	{
		this.ressources = ressources;
	}

	public ArrayList<Player> getPlayers()
	{
		return players;
	}

	public void setPlayers(ArrayList<Player> players)
	{
		this.players = players;
	}

	public ArrayList<Team> getTeams()
	{
		return teams;
	}

	public void setTeams(ArrayList<Team> teams)
	{
		this.teams = teams;
	}
}
