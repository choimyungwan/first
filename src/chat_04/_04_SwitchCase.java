package chat_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 1등: 전액 장학금 // 2등: 반액 장학금 // 3등: 반액 장학금 // 그 외: 장학금 대상X

        //if else문 이용,(여러 조건 or 범위에 해당하는 조건일 경우 사용)

        int ranking = 1; // 등수 , 2,3등이면 반액장학금
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액장학금");
        } else if (ranking == 3) {
            System.out.println("반액장학금");
            /*else if (ranking == 2 || ranking == 3){
            System.out.println("반액장학금");*/     // 이것도 가능
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회가 완료되었습니다 #1");

        // Switch case 문 이용 (명확한 케이스가 있는 경우)

        ranking = 1;
        switch(ranking){ // 스위치 내부에 있는 값을 가지고 확인함
            case 1:
                System.out.println("전액장학금");//수행할 명령들
                break; // 스위치케이스의 모든 문장을 빠져나오는 역할
            case 2:
                System.out.println("반액장학금");
                break;
            case 3:
                System.out.println("반액장학금"); // 밑에 줄은 case2와 같은 "반액장학금"이라 뜸
                break;
            default: //그 외의 경우
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료");

        // case2와3을 통합
        ranking = 2;
        switch(ranking){ // 스위치 내부에 있는 값을 가지고 확인함
            case 1:
                System.out.println("전액장학금");//수행할 명령들
                break; // 스위치케이스의 모든 문장을 빠져나오는 역할
            case 2: // 같은 값일때 아무것도 안 써도 됨
            case 3:
                System.out.println("반액장학금"); // 밑에 줄은 case2와 같은 "반액장학금"이라 뜸
                break;
            default: //그 외의 경우
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정(1급:최상, 4급:최하)
        int grade = 1; // 1등급
        int price = 7000; // 기본 가격, grade 4나 그 외는 7000원
        switch (grade){
            case 1:
                price += 1000; // price=price+1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        //1등급 제품의 가격 : 10000원 등등 이렇게 나옴
        //2등급 제품의 가격 : 9000원 등등

        /* int score = 95; // 95점
        if (score>=90)  //범위에 해당하면 if, 명확한 값으로 나와질때는 switch case
            System.out.println("A"); */
    }
}
