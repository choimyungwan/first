package chat_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //대입 연산자
        int num = 10; // 10을 num에 대입
        num = num+2;
        System.out.println(num); // 12

        num = num-2;
        System.out.println(num); // 10. 12에서 -2

        num = num * 2;
        System.out.println(num); // 10*2 = 20

        num = num/2;
        System.out.println(num); // 20/2 = 10

        num = num%2;
        System.out.println(num); // 몫5, 나머지:0, => 0

        // 복합 대입 연산자
        num = 10; // 10으로 다시 초기화

        num+=2; // << num = num+2;
        System.out.println(num); // 12

        num-=2; // num = num-2;
        System.out.println(num); // 10

        num *=2; // num=num*2
        System.out.println(num); // 20

        num/=2; // num = num/2
        System.out.println(num);// 10

        num%=2; // num=num%2
        System.out.println(num); // 0

    }
}
