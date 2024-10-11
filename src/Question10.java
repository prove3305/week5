import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요:");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++)
        {
            sum += i; // sum += num;에서 수정
            if(i >= 100)  // (sum >= 100) 에서 수정
            {
                break;
            }
        }
    System.out.println("1부터 n 까지의 핪은"+sum+"입니다.");
    }
}
