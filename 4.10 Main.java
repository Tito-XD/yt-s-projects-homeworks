package Computer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {

            Shop shop = new Shop();

            String[] types = { "̨ʽ��", "�ʼǱ�", "����", "��Ϸ��" };
            shop.setTypes(types);
            shop.showComputer();
            System.out.println("���������˽����Ʒ");
            Scanner scan = new Scanner(System.in);
            String type = scan.nextLine();
            shop.chooseComputer(type);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
