package People;

public class People {
    protected double height, weight;

    public void speakHello() {
        System.out.println("Hello");
    }

    public void averageHeight() {
        height = 165;
        System.out.println("人类平均身高是" + height + "cm");
    }

    public void averageWeight() {
        weight = 65;
        System.out.println("人类平均体重是" + weight + "kg");
    }
}