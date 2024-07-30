package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) throws ZeroDivException, NotDefOpException {
        Calculator c1 = new Calculator();

        try{
            int result = c1.calculate(2,1,"s");
            System.out.println(result);
        }catch (NotDefOpException e) {
            System.out.println(e.getMessage());
        }catch (ZeroDivException e) {
            System.out.println(e.getMessage());
        }
    }
}
