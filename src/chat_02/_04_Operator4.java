package chat_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;
        System.out.println(김치찌개||계란말이||제육볶음); // ||는 or 이다. => true
        System.out.println(김치찌개&&계란말이&&제육볶음); // &&은 and 이다. => false 하나라도 해당안되면 거짓

        // AND 연산
        System.out.println((5>3)&&(3>1)); // true: 5는3보다크고, 3은1보다크다
        System.out.println((5>3)&&(3<1)); // false: 5는3보다크고, 3은1보다작다
        // OR 연산
        System.out.println((5>3)||(3>1)); // true: 5는3보다크거나 3은1보다 크다.
        System.out.println((5>3)||(3<1)); // true: 5는3보다크거나 3은1보다 작다. -> OR이기 때문에 둘중 하나만 맞음 됨

        System.out.println((5<3)||(3<1)); // false: 5는 3보다 작거나 3은1보다 작다
        //System.out.println(1<3<5);<< 이건 안됨.

        //논리 부정 연산자 : true를false로 false를true로
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5==5)); // = false
        System.out.println(!(5==3)); // = true , 앞에 느낌표 붙이면 반대로 나옴



    }
}
