public class MainClass{
    public static void main(String[]args){}
    TV hairTV = new TV();
    
    Family xiaoWangFamily = new Family();
    xiaoWangFamily.setTV(hairTV);
    xiaoWangFamily.changeChannel(1);
    xiaoWangFamily.seeTV();
}