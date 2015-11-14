import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for (int i = 0;i<count;i++){
            int candidate = scanner.nextInt();
            if (candidate%2==0){
                System.out.println(candidate + " is even");
            }else{
                System.out.println(candidate + " is odd");
            }
        }

    }
}
