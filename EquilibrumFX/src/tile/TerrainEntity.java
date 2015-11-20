package tile;

import java.awt.Point;
import java.util.ArrayList;

import player.Team;
import ressource.Ressource;

public abstract class TerrainEntity
{
	private int width, height;
	private Team team;
	private int health;
	private Point root;
	private boolean blocking, attackable;
	private ArrayList<Point> positions;
	private boolean selectable;
	private ArrayList<Ressource> buildRessourceList;

	public TerrainEntity(int width, int height, Point root,Team team, int health,
			boolean blocking, boolean attackable,
			boolean selectable, ArrayList<Ressource> buildRessourceList)
	{
		this.root = root;
		this.width = width;
		this.height = height;
		this.team = team;
		this.health = health;
		this.blocking = blocking;
		this.attackable = attackable;
		this.positions = new ArrayList<Point>();
		for (int i = 0; i < width; i++)
		{
			for (int j = 0; j < height; j++)
			{
				this.positions.add(new Point(root.x + i, root.y + j));
			}
		}
		this.selectable = selectable;
		this.buildRessourceList = buildRessourceList;
	}

	public Team getTeam()
	{
		return team;
	}

	public void setTeam(Team team)
	{
		this.team = team;
	}

	public boolean isBlocking()
	{
		return blocking;
	}

	public void setBlocking(boolean blocking)
	{
		this.blocking = blocking;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public ArrayList<Ressource> getBuildRessourceList()
	{
		return buildRessourceList;
	}

	public void setBuildRessourceList(ArrayList<Ressource> buildRessourceList)
	{
		this.buildRessourceList = buildRessourceList;
	}

	public int getWidth()
	{
		return width;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int heigth)
	{
		this.height = heigth;
	}

	public boolean isSelectable()
	{
		return selectable;
	}

	public void setSelectable(boolean selectable)
	{
		this.selectable = selectable;
	}

	public abstract char toChar();
	
	public abstract char toCharSelected();

	public boolean isAttackable()
	{
		return attackable;
	}

	public void setAttackable(boolean attackable)
	{
		this.attackable = attackable;
	}
}
