package People;

public class BeijingPeople extends People {
   
    public void BeijingOpera() {
        System.out.println("京剧");
    }

    public void speakHello() {
        System.out.println("你好!");
    }

    public void averageHeight() {
        height = 171.325;
        System.out.println("北京人的平均身高是" + height + "cm");
    }

    public void averageWeight() {
        weight = 75;
        System.out.println("北京人的平均体重是" + weight + "kg");
    }
}