import java.util.Scanner;

public class Question7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요: ");
        int num = sc.nextInt();
        int result = 1;
        for (int i=1; i<=num; i++)
        {
            result *= i;
        }
        System.out.println("팩토리얼 값은:"+result);
    }
}
// 이게왜 안돼?????-- 해결
