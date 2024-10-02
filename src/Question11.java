import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i*2-1; k++){
                System.out.print("*");
            }
                System.out.println("");
        }




    }
}
