package chat_07;

public class _04_Method {
    public static void main(String[] args) {
        // 블랙박스라는 클래스에 메소드를 정의하는거 연습~
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.autoReport(); // 현재는 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard(256);

        // 일반 영상 : 1 (type)
        // 이벤트 영상 (충돌 감지) : 2 (type)
        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}
