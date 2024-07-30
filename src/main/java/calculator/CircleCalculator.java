package calculator;

import java.util.List;

public class CircleCalculator extends Calculator {
    public double calculateCircleArea(int num) {
        return Math.pow(num, 2) * 3.14;
    }

    public void printCircleResult(List<Double> circleAreaList) {
        for (double n : circleAreaList) {
            System.out.println(n);
        }
    }
}
