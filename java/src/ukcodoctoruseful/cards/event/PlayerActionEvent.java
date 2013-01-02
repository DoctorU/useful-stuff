package ukcodoctoruseful.cards.event;

import ukcodoctoruseful.cards.Player;

public class PlayerActionEvent {

	private final PlayerAction playerAction;
	// amount only required for ante, see, raise.
	private final double amount;
	private final String playerId;

	public PlayerActionEvent(Player player, String action, double amount)
			throws IllegalEventException {
		playerId = player.getPlayerId();
		playerAction = convert(action);
		this.amount = amount;
		switch (playerAction) {
		case ANTE:
		case CALL:
		case FOLD:
			break;
		case SEE:
		case RAISE:
			if (amount <= 0.01) {
				throw new IllegalEventException("amount required for action "
						+ action);
			}
		}
	}

	private PlayerAction convert(String action) throws IllegalArgumentException, NullPointerException {
		return PlayerAction.valueOf(action);
	}

	public enum PlayerAction {
		ANTE, CALL, FOLD, SEE, RAISE
	};

	public PlayerAction getAction() {
		return playerAction;
	}

	public double getAmount() {
		return amount;

	}

}
