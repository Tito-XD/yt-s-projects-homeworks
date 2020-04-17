
public class School implements ComputerAverage {

    @Override
    public double average(double[] score) {
        // TODO Auto-generated method stub
        double aver = 0;
        for (int i = 0; i < score.length; i++) {
            aver += score[i];
        }
        aver = aver / score.length;
        return aver;

    }

}