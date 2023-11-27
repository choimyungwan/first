package chat_07;

public class _05_OverLoading {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        // 녹화하는 메소드 만들기
        b1.record(false,false, 10);
        System.out.println("----------------");
        b1.record(true,false,3);
        System.out.println("-----------------");
        b1.record();

    }
}
