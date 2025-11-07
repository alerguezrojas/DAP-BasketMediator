package basketball;

import java.util.ArrayList;
import java.util.List;

public class CoachMediator implements Mediator {
    private List<Player> players = new ArrayList<>();

    public void registerPlayer(Player player) {
        players.add(player);
    }

    @Override
    public void sendMessage(String message, Player sender) {
        for (Player player : players) {
            // Notify all players except the sender
            if (player != sender) {
                player.receive(message);
            }
        }
    }
}
