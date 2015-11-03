import java.util.Scanner;
public class Reversed_Binary_Numbers {
    public static void main(String args[]){
        System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(new Scanner(System.in).nextInt())).reverse().toString(), 2));
    }
}
