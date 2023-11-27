package chat_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열 활용, 쇼핑몰에서 구매 가능한 신발 사이즈 옵션 출력하는 프로그램 작성
        // 신발 사이즈는 250부터 295까지, 5단위로 증가 / 신발 사이즈 수는 총 10가지
        // 사이즈 250 (재고있음) 이런식으로 , 255,260,,,
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + ( 5 * i );
        }
        for (int size: sizeArray) {
            System.out.println("사이즈 " + size + " (재고있음)");

        }
    }
}
