package unitClass;

import java.awt.Point;

import controller.Controller;
import actions.Dying;
import actions.Healing;
import actions.Suiciding;
import player.Team;
import tile.TerrainEntity;
import unit.Structure;
import unit.Unit;
import world.World;

public class MedicalStation extends Structure implements Dying, Healing,
		Suiciding
{
	public MedicalStation(Team team, Point pos)
	{
		super(0, 75, 50, team, pos, Controller.getController().getWorld().getTile(pos), World.empty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suicide()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void heal(Unit unit, int amount)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void die()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public char toChar()
	{
		return 'M';
	}

	@Override
	public char toCharSelected()
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
