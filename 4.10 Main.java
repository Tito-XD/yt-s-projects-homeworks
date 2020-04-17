package Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Shop shop = new Shop();

            String[] types = { "台式机", "笔记本", "商务本", "游戏本" };
            shop.setTypes(types);
            shop.showComputer();
            System.out.println("输入你想了解的商品");
            Scanner scan = new Scanner(System.in);
            String type = scan.nextLine();
            shop.chooseComputer(type);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
