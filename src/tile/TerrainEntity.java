package tile;

import player.Team;

public class TerrainEntity
{
	private String name;
	private Team team;
	private int health;
	private boolean blocking;
	private TerrainEntityType type;
	public TerrainEntity(String name, Team team, boolean blocking,
			TerrainEntityType type)
	{
		super();
		this.name = name;
		this.team = team;
		this.blocking = blocking;
		this.type = type;
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
	public boolean isBlocking()
	{
		return blocking;
	}
	public void setBlocking(boolean blocking)
	{
		this.blocking = blocking;
	}
	public TerrainEntityType getType()
	{
		return type;
	}
	public void setType(TerrainEntityType type)
	{
		this.type = type;
	}
	
}
