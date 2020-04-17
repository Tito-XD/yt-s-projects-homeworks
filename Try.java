package SoundSimulator;

public class Try {
    public static void main(String[] args) {
        Simulator s = new Simulator();
        Dog d = new Dog();
        s.playSound(d);
        Cat c = new Cat();
        s.playSound(c);
    }
}