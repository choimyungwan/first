package chat_06;

public class _03_return {    // 반환형태, void 대신에 string,int,double,boolean 등 가능
    // 호텔 전화번호,주소,엑티비티
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 어딘가";
    }

    public static String getActivities(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String address = getAddress();
        System.out.println("호텔주소 : "+ address);

        System.out.println("호텔 엑티비티 : " + getActivities());
    }
}
