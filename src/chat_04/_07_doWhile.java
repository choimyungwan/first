package chat_04;

public class _07_doWhile {
    public static void main(String[] args) {
        // 반복문 doWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m
        while(move+height < distance){
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 " + move );
            move +=3; // 3m 이동
        }
        System.out.println("도착했습니다");

        System.out.println(" ----반복문 #1 ----" + "");

        // 키가 엄청나게 큰 사람이 수영
        move = 0;
        height = 25; // 키가 25m
        while(move+height < distance){ // 25m+move0 이니까.. 이 조건은 거짓이 됨 / 조건이 참일때 밑에서 계속 돈다.
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 " + move );
            move +=3; // 3m 이동
        }
        System.out.println("도착했습니다");

        System.out.println("반복문 #2");

        // Do While 반복문
        do {
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while(move+height < distance);
        System.out.println("도착했습니다");
    }
}
