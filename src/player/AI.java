package player;

public class AI
{
	private AIType type;
	
	public enum AIType
	{
		EASY, MEDIUM, HARD
	}

	public AI(AIType type)
	{
		super();
		this.type = type;
	}

	public AIType getType()
	{
		return type;
	}

	public void setType(AIType type)
	{
		this.type = type;
	}
}
