package Computer;

public class Shop {
    String[] types;

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void showComputer() {
        System.out.println("�̳����� ̨ʽ�� �ʼǱ� ���� ��Ϸ��");
    }

    Computer c;

    public void chooseComputer(String type) {
        switch (type) {
            case "̨ʽ��":
                c = new DesktopComputer();
                c.advantage();
                break;
            case "�ʼǱ�":
                c = new LaptopComputer();
                c.advantage();
                break;
            case "����":
                c = new BusinessLaptop();
                c.advantage();
                break;
            case "��Ϸ��":
                c = new GamLaptop();
                c.advantage();
                break;
            default:
                System.out.println(type);
                break;
        }
    }
}