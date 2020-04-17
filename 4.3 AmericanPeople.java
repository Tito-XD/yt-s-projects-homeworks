package People;

public class AmericanPeople extends People {
    
    public void AmericanBoxing() {
        System.out.println("美国拳击");
    }

    public void speakHello() {
        System.out.println("Hello!");
    }

    public void averageHeight() {
        height = 175;
        System.out.println("美国人的平均身高是" + height + "cm");
    }

    public void averageWeight() {
        weight = 89.9;
        System.out.println("美国人的平均体重是" + weight + "kg");
    }
}