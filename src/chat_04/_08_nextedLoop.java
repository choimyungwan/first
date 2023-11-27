package chat_04;

public class _08_nextedLoop {
    public static void main(String[] args) {
        // 이중 반복문, 앞은 모두 1차원적 반복문이었음
        // 예제, 별(*) 사각형
        /*
        *****
        *****
        *****
        *****
        *****
         */
        for(int i=0; i<5; i++){ // i는 가로줄 수 역할
            for (int j = 0; j<5; j++) { // j는 세로줄 *갯수
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------");
        // 별(*) 왼쪽 삼각형 만들기
        /*
        *
        **
        ***
        ****
        *****
         */
        for (int i = 0; i < 5; i++) { // 첫번째 반복문은 세로횟수 역할.// 가로아님 ?
            for (int j = 0; j < i+1; j++) { // j는 세로줄 별 더하기, 내려가면서
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------");


        // 별 * 오른쪽 삼각형 만들기
        /*
         SSSS*
         SSS**
         SS***
         S****
         *****
         */
        for (int i = 0; i < 5; i++) { // i는 세로줄 수
            for (int j = 0; j < 4-i; j++) { // S(공백)가 위에서부터 줄어듦 // 위에는 코드가 한줄 비었음. 공백이 그냥 나왔기 때문
                System.out.print(" "); // S 대신 공백 써도됨.            // 공백을 또 따로 만들어준거임. 그리고 별 채우기
            }
            for (int k = 0; k <i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
