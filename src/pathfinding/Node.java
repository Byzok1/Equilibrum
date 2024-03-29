package pathfinding;

import java.awt.Point;

/** 
 * Classe de l'objet Node telle que définis par l'algorithme A*
 * @author gabriel 
 */
public class Node implements Comparable<Node> {
	private Point coor;
	private Node next;
	private int fromB, toE;

	/**
	 * Constructeur de node
	 * 
	 * @param p
	 *            Position X et Y du node
	 * @param lastNode
	 *            Le node parent
	 * @param fromB
	 *            Distance depuis le début du chemin
	 * @param toE
	 *            Distance "estimé" jusqu'a l'objectif
	 */
	public Node(Point p, Node lastNode, int fromB, int toE) {
		coor = p;
		this.next = lastNode;
		this.fromB = fromB;
		this.toE = toE;
	}

	/**
	 * @return L'objet point contenant les coordoners du Node
	 */
	public Point getCoor() {
		return coor;
	}

	/**
	 * @return
	 */
	public float getTotal() {
		return fromB + toE;
	}

	/**
	 * @return Retourne le premier node
	 */
	public Node getFirst() {
		Node current = this;
		while (current.next != null)
			current = current.next;
		return current;
	}

	/**
	 * @return Retourne le premier Node et le retire
	 */
	public Node getDestructiveFirst() {
		if (next == null)
			return this;

		Node current = this;
		while (current.next.next != null) {
			current = current.next;
		}

		Node temp = current.next;
		current.next = null;
		return temp;
	}

	/**
	 * Compare 2 node selon leur coût total
	 */
	@Override
	public int compareTo(Node o) {
		return (int) (this.getTotal() - o.getTotal());
	}

}
