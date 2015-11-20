package player;

import java.util.ArrayList;

public class Team
{
	
	private String name;
	private Color color;
	private ArrayList<Player> players;
	
	public enum Color
	{
		RED, BLUE, GREEN, YELLOW, ORANGE, WHITE, BLACK, PURPLE, PINK, CYAN, GREY
	}
	
	public Team(Color color)
	{
		this.color = color;
	}

	public Team(String name, Color color, ArrayList<Player> players)
	{
		super();
		this.name = name;
		this.color = color;
		this.players = players;
	}
	
	public void addPlayer(Player player)
	{
		
	}
	public void addPlayers(ArrayList<Player> players)
	{
		
	}
	
	public void removePlayer(Player player)
	{
		
	}
	
	public void removePlayers()
	{
		
	}
}
