package unit;

import java.awt.Point;
import java.util.ArrayList;

import actions.Moving;
import player.Player;
import player.Team;
import ressource.Ressource;
import tile.Tile;
import world.World;

public abstract class Unit
{
	/**
	 * the circular area that a unit occupies in the world
	 */
	private double radius;
	/**
	 * the velocity vector of a unit, to be used in conjecture with the position
	 * attribute. may be tranfer to AIUnitw
	 */
	private Point velocity;

	/**
	 * the maximum speed a unit can get to. may be tranfer to AIUnit
	 */
	private int maxSpeed;
	/**
	 * the direction the unit is facing, based on the unit's last movement
	 * direction
	 */
	private Direction direction;
	/**
	 * is this unit physically blocking another unit
	 */
	private boolean blocking;
	/**
	 * needed to execute actions such as moving and attacking, main use of this
	 * is to lighten the Unit class (because it isn't every unit that implements
	 * every action)
	 */
	private UnitAI ai;
	/**
	 * The Unit's health pool, gets lowered when the unit is attacked. when it
	 * reaches 0, the unit should be destroyed (unless some special condition
	 * apply)
	 */
	private int health;
	/**
	 * the unit's total amount of health. a unit cannot have more health than
	 * it.s max value and the max value should not be changed unless some
	 * special condition are in effect
	 */
	private int MaxHealth;
	/**
	 * The unit's energy pool, is drained when a unit is using an ability.
	 * triggers may happen if the energy is full or empty
	 */
	private int energy;
	/**
	 * The unit's Maximum energy, should not be changed and the evergy pool
	 * should not go over this value.
	 */
	private int MaxEnergy;
	/**
	 * the Unit's faction/team/affiliation. Determines what unit a player can
	 * select and helps AIs to sort throught units
	 */
	private Team team;
	/**
	 * the floating position of a unit. is not binded to a tile
	 */
	private Point position;
	/**
	 * the tile the unit is in, based on the floating position, helps with
	 * pathfinding when units moves
	 */
	private Tile tile;
	/**
	 * the player who is currently selecting this unit. Will take orders from
	 * this player if that player is part of the same team as the unit. May
	 * become an array (if multiple players are selecting a unit
	 */
	private Player selection;
	/**
	 * the ressources that a unit is being made of for it's creation also as
	 * it's death drop
	 */
	private ArrayList<Ressource> buildRessourceList;

	private World world;

	/**
	 * the different direction a unit can be facing, will mostly alter graphics
	 * but may also be used for AI realted purposes as vision or forced moving
	 * direction
	 * 
	 * @author David
	 *
	 */
	public enum Direction
	{
		UP, DOWN, LEFT, RIGHT
	}

	/**
	 * It's a constructor, deal with it
	 * 
	 * @param radius
	 * @param direction
	 * @param ai
	 * @param health
	 * @param energy
	 * @param team
	 * @param position
	 * @param blocking
	 * @param tile
	 * @param buildRessourceList
	 */
	public Unit(World world, int radius, Direction direction, UnitAI ai,
			int health, int energy, Team team, Point position,
			boolean blocking, ArrayList<Ressource> buildRessourceList)
	{
		this.velocity = new Point(0, 0);
		this.position = position;
		this.world = world;
		this.tile = world.getTile(
				(int) Math.floorDiv(this.position.x, Tile.FLOATING_SIZE),
				(int) Math.floorDiv(this.position.y, Tile.FLOATING_SIZE));
		this.blocking = blocking;
		this.direction = direction;
		this.radius = radius;
		this.ai = ai;
		this.health = health;
		this.energy = energy;
		this.team = team;
		this.selection = null;
		this.buildRessourceList = buildRessourceList;
	}

	/**
	 * is being called by the world instance to update the unit's ongoing action
	 */
	public void update()
	{
		this.tile = this.world.getTile(
				(int) Math.floorDiv(this.position.x, Tile.FLOATING_SIZE),
				(int) Math.floorDiv(this.position.y, Tile.FLOATING_SIZE));
		if (this instanceof Moving && ai.getPath() != null)
		{
			((Moving) this).move(ai.getPath().getCoor());
			transfer();
		}
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

	public Tile getTile()
	{
		return tile;
	}

	public void setTile(Tile tilePos)
	{
		this.tile = tilePos;
	}

	public ArrayList<Ressource> getBuildRessourceList()
	{
		return buildRessourceList;
	}

	public void setBuildRessourceList(ArrayList<Ressource> buildRessourceList)
	{
		this.buildRessourceList = buildRessourceList;
	}

	/**
	 * the character used in the console based display for the unit
	 * 
	 * @return
	 */
	public abstract char toChar();

	/**
	 * the character used in the console based display for the unit when he is
	 * being displayed
	 * 
	 * @return
	 */
	public abstract char toCharSelected();

	public Player getSelection()
	{
		return selection;
	}

	public void setSelection(Player selection)
	{
		this.selection = selection;
	}

	public UnitAI getAi()
	{
		return ai;
	}

	public void setAi(UnitAI ai)
	{
		this.ai = ai;
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public boolean isBlocking()
	{
		return blocking;
	}

	public void setBlocking(boolean blocking)
	{
		this.blocking = blocking;
	}

	public int getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int speed)
	{
		this.maxSpeed = speed;
	}

	public Direction getDirection()
	{
		return direction;
	}

	public void setDirection(Direction direction)
	{
		this.direction = direction;
	}

	public Point getPosition()
	{
		return position;
	}

	public void setPosition(Point position)
	{
		this.position = position;
	}

	public Point getVelocity()
	{
		return velocity;
	}

	public void setVelocity(Point velocity)
	{
		this.velocity = velocity;
	}

	/**
	 * move a unit to it's next location based on the velocity
	 */
	public void transfer()
	{
		this.setPosition(new Point(getPosition().x + getVelocity().x,
				getPosition().y + getVelocity().y));
	}

	/**
	 * change the velocity vector to move the unit to the next path position
	 */
	public void moveTo(Point p)
	{
		int distX = p.x - position.x;
		int distY = p.y - position.y;

		double angle = Math.atan((double) (Math.abs(distY) / Math.abs(distX)));

		// action to go right & down (+, +)
		double vx = Math.cos(angle);
		double vy = Math.sin(angle);

		// action to go right & up (+, -)

		// action to go left and up (-, -)

		// action to go left and down (-, +)

		setVelocity(new Point((int) vx, (int) vy));
	}

	/**
	 * get the absolute value of the unit's speed
	 * 
	 * @return ans the absolute speed of a unit
	 */
	public double getSpeed()
	{
		return velocity.distance(0.0, 0.0);
	}

	public int getMaxHealth()
	{
		return MaxHealth;
	}

	public void setMaxHealth(int maxHealth)
	{
		MaxHealth = maxHealth;
	}

	public int getMaxEnergy()
	{
		return MaxEnergy;
	}

	public void setMaxEnergy(int maxEnergy)
	{
		MaxEnergy = maxEnergy;
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
