

public class Question8 {
    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        while(i <= 100)
        {
            if(i % 2 == 1)
            {
            sum += i;
            }
            i++;

        }
        System.out.println(sum);
    }
}
