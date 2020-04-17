
public class Gymnastics implements ComputerAverage {

    @Override
    public double average(double[] score) {
        // TODO Auto-generated method stub

        double aver = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length - 1; j++) {
                if (score[j] > score[j + 1]) {
                    double temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < score.length - 1; i++) {
            aver += score[i];
        }
        aver = aver / (score.length - 2);
        return aver;
    }

}
