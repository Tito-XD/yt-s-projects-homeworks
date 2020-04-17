
public class CarShop{
    public static void getCar(String name) {

if(name == "BMW") {
    ICar carbmw = new BMW();
    carbmw.getInfo();
    return;
}
if(name == "Benz"){
    ICar carbenz = new Benz();
    carbenz.getInfo();
    return;
}
else{
    System.out.println("请重新输入/Please input again");
}
    }
}