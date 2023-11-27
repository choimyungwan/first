package chat_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // ture, 참이면 true, 거짓이면 false로 결과값 나옴
        System.out.println(5 >= 3); // false
        System.out.println(5>=5); // true
        System.out.println(5>=7); // false

        System.out.println(5<3); // false
        System.out.println(5<=3); // false
        System.out.println(5==5); // true, 5는 5와같다
        System.out.println(5==3); // false, 5는 3과같다
        System.out.println(5!=5); // 5는 5와 같지 않다 (false)
        System.out.println(5!=3); // 5는 3과 같지 않다 (ture)
    }
}
