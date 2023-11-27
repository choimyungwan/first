package chat_05;

public class pr {
    public static void main(String[] args) {
//
//      int[] shoes = new int[] {250,255,260,265,270,275,280,285,290,295};
//
//        for (int i = 0; i < shoes.length ; i++) {
//            System.out.println(shoes[i] + " (재고 있음) ");
//        }
//        System.out.println();
//        ///////////////////////////////////////////////////

        int[] shoes1 = new int[10];
        for (int i = 0; i < shoes1.length; i++) {
            shoes1[i] = 250+(5*i);
            System.out.println("사이즈 " + shoes1[i] + " 재고 있음");

        }

        System.out.println();
    }
}
