package chat_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "i like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));//and를 콤마로 변환, 공백포함한 and까지 적어줌
        //프로그래밍 언어의 종류만 출력하고 싶다?
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작(이전 내용은 삭제됨), 7을찾으려면 indexOf("Java")
        System.out.println(s.substring(s.indexOf("Java"))); //위,아래 같음.
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));// 자바부터 시작해서, 점 빼고 끝 위치 직전까지만 나타냄
    // 문자열 자르기 substring 여기 안에 시작 index, 끝 index 넣고 원하는 값 출력가능
        //공백 제거
        s = "      I love Java.     "; // 불필요 공백이 앞 뒤로있음
        System.out.println(s); // 기본
        System.out.println(s.trim());// 앞뒤 공백 제거

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python"; // 합쳐서 출력
        System.out.println(s1+s2);
        System.out.println(s1+ "," + s2); // 콤마 넣어줌 = Java,Python
        System.out.println(s1. concat(",").concat(s2)); // = Java,Python
    }
}
