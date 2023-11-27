package chat_02;
//어린이 키에 따른 놀이기구 탑승 여부를 확인하는 프로그램 작성
//조건:키가 120cm이상인 경우 탑승 가능, 삼항 연산자 이용
//실행결과: 키가 115cm 이므로 탑승 불가능합니다
//         키가 121cm이므로 탑승 가능합니다
/*public class _Quiz_02 {        이것처럼 값을 넣는 문제엔 115,121 쓸 필요 없음
    public static void main(String[] args) {
        int x = 115;
        int y = 121;
        String max = (x>=y)? "키가 121cm이므로 탑승가능":"키가 115cm이므로 탑승 불가";
        System.out.println(max);
        String min = (x<=y)? "키가 121cm이므로 탑승가능":"키가 115cm이므로 탑승 불가";
        System.out.println(min);
    }
}*/

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 140;

        String m = (height>=120)? "키가 " + height + "이므로 탑승가능" : "키가" + height+ " 이므로 탑승 불가능";
        System.out.println(m);
    }
}

