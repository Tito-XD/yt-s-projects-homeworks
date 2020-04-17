package Zoo;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();

        cat.setName("cat");
        cat.setWeight(5);

        dog.setName("dog");
        dog.setWeight(10);

        cat.show();
        dog.show();

        cat.setName("小花");
        dog.setName("小黑");

        cat.setWeight(10);
        dog.setWeight(20);

        cat.show();
        dog.show();
    }
}