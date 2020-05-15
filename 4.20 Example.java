interface SpeakHello {
    void speak();
}

class HelloMachine {
    public void turnOn(SpeakHello hello) {
        hello.speak();
    }
}

public class Example {
    public static void main(String args[]) {
        HelloMachine machine = new HelloMachine();
        machine.turnOn(new SpeakHello() {

            @Override
            public void speak() {
                // TODO Auto-generated method stub
                System.out.println("hello and welcome");
            }
        });
        machine.turnOn(new SpeakHello() {

            @Override
            public void speak() {
                // TODO Auto-generated method stub
                System.out.println("你好，欢迎");
            }
        });
    }
}
