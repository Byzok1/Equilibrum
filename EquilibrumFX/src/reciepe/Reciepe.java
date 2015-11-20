package reciepe;

import java.util.ArrayList;

import ressource.Ressource;
import unit.Unit;
import world.World;

public class Reciepe
{
	private ArrayList<Ressource> ressourceList;
	private World world;
	private Unit product;
	
	/**
	 * ressources must be present within the given radius to allow building, might become reciepe specific...
	 */
	public static final int BUILD_RADIUS = 75;
	
	public Reciepe(World world, Unit product)
	{
		this.world = world;
		this.product = product;
		this.ressourceList = product.getBuildRessourceList();
	}
	
	
}
