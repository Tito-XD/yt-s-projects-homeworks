package People;

public class Main {
    public static void main(String[] args) {
        People p = new People();
        p.speakHello();
        p.averageHeight();
        p.averageWeight();

        ChinaPeople cp = new ChinaPeople();
        cp.speakHello();
        cp.averageHeight();
        cp.averageWeight();
        cp.ChinaGongfu();

        AmericanPeople ap = new AmericanPeople();
        ap.speakHello();
        ap.averageHeight();
        ap.averageWeight();
        ap.AmericanBoxing();

        BeijingPeople bp = new BeijingPeople();
        bp.speakHello();
        bp.averageHeight();
        bp.averageWeight();
        bp.BeijingOpera();
    }
}