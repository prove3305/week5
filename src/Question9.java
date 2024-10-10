import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;



        do{
            System.out.println("나이를 입력해주세요: ");
            int x = sc.nextInt();
            i = x;

        } while(i == 0);


        System.out.println("사용자의 나이는:"+i+"입니다.");

    }
}
