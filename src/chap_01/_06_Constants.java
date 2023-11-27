package chap_01;

public class _06_Constants {            //변수:변하는 수, 상수:변하지 않는 수
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // 국가번호(빨리) // final쓰면 상수로.
         // KR_COUNTRY_CODE = "+8282"; , 만약 final 안쓰고 String만 썼으면 +8282로 값나옴
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; // 원주율 , 상수화 시킴 바뀌면 안되기 때문
        final String DATE_OF_BIRTH = "1996-02-09"; // 생년 월일, 상수(final)로 만들때는 무조건 대문자를 씀


    }
}
