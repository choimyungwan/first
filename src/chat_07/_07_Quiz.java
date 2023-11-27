package chat_07;

public class _07_Quiz {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheesBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-----------");

        for (HamBurger hamBurger : hamBurgers){
            hamBurger.cook();
            System.out.println("-------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다");
    }
}
class HamBurger{
    String name;

    HamBurger(){
        this.name = "햄버거";
    }
    void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println(">양상추 \n " + "+ 패티 \n" + "+ 피클");
    }
}
class CheesBurger extends HamBurger{
    String name;

    CheesBurger(){
        this.name = "치즈버거";
    }
    void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println(">양상추\n " + "+ 패티 \n" + "+ 피클\n" + "+ 치즈");
    }
}
class ShrimpBurger extends HamBurger{
    String name;

    ShrimpBurger(){
        this.name="새우버거";
    }
    void cook(){
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println(">양상추 \n " + "+ 패티 \n" + "+ 피클\n"+ "+ 새우");
    }
}
