package basketball;

public class Main {
    public static void main(String[] args) {
        CoachMediator coach = new CoachMediator();

        Player p1 = new BasketballPlayer(coach, "Jugador 1");
        Player p2 = new BasketballPlayer(coach, "Jugador 2");
        Player p3 = new BasketballPlayer(coach, "Jugador 3");

        coach.registerPlayer(p1);
        coach.registerPlayer(p2);
        coach.registerPlayer(p3);

        p1.send("Paso la pelota al 2");
        p2.send("Recibida, voy a tirar");
        p3.send("¡Pide cambio, estoy cansado!");
    }
}
