package ukcodoctoruseful.cards.network;

import java.io.Serializable;

import ukcodoctoruseful.cards.Player;
import ukcodoctoruseful.cards.event.PlayerActionEvent;

public class PlayerProtocol implements Serializable {
	
	public PlayerProtocol(PlayerActionEvent evt) {
		this.action = evt;
	}
	}
	private PlayerActionEvent action;
	
	public PlayerActionEvent getAction() {
		return action;
	}

	
	//TODO add gamestate to this, so that the protocol knows when the event is valid.
	public CardsEvent process(PlayerActionEvent evt) {
		CardsEvent response = null;
		switch(evt.getAction()) {
		case ANTE:
		}
		return response;

}
