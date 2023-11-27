package chat_07;

public class BlackBox {

    // 설명서, 설계도 라고 한다. 블랙박스 라는 클래스의 설계도 중에 4가지 데이터
    // b1 or b2 객체가 다른 값들을 가지고 있는..

    // 4개의 인스턴스 변수다. (필드라고도 함)
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상

    static boolean canAutoReport = false; // 자동 신고 기능

    BlackBox() {
        System.out.println("기본 생성자 호출");
    }

    void autoReport(){
        // 자동신고기능 하는 메소드
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + " GB 입니다.");
    }

    // 블박 내 저장되어 있는 영상 갯수 반환하는 메소드
    int getVideoFileCount(int type) {
        if (type == 1){ // 일반 영상
            return 9; // 일반 영상 9개
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다");
        if(showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + " 분 단위로 기록됩니다.");
    }

    void record() {
        record(true,true,5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");

    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }
}
