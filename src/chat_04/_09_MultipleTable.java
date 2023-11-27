package chat_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단 만들기 ex) 2*1=2
        for (int i = 2; i <10; i++) { // 가로 줄 9개까지.
            for (int j = 1; j <10 ; j++) {
                System.out.println(i +" * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
}