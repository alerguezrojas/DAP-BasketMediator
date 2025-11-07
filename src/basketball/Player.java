package basketball;

public abstract class Player {
    protected Mediator mediator;
    protected String name;

    public Player(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
