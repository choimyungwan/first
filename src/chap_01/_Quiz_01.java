//문제: 버스 도착 정보를 출력하는 프로그램 작성, 각 정보는 적절한 자료형의 변수에 정의함
//정보: 버스번호는"1234", "상암08"과 같은 형태
//남은 시간은 분 단위 (예:3분,5분) , 남은 거리는 km 단위(예:1.5km, 0.8km)
/*
package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String bus = "상암08";
        String bus2 = "1234";
        int i = 3;
        double km = 1.2d;
        System.out.println(bus + "번 버스");
        System.out.println("약" + i + "분 후 도착");
        System.out.println("남은거리" + km + "km");
    }
}*/
//답지
package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
    String bus = "1234";
    int minute = 5;
    double km = 0.8;
        System.out.println(bus + " 버스\n" + "약 " + minute + " 분 후 도착\n" +
                "남은거리 " + km + " km입니다");

    }
}