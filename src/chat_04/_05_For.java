package chat_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문
        // 나코라는 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님 들어오면?
        System.out.println("어서오세요. 나코입니다.");

        //만약에 인사 법이 바뀌면
        System.out.println("환영합니다. 나코입니다");

        //매장 이름이 바뀌면? 나코->코나
        System.out.println("환영합니다. 코나입니다");

        //반복문 사용 For
        for (int i=0; i<10; i++ ){ // 선언:값선언, 선언:조건:증감
            System.out.println("어서오세요. 나코입니다."+ i);
        }

        //짝수만 출력, fori만 적고 엔터 누르면 자동으로 나옴
        //0,2,4,6,8만 출력됨.
        for (int i = 0; i <10; i+=2) {
            System.out.println(i);
        }
        //홀수만 출력, 1,3,5,7,9
        for (int i = 1; i < 10; i+=2) {
            System.out.println(i);
        }
        //거꾸로 ,5,4,3,2,1
        for (int i = 5; i>0; i--) {
            System.out.print(i);
        }
        System.out.println(); // 줄바꿈

        //1부터 10까지 수들의 합
        //1+2+...+10 = 55
        int sum = 0;
        for (int i = 1; i<11; i++) {
            sum+=i;
            System.out.println("현재까지 총합은"+sum+"입니다.");
        }
        System.out.println("1부터~10까지의 모든 수의 총합은" + sum + "입니다");
    }
}