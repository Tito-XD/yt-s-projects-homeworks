
public class DangerException extends Exception {
    String message;

    public DangerException() {
        message = "警告";
    }

    public void toShow() {
        System.out.println(message);
    }
}