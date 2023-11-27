package chat_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
        // \n:줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // 해물파전     9000원
        // 김치전      8000원
        // 부추전      8000원 탭 누르면 어느정도 비슷하게 나옴
        // \t: 탭
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        // 폴더, 파일경로는 역슬래쉬(\\)를 2번 쳐줘야 함
        System.out.println("C:\\Program Files\\Java");

        //단비가 "냐옹"이라고 했어요를 출력하기 위해, \": 큰 따옴표 출력
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        // \':작은 따옴표 , 단비가'뭘봐'라고 표정을 지었어요
        System.out.println("단비가 \'뭘봐\' 라고 표정을 지었어요.");

        char c = 'A';
        c ='\''; // 작은 따옴표 하나만 출력됨
        System.out.println(c);
    }
}
