package chat_02;

public class _01_Operator1 {      //산술 연산자
    public static void main(String[] args) {
        //일반 연산
        System.out.println(4+2); // 6
        System.out.println(4-2); // 2
        System.out.println(4*2); // 8
        System.out.println((4/2)); // 2
        System.out.println(5/2); // 2.5인데 뒤 소숫점은 없어져서 : 2로 나옴
        System.out.println(2/4); // 0.5인데 : 앞에 0만 나옴
        System.out.println(4%2); // %는 몫 말고 나머지만 나옴
        System.out.println(5%2); // 1 , 나머지가 나옴

        /*// 우선 순위에 따른 연산
        System.out.println(2+2*2); // 6
        System.out.println((2+2)*2)); // 8
        System.out.println((2+(2*2)); // 6
       */
        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a+b;
        System.out.println(c); //30

        c = a-b;
        System.out.println(c); // 10

        c = a*b;
        System.out.println(c); // 200
        c = a/b;
        System.out.println(c); // 2
        c = a%b; // 몫 말고 나머지만
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val);// 11, val++; 로 대체 가능, ++val은 1먼저 더하고 함
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10을출력하고 나서 다음 밸류에다가 1을 더함 일단:10
        System.out.println(val); // 11

        //감소
        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기:0
        System.out.println("대기 인원 : " + waiting++); // 대기 1
        System.out.println("대기 인원 : " + waiting++); // 대기 2
        System.out.println("총 대기 인원: " + waiting); // 총 대기 인원 3

    }

}
