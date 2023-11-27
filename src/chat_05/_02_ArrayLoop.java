package chat_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회 , 1차원 배열
        String[] coffees = {"아메키라노", "카페모카", "라떼", "카푸치노" };

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]+ " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) { // 배열의 크기를 알려주는, 위에랑 같다.
            System.out.println(coffees[i]+ " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees) { // 커피즈라는 배열 값들을 순회하는데, 순회되는 값을 커피라는 이름을 받아서 사용하겠다.
            System.out.println(coffee +" 하나");
        }
        System.out.println("주세요");
    }
}
