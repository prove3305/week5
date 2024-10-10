import java.util.Scanner;

public class Question6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 2개를 입력해 주세요: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = 1;

        int max = 0;

        while (i <= num1 && i <= num2)
        {
            if (num1 % i == 0 && num2 % i == 0)
            {
                max = i;
            }
            i++;
        }
        System.out.println("최대 공약수는" + max + "입니다.");



    }
}

/*System.out.println("숫자 2개를 입력해 주세요:"); //첫 코드
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = 0; //최대 공약수

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1%i==0 && num2%i==0) {
                num3 = i;
            }
        }
        System.out.println("최대 공약수는"+num3+"입니다."); */
