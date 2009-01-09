package games.stendhal.server.script;

import games.stendhal.server.core.engine.StendhalRPZone;
import games.stendhal.server.core.engine.SingletonRepository;
import games.stendhal.server.core.scripting.ScriptImpl;
import games.stendhal.server.entity.player.Player;

import java.util.List;

/**
 * Impersonate a NPC to shout a message to all players in a zone.
 *
 * @author raignarok
 */
public class NPCShoutZone extends ScriptImpl {

	@Override
	public void execute(final Player admin, final List<String> args) {
		super.execute(admin, args);

		if (args.size() < 3) {
			admin.sendPrivateText("Usage: /script NPCShoutZone.class npc zone text");
		} else {
			final StringBuilder sb = new StringBuilder();
			sb.append(args.get(0));
			sb.append(" shouts ");

			StendhalRPZone targetZone;
			String targetZoneName = args.get(1);
			if ("-".equals(targetZoneName)) {
				targetZone = admin.getZone();
				targetZoneName = targetZone.getName();
			} else {
				targetZone = SingletonRepository.getRPWorld().getZone(targetZoneName);
			}

			if (targetZone != null) {
				sb.append("to those in " + targetZoneName + ": ");
				for (int i = 2; i < args.size(); i++) {
					sb.append(args.get(i));
					sb.append(" ");
				}
				final String text = sb.toString();
				for (Player player : targetZone.getPlayers()) {
					player.sendPrivateText(text);
				}
				SingletonRepository.getRuleProcessor().sendMessageToSupporters(text);
			} else {
				admin.sendPrivateText("zone " + targetZoneName + "not found");
			}

		}
	}

}
