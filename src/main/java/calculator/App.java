package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 연산 결과를 저장하는 배열 생성 및 결과가 저장 될 때마다 카운팅 될 index 변수 생성
        // int[] arr = new int[10]; → Level-7번을 위해 주석처리
        List<Integer> li = new ArrayList<Integer>();
        int index = 0;

        Scanner sc = new Scanner(System.in);

        String input;
        do{
            // 두 정수 Scanner로 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 사칙연산 Scanner로 입력받기
            System.out.print("사칙연산 기호를 입력하세요: "); // (+, -, *, /)
            // charAy(index) : charAt 메서드는 매개변수로 char 타입으로 변환하고자하는 문자열(String)의 위치(index)를 받는다.
            // Stirng 보다 char이 단일문자를 처리할 땐 메모리와 속도에서 이점이있다.
            char sym = sc.next().charAt(0);

            // 연산을 진행 후 결과값 출력
            // switch(val) : val값에 따라 case별 명령어를 수행
            int result = 0;
            switch (sym) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다. 두 번째 숫자를 0이아닌 다른값으로 입력해 주세요/");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("사칙연산 기호를 잘못 입력하셨습니다[+, -, *, /] 4개중 하나를 입력해주세요.");
            }
            System.out.println("결과: " + result);

            /*
            // 결과를 index에 저장하고 index 후위증감연산 진행
            arr[index] = result;

            → Level-7번을 위해 주석처리
             */
            // 결과를 li.add(result)를 통해 저장
            li.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            // remove라는 문자열을 입력받으면 li의 처음 값을 삭제 ex) 0값이 삭제되면 이제 1의값이 첫 번째가된다.
            input = sc.next();
            if(input.equals("remove")){
                li.remove(index);
                index++;
            }

            /*
            // 마지막 인덱스는 9이다. 만약 index가 증가 후 10이 되버리면 배열을 한칸씩 당기고 다음 결과값을 다시 9의 위치에 대입한다.
            if(index > arr.length - 1){
                index = 9;
                // 배열을 초과하여 입력할 때 ex) arr[0] = arr[1] 이런식으로 한칸씩 당긴다.
                for(int i = 0; i < arr.length - 1; i++){
                    arr[i] = arr[i + 1];
                }
            }
            → Level-7번을 위해 주석처리
             */

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            input = sc.next();
        }while (!input.equals("exit"));
    }
}
