package chat_06;

public class _02_Parameter {
    public static void power(int num) {
        //전달값이 있는 메소드
        int result = num * num;
        System.out.println(num+ " 의 2 승은 " + result);
    }

    public static void powerByExp(int num, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * num;
        }
        System.out.println(num + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, 2 -> 2*2=4 // 3-> 3*3=9
        power(2);
        power(4);
        powerByExp(2,2);
        powerByExp(4,3);
    }
}
