package basketball;

public class BasketballPlayer extends Player {

    public BasketballPlayer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " dice: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " recibe: " + message);
    }
}
