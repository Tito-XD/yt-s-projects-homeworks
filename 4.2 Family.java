public class Family{
    public static void main (String[]args){}
    TV homeTV;
    void setTV(TV tv){
        homeTV=tv;
    }
    void changeChannel(int c){
        homeTV.setChannel(c);
    }
    void seeTV(){
        homeTV.showProgram();
    }
}