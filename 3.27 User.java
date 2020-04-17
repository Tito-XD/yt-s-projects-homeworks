package Tickets;

public class User {
    public static void main(String[] args) {
        Tickets tickets1 = new Tickets();
        Tickets tickets2 = new Tickets();
        Tickets tickets3 = new Tickets();

        tickets1.setName("窗口1");
        tickets2.setName("窗口2");
        tickets3.setName("窗口3");

        Tickets.ticketNum = 100;

        tickets1.sell(110);
        tickets1.show();

        tickets2.sell(30);
        tickets2.show();

        tickets3.sell(20);
        tickets3.show();
    }
}