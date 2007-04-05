package games.stendhal.server.actions.equip;

import games.stendhal.server.entity.Entity;

/**
 * source or destination object
 * 
 * @author hendrik
 */
public abstract class MoveableObject {

	/**
	 * the slot this item is in or should be placed into
	 */
	protected String slot;

	/**
	 * is this object valid?
	 *
	 * @return true, if the action may be preformed, false otherwise
	 */
	public abstract boolean isValid();

	/**
	 * is the owner of the slot in reach?
	 *
	 * @param entity   entity to compare to
	 * @param distance max distance
	 * @return true, if it is reachable, false otherwise
	 */
	public abstract boolean checkDistance(Entity entity, double distance);

	/**
	 * gets the name of the slot or null if there is none
	 *
	 * @return slot name
	 */
	String getSlot() {
		return slot;
	}
}
