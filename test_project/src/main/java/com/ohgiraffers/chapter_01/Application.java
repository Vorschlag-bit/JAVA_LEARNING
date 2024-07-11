import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 시작점
        int START = 1;
        // 방
        int ROOM = 1;
        // 둘레(범위)
        int RANGE = 0;
        while(true) {
            RANGE += ROOM * 6;
            if(n <= RANGE) {
                System.out.println(ROOM + 1);
                break;
            }
            ROOM++;
        }
    }
}