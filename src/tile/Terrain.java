package tile;

public class Terrain
{
	private TerrainType type;
	private boolean waterOkay, groundOkay, airOkay, structureOkay;
	private TerrainEntity entity;
	public Terrain(TerrainType type, boolean waterOkay, boolean groundOkay,
			boolean airOkay, boolean structureOkay, TerrainEntity entity)
	{
		super();
		this.type = type;
		this.waterOkay = waterOkay;
		this.groundOkay = groundOkay;
		this.airOkay = airOkay;
		this.structureOkay = structureOkay;
		this.entity = entity;
	}
	public TerrainType getType()
	{
		return type;
	}
	public void setType(TerrainType type)
	{
		this.type = type;
	}
	public boolean isWaterOkay()
	{
		return waterOkay;
	}
	public void setWaterOkay(boolean waterOkay)
	{
		this.waterOkay = waterOkay;
	}
	public boolean isGroundOkay()
	{
		return groundOkay;
	}
	public void setGroundOkay(boolean groundOkay)
	{
		this.groundOkay = groundOkay;
	}
	public boolean isAirOkay()
	{
		return airOkay;
	}
	public void setAirOkay(boolean airOkay)
	{
		this.airOkay = airOkay;
	}
	public boolean isStructureOkay()
	{
		return structureOkay;
	}
	public void setStructureOkay(boolean structureOkay)
	{
		this.structureOkay = structureOkay;
	}
	public TerrainEntity getEntity()
	{
		return entity;
	}
	public void setEntity(TerrainEntity entity)
	{
		this.entity = entity;
	}
}
