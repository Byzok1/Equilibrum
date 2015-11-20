package tile;


public class Tile
{
	private int posX, posY;
	private boolean exist;
	private Terrain terrain;
	
	public Tile(int x, int y, boolean exist, Terrain terrain)
	{
		
	}

	public int getPosX()
	{
		return posX;
	}

	public void setPosX(int posX)
	{
		this.posX = posX;
	}

	public int getPosY()
	{
		return posY;
	}

	public void setPosY(int posY)
	{
		this.posY = posY;
	}

	public boolean isExist()
	{
		return exist;
	}

	public void setExist(boolean exist)
	{
		this.exist = exist;
	}

	public Terrain getTerrain()
	{
		return terrain;
	}

	public void setTerrain(Terrain terrain)
	{
		this.terrain = terrain;
	}
}
