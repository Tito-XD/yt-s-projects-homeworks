package Zoo;

public class Animal {
    public static void main(String[] args) {
    }

    private double weight;
    private String name;

    void setName(String n) {
        name = n;
    }

    void setWeight(double w) {
        weight = w;
    }

    double weight() {
        return weight;
    }

    String name() {
        return name;
    }

    void show() {
        System.out.println("重量是" + weight + "名字是" + name);
    }
}
