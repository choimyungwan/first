package chat_02;

public class _05_Operator {
    public static void main(String[] args) {
        // 삼항 연산자 = 조건 연산자
        // 결과 = (조건) ? (참일경우 결과값) : (거짓의 경우 결과값)
        int x = 5;
        int y = 3; // 두 수 중에 큰 값을 넣고싶으면
        int max = (x>y)? x:y;
        System.out.println(max);//=5 ,만약에, x=3,y=5일때, 조건이 틀렸으니 오른쪽에 있는 y값인 5가 출력된다.

        int min = (x<y)? x:y;
        System.out.println(min);


        // x=3;, y=3; 을 했으면 true 뜸
        boolean b = (x==y)? true:false;
        System.out.println(b); // false

        //x=3,y=3으로 되면 "같다"가 나옴
        String s = (x != y)? "다르다" : "같다"; // x가 y랑같지 않다?
        System.out.println(s); // 다르다
    }
}
