package People;

public class ChinaPeople extends People {

    public void ChinaGongfu() {
        System.out.println("中国功夫");
    }

   public void speakHello(){
       System.out.println("你好!");
   }
    public void averageHeight() {
        height = 161.45;
        System.out.println("中国人的平均身高是" + height + "cm");
    }

    public void averageWeight() {
        weight = 60;
        System.out.println("中国人的平均体重是" + weight + "kg");
    }
}