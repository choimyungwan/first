package chat_04;

//조건문 활용 주차 요금 정산 프로그램 작성
// 조건: 주차요금은 시간당 4000원(일일 최대 요금 30000원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 실행결과: 일반 차량 5시간 주차 시 20000원-> 주차 요금은 20000원 입니다
// 경차 5시간 주차 시 10000원 -> 주차 요금은 10000원 / 장애인 차량 10시간 주차시 15000원, -> 주차 요금은 15000원 입니다.
// 실행결과: 주차 요금은 xx 원입니다.
public class _Quiz_04 { // 변수 3개 중 하나를 나타낼 때는, 나머지 변수2개를 boolean으로 나타내면 좋다.
    public static void main(String[] args) {
        int hour = 5; // 주차시간 5시간
        boolean smallCar = false; // -> 10000원
        boolean disabled = false; // -> hour 10 시 15000원
        int si = hour * 4000; // 주차요금 (시간당 4000원)

        if (si>30000){ // 일일 최대요금 3만원이니까, 그 이상 넘어가도 3만원으로 설정
            si = 30000;
        }
        if(smallCar||disabled){ // 경차 또는 장애인차가 참일때
            si = si/2;
        }
        System.out.println("주차 요금은 " + si + " 원 입니다");
    }
}