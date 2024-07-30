package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) throws ZeroDivException, NotDefOpException {
        Calculator c1 = new Calculator();
        Scanner sc = new Scanner(System.in);
        int index = 0;


        System.out.print("원의 넓이를 구하려면 1번을, 계산기를 사용하려면 숫자 2번을 입력해주세요.");
        int choice = sc.nextInt();
        String input;
        if (choice == 1) {
            do {
                System.out.print("반지름의 길이를 입력하세요:");
                int num1 = sc.nextInt();

                double result = c1.calculateCircleArea(num1);
                System.out.println("결과 : " + result);
                c1.getCircleAreaList().add(result);

                System.out.println("결과 리스트를 출력 하시겠습니까? (y 입력 시 출력)");
                input = sc.next();
                if (input.equals("y")) {
                    c1.printCircleResult(c1.getCircleAreaList());
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = sc.next();
            } while (!input.equals("exit"));
        } else if (choice == 2) {
            do {
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                String operator = sc.next();

                try {
                    int result = c1.calculate(num1, num2, operator);
                    System.out.println("결과 : " + result);
                    c1.getResultList().add(result);
                } catch (NotDefOpException e) {
                    System.out.println(e.getMessage());
                } catch (ZeroDivException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                input = sc.next();
                if (input.equals("remove")) {
                    c1.getResultList().remove(index);
                    index++;
                }

                System.out.println("결과 리스트를 출력 하시겠습니까? (y 입력 시 출력)");
                input = sc.next();
                if (input.equals("y")) {
                    c1.printResult(c1.getResultList());
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                input = sc.next();
            } while (!input.equals("exit"));
        } else {
            System.out.println("1 또는 2중에 입력해주세요.");
        }


    }
}
