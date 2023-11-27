package chat_04;

public class _03_elseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고주스가 있으면 +1
        // 또는 아이스 아메리카노 +1

        boolean hanlabong = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 쥬스

        if (hanlabong==true){
            System.out.println("한라봉 에이드 +1");
        } else if(mangoJuice){
            System.out.println("망고쥬스 +1");
        }
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");

        // else if 는 여러번 사용 가능.
        hanlabong = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hanlabong==true){
            System.out.println("한라봉 에이드 +1");
        } else if(mangoJuice){
            System.out.println("망고쥬스 +1");
        }
        else if (orangeJuice){
            System.out.println("오렌지 쥬스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");

    }
}