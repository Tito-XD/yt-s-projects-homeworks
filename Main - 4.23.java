
public class Main {
    public static void main(String[] args) {
        People p = new People();
        Animal an;
        Food f;
        an = new Monkey();
        f = new Banana();
        p.feed(an, f);
        an = new Tiger();
        f = new Meat();
        p.feed(an, f);
        p.feed(new Animal() {
            @Override
            void eat() {
                // TODO Auto-generated method stub
                super.eat();
                System.out.println("马吃东西");
            }
        }, new Food() {
            @Override
            void showName() {
                // TODO Auto-generated method stub
                super.showName();
                System.out.println("吃草");
            }
        });
    }
}