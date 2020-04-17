package Computer;

public class Shop {
    String[] types;

    public void setTypes(String[] types) {
        this.types = types;
    }

    public void showComputer() {
        System.out.println("商场中有 台式机 笔记本 商务本 游戏本");
    }

    Computer c;

    public void chooseComputer(String type) {
        switch (type) {
            case "台式机":
                c = new DesktopComputer();
                c.advantage();
                break;
            case "笔记本":
                c = new LaptopComputer();
                c.advantage();
                break;
            case "商务本":
                c = new BusinessLaptop();
                c.advantage();
                break;
            case "游戏本":
                c = new GamLaptop();
                c.advantage();
                break;
            default:
                System.out.println(type);
                break;
        }
    }
}