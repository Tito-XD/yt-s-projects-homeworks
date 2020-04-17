package Tickets;

public class Tickets {
    public static void main(String[] args) {
    }

    static int ticketNum;
    String name;

    void setName(String n) {
        name = n;
    }

    public void sell(int t) {
        if (t > ticketNum) {
            System.out.println("卖票数量过多，请减少卖票数量");
        }
        if (t < ticketNum) {
            System.out.println("卖出了" + t + "张票");
            ticketNum = ticketNum - t;
        }
    }

    public void show() {
        System.out.println("剩余票数量为" + ticketNum);
    }
}