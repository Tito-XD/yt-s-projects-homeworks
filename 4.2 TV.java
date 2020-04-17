public class TV {
    public static void main(String[] args) {
    }

    int channel;

    void setChannel(int c) {
        if (c >= 1) {
            channel = c;
        }
    }

    int getChannel() {
        return channel;
    }

    void showProgram() {
        switch (channel) {
            case 1:
                System.out.println("少儿频道");
                break;
            case 2:
                System.out.println("金鹰卡通");
                break;
            case 3:
                System.out.println("CCTV1");
                break;
        }
    }
}
