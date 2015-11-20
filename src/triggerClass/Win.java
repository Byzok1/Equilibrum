package triggerClass;

import java.awt.Point;

import controller.Controller;
import trigger.Trigger;
import unit.Unit;
import world.World;

public class Win extends Trigger
{
	private Unit target;
	
	public Win(World world, Point pos)
	{
		super(world, pos);
		this.target = null;
	}
	
	public Win(World world,Point pos, Unit unit)
	{
		super(world, pos);
		this.target = unit;
	}

	public Win(World world,Point pos, Unit unit, int x, int y)
	{
		super(world, pos, x, y);
		this.target = unit;
	}

	@Override
	public boolean condition()
	{
		boolean ans = false;
		for(Point p : getArea())
		{
			Unit test = getWorld().getUnit(p);
			if(test != null)
			{
				if(target == null)
				{
					ans = true;
					break;
				}
				else if(target == test)
				{
					ans = true;
					break;
				}
			}
		}
		
		return ans;
		
	}

	@Override
	public void execute()
	{
		getWorld().victory();
		
	}

	@Override
	public char toChar()
	{
		return '!';
	}
}
