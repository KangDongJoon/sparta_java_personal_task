package calculator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 정수 Scanner로 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        
        // 사칙연산 Scanner로 입력받기
        System.out.print("사칙연산 기호를 입력하세요: "); // (+, -, *, /)
        // charAy(index) : charAt 메서드는 매개변수로 char 타입으로 변환하고자하는 문자열(String)의 위치(index)를 받는다.
        char sym = sc.next().charAt(0);
    }
}
