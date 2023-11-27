package chat_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));

//        System.out.println(s1.equals(s2)); //=false, equals= 문자용 내용이 같으면 true, 다르면 false
//        System.out.println(s1.equals("Java")); // =true
//        System.out.println(s2.equals("python"));//=false 대소문자 정확히 써야함.
//        System.out.println(s2.equalsIgnoreCase("python"));//=ture, 대소문자 구분없이 문자내용이 같은지 여부 체크
//
//        //문자열 비교 심화
//        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보(참조)
//        s2 = "1234"; // 식당에 화장실 이용하려하는데 비번이 벽에 붙어있으면 모든 사람들이 메모지 하나만 참고해서 화장실을 감.
//        System.out.println(s1.equals(s2));//=true, 참조하는 곳의 "내용"을 비교하는 것 , java에서 문자열의 내용 비교할때 등호x 이퀄o
//        System.out.println(s1 == s2); // true , "참조"s1,s2 가 같은지를 비교하는 것
//
//        s1 = new String("1234"); // new String 각각의 서로 다른 메모지에 비번을 적은 다음에 각 테이블 손님들에게 나눠줌
//        s2 = new String("1234"); // 비번도 다를 것임.
//        System.out.println(s1.equals(s2)); //true , equals:내용이 같은지, ==:참조 s1,s2가 같은지?, new일땐 X
//        System.out.println(s1 == s2); //false,

    }
}
