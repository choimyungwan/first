package chat_05;

public class _03_MultyArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        // A1 - A5
        // B1 - B5
        // C1 - C5 총 15자리의 좌석

        String[] seatA = {"A1","A2","A3","A4","A5"};
        String[] seatB = {"B1","B2","B3","B4","B5"};
        String[] seatC = {"C1","C2","C3","C4","C5"};

        // 3X5 크기의 2차원 배열 (세로,가로)인가
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        // B2에 접근하려면?
        System.out.println(seats[1][1] );

        // C5에 접근하려면?
        System.out.println(seats[2][4]);


        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1","A2","A3" },
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        // A3에 접근 하려면
        System.out.println(seats2[0][2]);

        // A5에 접근 하려면
        //System.out.println(seats2[0][4]); // A5는 없다. 범위 벗어남

        // 3차원 배열도 해보기 ( 세로x가로x높이 )
        String[][][] marray = new String[][][] {
                { {}, {}, {} },
                { {}, {}, {} },
                { {}, {}, {} },
        };

    }
}
