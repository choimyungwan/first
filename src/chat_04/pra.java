package chat_04;

public class pra {
    public static void main(String[] args) {
       int hour = 5;
        int yogum = hour*4000;
       boolean smallCar = false;
       boolean jangCar = false;

       if(yogum>30000){
           yogum = 30000;
       }
       if(smallCar || jangCar){
           yogum = yogum/2;
       }
        System.out.println("주차 요금은 " + yogum + " 원 입니다.");
    }
}