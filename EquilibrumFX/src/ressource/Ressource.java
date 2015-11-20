package ressource;

import java.awt.Point;
import java.util.ArrayList;

public abstract class Ressource
{
	private int amount;
	/**
	 * if the coordinates are -1, -1, it means the object isn't present in the
	 * world (it is the case for build ressources and carried ressources)
	 */
	private Point pos;

	public Ressource(Point point, int amount)
	{
		this.amount = amount;
		this.pos = point;
	}
}
