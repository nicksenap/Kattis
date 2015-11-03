import java.util.Scanner;

public class Mixed_Fractions {
    static int a;
    static int b;
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        while (true) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 && b == 0)
            {return;}else{
                System.out.println(a/b+" "+a%b +" "+"/"+" "+b);}
        }
    }
}
