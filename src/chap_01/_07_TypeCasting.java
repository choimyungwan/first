package chap_01;

import java.sql.SQLOutput;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형 변환 TypeCasting
        // 정수형에서 실수형으로, 실수형에서 정수형으로 변환시켜주는

        // int score = 93+98.8; // int:정수형, double:실수형, int만 써서 빨간줄 뜸
        // 정수->실수로 변환
        int score = 93;
        System.out.println(score); // 93으로 뜸.
        System.out.println((float)score); // 93.0 print 안에 실수형 넣으면 실수로 뜬다.
        System.out.println((double)score); // 93.0

        //실수에서 정수
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98로 나옴

        //정수+실수 연산
        score = 93 + (int)98.8; // 93+98이 되는거임.
        System.out.println(score);

        score_d = 93+98.8; // 93.0+98.8이 됨 , 93앞에 (double) 안붙여도 됨.
        System.out.println(score_d); // 191.8

        // 변수에 형변환된 데이터 집어 넣기
        double comvertedScoreDouble = score; // 191 -> 191.0으로 자동으로 형변환 된 것
        // int-> long-> float-> double (자동 형변환)

        int comvertedScoreInt = (int)score_d; // 191.9 -> 191로 변환, 실수에서 정수로 형변환 하려면 무조건 앞에 (int) 넣음
        //double->float->long->int로 갈때는 수동으로 위처럼 형변환 해줘야함

        //정수 숫자를 문자열로 바꾸려면?
        String s1 = String.valueOf(93); // String이라는 클래스가 제공해주는 valueOf 기능을써서 93을 문자열로 바꿔주는 것
        //s1 = Integer.toString(93); // toString:문자열로 변환해주는 기능, 이것도 사용 가능, 같이 써도됨
        System.out.println(s1); // 93


        String s2 = String.valueOf(98.8); // 실수를 문자열로
        //s2 = Double.toString(98.8); 위처럼 이것도 사용 가능
        System.out.println(s2); // 98.8

        //정수 형태의 문자열을 숫자로 바꿔보기
        int i = Integer.parseInt("93"); // 문자열을 정수로
        System.out.println(i);
        //실수형태의 문자열을 double
        double d = Double.parseDouble("98.8");
        System.out.println(d);

        int error = Integer.parseInt("자바"); // int라는 error변수,
        //parseInt,partDouble로 문자->숫자로 변환시킬때는 따옴표속에 데이터가 올바로 들어가 있어야 한다., "자바"는 틀림

    }
}
