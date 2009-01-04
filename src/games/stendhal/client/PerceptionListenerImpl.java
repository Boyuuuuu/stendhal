package games.stendhal.client;

import marauroa.client.net.IPerceptionListener;
import marauroa.common.game.RPObject;
import marauroa.common.net.message.MessageS2CPerception;

public abstract class PerceptionListenerImpl implements IPerceptionListener {

	public boolean onAdded(final RPObject object) {
		return false;
	}

	public boolean onClear() {
		return false;
	}

	public boolean onDeleted(final RPObject object) {
		return false;
	}

	public void onException(final Exception exception, final MessageS2CPerception perception) {

	}

	public boolean onModifiedAdded(final RPObject object, final RPObject changes) {
		return false;
	}

	public boolean onModifiedDeleted(final RPObject object, final RPObject changes) {
		return false;
	}

	public boolean onMyRPObject(final RPObject added, final RPObject deleted) {
		return false;
	}

	public void onPerceptionBegin(final byte type, final int timestamp) {

	}

	public void onPerceptionEnd(final byte type, final int timestamp) {
	}

	public void onSynced() {

	}

	public void onUnsynced() {
		

	}

}
