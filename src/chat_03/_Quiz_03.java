package chat_03;
// 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램
// 참고: 주민번호는 13자리의 숫자로 구성/ 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
// 입력 데이터는 -을 포함한 14자리의 문자열 형태
// 예시: "901231-1234567"인 경우, 901231-1 까지 출력
//      "030708-4567890"인 경우, 030708-4 까지 출력
// 내가 만든것 아래
/*
public class _Quiz_03 {
    public static void main(String[] args) {
        String a = "901231-1234567";
        System.out.println(a.substring(a.indexOf("901231"), a.lastIndexOf("2")));
        String s = "030708-4567890";
        System.out.println(s.substring(s.indexOf("030708"), s.lastIndexOf("5")));
    }
}*/
 //문자열 자르기: subString: 0(처음)부터,X 직전까지 나타내주는 -> substring(a,b): a번부터~ b-1까지 출력해줌
public class _Quiz_03 {
    public static void main(String[] args) {
        String s = "901231-1234567";
        System.out.println(s.substring(0,8));
    }
}