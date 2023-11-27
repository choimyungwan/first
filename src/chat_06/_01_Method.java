package chat_06;

public class _01_Method {
    //메소드 정의
    public static void hiHello() {
        System.out.println("새로운 메소드");
    }

// 메소드: 어떤 기능을 하는 코드들의 묶음
    public static void main(String[] args) {
        //메소드 호출
        System.out.println("메소드 호출 전");
        hiHello(); // 새로운 메소드
        hiHello();
        System.out.println("메소드 호출 후");

    }
}
