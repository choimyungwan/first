package chat_03;

public class _01_String1 {
    public static void main(String[] args) {
        // 문자열 1
        String s = "I like java and Python and C.";
        System.out.println(s); // 그대로 다 나타남
        //문자열의 길이 숫자를 나타낼 때, length
        System.out.println(s.length()); //29 -> 변수.length
        //대소문자 변환
        System.out.println(s.toUpperCase()); //대문자
        System.out.println(s.toLowerCase()); //소문자

        //포함 관계 (어디에 포함되어 있는지)
        System.out.println(s.contains("java"));// 포함된다면true, / 포함안되면 false  contain:포함
        System.out.println(s.contains("C#"));// 포함되지 않으면 false
        System.out.println(s.indexOf("java"));//=7,"위치정보", 문자열의 첫번째 위치는 0부터 시작함!
        System.out.println(s.indexOf("C#"));// 포함되지 않는다면 -1이라고 뜸
        System.out.println(s.indexOf("and"));//=12,c,처음 위치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 위치하는 위치 정보

        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true, 아니면 false
        System.out.println(s.endsWith("."));// 이 문자열로 끝나면 true, 아니면 false



    }
}
