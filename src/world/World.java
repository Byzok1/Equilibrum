package world;

import java.awt.Point;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;

import player.Player;
import player.Team;
import player.Team.Color;
import reciepe.Reciepe;
import ressource.Ressource;
import ressourceClass.MetalScrap;
import terrainClass.Land;
import terrainClass.Sand;
import terrainClass.Water;
import terrainEntityClass.Tree;
import tile.Tile;
import trigger.Trigger;
import triggerClass.Win;
import unit.Unit;
import unitClass.Duck;

public class World
{
	public static ArrayList<Ressource> empty = new ArrayList<Ressource>();
	/**
	 * used to create the world file
	 */
	private String name;
	private int dimensionX, dimensionY;
	private ArrayList<Reciepe> reciepes;
	private ArrayList<Tile> tiles;
	private ArrayList<Unit> units;
	private ArrayList<Ressource> ressources;
	private ArrayList<Player> players;
	private ArrayList<Team> teams;
	private ArrayList<Trigger> triggers;
	public static ArrayList<Ressource> testRessList = new ArrayList<Ressource>();
	public static ArrayList<Tile> testTiles = new ArrayList<Tile>();
	public static Team NEUTRAL = new Team(Color.GREY), ALLY = new Team(Color.GREEN), ENNEMY = new Team(Color.RED);
	
	public World(int x, int y, String name)
	{
		this.name = name;
		this.reciepes = new ArrayList<Reciepe>();
		this.units = new ArrayList<Unit>();
		this.ressources = new ArrayList<Ressource>();
		this.players = new ArrayList<Player>();
		this.tiles = new ArrayList<Tile>();
		this.teams = new ArrayList<Team>();
		this.triggers = new ArrayList<Trigger>();
		this.players.add(new Player());
		this.dimensionX = x;
		this.dimensionY = y;
		//add tiles with land type terrain for x and y
		for(int i = 0; i < dimensionX; i++)
		{
			for (int j = 0; j < dimensionY; j++)
			{
				this.tiles.add(new Tile(this, new Point(j, i)));
			}
		}
	}

	/**
	 * usually will be used by the Loader to create a map once it is loaded
	 * @param name
	 * @param dimensionX
	 * @param dimensionY
	 * @param reciepes
	 * @param tiles
	 * @param units
	 * @param ressources
	 * @param players
	 * @param teams
	 * @param triggers
	 */
	public World(String name, int dimensionX, int dimensionY,
			ArrayList<Reciepe> reciepes, ArrayList<Tile> tiles,
			ArrayList<Unit> units, ArrayList<Ressource> ressources,
			ArrayList<Player> players, ArrayList<Team> teams,
			ArrayList<Trigger> triggers)
	{
		this.name = name;
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
		this.reciepes = reciepes;
		this.tiles = tiles;
		this.units = units;
		this.ressources = ressources;
		this.players = players;
		this.teams = teams;
		this.triggers = triggers;
	}

	public void startTestWorld()
	{
		Tile testTile1 = new Tile(this, new Point(0, 0), true, new Land(new Tree(new Point(0, 0)), new Point(0,0)));
		Tile testTile2 = new Tile(this, new Point(0, 1), true, new Sand(new Point(0, 1)));
		Tile testTile3 = new Tile(this, new Point(1, 0), true, new Water(new Point(1, 0)));
		Tile testTile4 = new Tile(this, new Point(1, 1), true, new Land(new Point(1, 1)));
		testRessList.add(new MetalScrap(-1, -1, 1));
		testTiles.add(testTile1);
		testTiles.add(testTile2);
		testTiles.add(testTile3);
		testTiles.add(testTile4);
		tiles.remove(getTile(0, 0));
		tiles.remove(getTile(1, 0));
		tiles.remove(getTile(0, 1));
		tiles.remove(getTile(1, 1));
		tiles.addAll(testTiles);
		units.add(new Duck(this, ALLY, new Point(75, 25)));
		triggers.add(new Win(this, new Point(9, 9)));
	}
	public void update()
	{
		for(Trigger t: triggers)
		{
			if(t.condition())
			{
				t.execute();
			}
		}
		for(Unit u : units)
		{
			u.update();
		}
//		for(Tile t: tiles)
//		{
//			t.update();
//		}
//		for(Ressource r: ressources)
//		{
//			r.update();
//		}
//		for(Player p: players)
//		{
//			p.update();
//		}
//		for(Team t: teams)
//		{
//			t.update();
//		}
	}
	
	public Tile getTile(Point p)
	{
		Tile ans = null;
		for(Tile t : tiles)
		{
			if(t.getPos().equals(p))
			{
				ans = t;
				break;
			}
		}
		
		return ans;
	}
	
	public Tile getTile(int x, int y)
	{
		Tile ans = null;
		for(Tile t: tiles)
		{
			if(t.getPos().x == x && t.getPos().y == y)
			{
				ans = t;
				break;
			}
		}
		
		return ans;
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
	
	public Player getPlayer(String name)
	{
		Player ans = null;
		for(Player p : players)
		{
			if(p.getName() == name)
			{
				ans = p;
				break;
			}
		}
		
		return ans;
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

	public ArrayList<Tile> getTiles()
	{
		return tiles;
	}

	public void setTiles(ArrayList<Tile> tileGrid)
	{
		this.tiles = tileGrid;
	}

	public ArrayList<Unit> getUnits()
	{
		return units;
	}
	
	public Unit getUnit(Point p)
	{
		Unit ans = null;
		for(Unit u : units)
		{
			if(u.getTile().getPos().equals(p))
			{
				ans = u;
				break;
			}
		}
		
		return ans;
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

	public int getDimensionX()
	{
		return dimensionX;
	}

	public void setDimensionX(int dimensionX)
	{
		this.dimensionX = dimensionX;
	}

	public int getDimensionY()
	{
		return dimensionY;
	}

	public void setDimensionY(int dimensionY)
	{
		this.dimensionY = dimensionY;
	}

	public void victory()
	{
		System.out.println("You won!");
	}

	public ArrayList<Trigger> getTriggers()
	{
		return triggers;
	}

	public void setTriggers(ArrayList<Trigger> triggers)
	{
		this.triggers = triggers;
	}

	public ArrayList<Reciepe> getReciepes()
	{
		return reciepes;
	}

	public void setReciepes(ArrayList<Reciepe> reciepes)
	{
		this.reciepes = reciepes;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
