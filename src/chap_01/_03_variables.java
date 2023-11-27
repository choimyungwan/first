package chap_01;

public class _03_variables {                            //변수:어떤 데이터 값을 저장하는 공간.
    public static void main(String[] args) {
        String name = "명환";
        int hour = 15;
        System.out.println(name + "님 " + hour + "시에 택배 도착 예정입니다.");


        double score = 90.5;
        char grade = 'A';
        name = "권준";
        System.out.println(name + "님의 평균 점수는" + score + " 점입니다.");
        System.out.println(name +" 님의 학점은" + grade + " 입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격 했을까요" + pass);

       int i = 100000; // int는 -21억~ 21억까지

    }
}

// 마무리->  정수:int,long / 실수:float,double(정밀) / 하나의문자 표현: char, 여러문자:String / 참or거짓:boolean