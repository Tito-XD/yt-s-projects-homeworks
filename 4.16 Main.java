
public class Main {
    public static void main(String[] args) {
        Gymnastics gymnastics = new Gymnastics();
        double Gymnastics[] = { 9.21, 8.53, 8.65, 9.50, 9.88, 8.76, 9.46, 9.78 };
        double averageg = gymnastics.average(Gymnastics);
        System.out.printf("体操的平均分：%.2f\n", averageg);
        School school = new School();
        double School[] = { 80.5, 88, 98.5, 99, 78, 88, 85, 81.6, 92.5 };
        double averages = school.average(School);
        System.out.printf("班级平均分为：%.2f\n", averages);
    }
}