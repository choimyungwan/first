package chat_05;

public class _05_Ascii {
    public static void main(String[] args) {
        // 아스키 코드 : 미국 표준 코드
        char c = 'A'; // 알파벳 대문자는 65부터 시작, 소문자는 97부터 시작 -> 소문자 a 넣으면 a,97 나옴, 숫자(0)은 48부터 시작
        System.out.println(c); // A
        System.out.println((int)c); // 65

        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 66

        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 67
    }
}
