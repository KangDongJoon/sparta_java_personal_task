package calculator;

import java.util.*;

public abstract class Calculator {
    private List<Integer> resultList;
    private List<Double> circleAreaList;

    public Calculator() {
        resultList = new ArrayList<>();
        circleAreaList = new ArrayList<>();
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public List<Double> getCircleAreaList() {
        return circleAreaList;
    }
}


