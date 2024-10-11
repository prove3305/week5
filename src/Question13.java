import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = " ";

        do
        {
            System.out.println("패스워드를 입력해 주세요: ");
            password = sc.nextLine();
        }while (!password.equals("1234")); // 문자로 비교시 equals 사용   String은 참조형
        System.out.println("성공");
    }
}
