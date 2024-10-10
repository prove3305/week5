import java.util.Scanner;

public class Question7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력해 주세요.: ");
        double num = sc.nextDouble();

        for (double i=1; i<num; i++)
        {
            num *= i;
        }
        System.out.println("팩토리얼 값은:"+num);
    }
}
// 이게왜 안돼?????
