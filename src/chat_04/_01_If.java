package chat_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 if, 친구랑 커피마시러 가서, 오후 2시전이면 커피, 넘으면 커피x
        int hour = 10; // 오전 10시

        if (hour<14)
            System.out.println("아이스아메리카노 +1"); //하나의 문자만 필요할땐 {}중괄호X 바로 쓰면됨, 써도됨

        if (hour<14) { // 두개 이상의 문자를 쓸 땐 {} 중괄호 필요함
            System.out.println("아이스아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #1");

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피, true:마셨다 로 바꾸면 10시라 해도 2시전에 마셨다 하면 안마셔야된다.
        //if (hour < 14 && morningCoffee == false) {// 앞,뒤 조건이 모두 맞으면 &&씀, false마시지 않음
            if (hour < 14 && !morningCoffee){
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

            // 오후 2시 이후이거나 모닝 커피를 마신 경우? 디카페인으로 주문하기
        hour = 15;
        morningCoffee = true; // false이면 if앞조건이 맞아서 그대로 출력됨
        //if(hour >=14 || morningCoffee==true) { // 14시 이후이거나, 커피를 마신 경우
          if(hour >=14 || morningCoffee){ // 위에 모닝커피가 true니까 그냥 morningCoffee만 써도 됨
            System.out.println("아이스 아메키라노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
