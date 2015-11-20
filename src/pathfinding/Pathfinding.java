package pathfinding;

import java.awt.Point;
import java.util.HashSet;
import java.util.Collections;

import world.World;

/**
 * Classe de PathFinding pour les monstres
 * 
 * @author gabriel
 */
public class Pathfinding
{

	/**
	 * A* search algorithm.
	 * 
	 * @param start
	 *            Point de départ
	 * @param end
	 *            Point d'arriver
	 * @param floor
	 *            L'étage courant
	 * @return Retourne une suite de node avec le précédent attacher a la queue.
	 */
	public static Node getPath(Point start, Point end, World world)
	{
		int searchLimit = 200;
		HashSet<Node> openList = new HashSet<Node>();
		HashSet<Node> closedList = new HashSet<Node>();
		Node current = new Node(start, null, 0, (int) start.distance(end));
		closedList.add(current);
		// Take all valid node around the start
		for (int i = start.x - 1; i <= start.x + 1; i++)
		{
			for (int j = start.y - 1; j <= start.y + 1; j++)
			{
				if (i != start.x || j != start.y)
				{
					Point temp = new Point(i, j);
					if (world.getTile(i, j) != null)
					{
						if (world.getTile(i, j).exist()
								&& !world.getTile(i, j).getTerrain()
										.getEntity().isBlocking()
								&& !world.getTile(i, j).getTerrain()
										.isBlocking())
						{
							openList.add(new Node(temp, null, (int) temp
									.distance(start), (int) temp.distance(end)));
						}
					}

				}
			}

		}
		// System.out.println("Start");

		while (!current.getCoor().equals(end) && searchLimit >= 0)
		{
			// The current Node is the one with the lowest cost
			current = Collections.min(openList);
			openList.remove(current);
			closedList.add(current);

			// Take all node around the current node
			for (int i = current.getCoor().x - 1; i <= current
					.getCoor().x + 1; i++)
			{
				for (int j = current.getCoor().y - 1; j <= current
						.getCoor().y + 1; j++)
				{
					if (i != current.getCoor().x
							|| j != current.getCoor().y)
					{
						Point temp = new Point(i, j);
						Node maybe = new Node(
								temp,
								current,
								(int) ((int) temp.distance(current.getCoor()) + current
										.getTotal()), (int) temp.distance(end));
						
						if (world.getTile(i, j) != null)
						{
							if (!closedList.contains(maybe)
									&& world.getTile(i, j).exist()
									&& !world.getTile(i, j).getTerrain()
											.getEntity().isBlocking()
									&& !world.getTile(i, j).getTerrain()
											.isBlocking())
							{
								openList.add(maybe);
							}
						}
					}
				}
			}
			searchLimit--;
		}

		// System.out.println("END");
		return current;
	}

}
