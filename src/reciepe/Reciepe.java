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

	public ArrayList<Ressource> getRessourceList()
	{
		return ressourceList;
	}

	public void setRessourceList(ArrayList<Ressource> ressourceList)
	{
		this.ressourceList = ressourceList;
	}

	public World getWorld()
	{
		return world;
	}

	public void setWorld(World world)
	{
		this.world = world;
	}

	public Unit getProduct()
	{
		return product;
	}

	public void setProduct(Unit product)
	{
		this.product = product;
	}
	
	
}
