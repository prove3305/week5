import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;

        do {

            System.out.println("1 이상의 숫자를 입력해 주세요");
            num = input.nextInt();


        }while (num<1);{
            System.out.println("입력한 값은 - "+ num);


        }

    }
}
