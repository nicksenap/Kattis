
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kemija {
    static List<String> vowel = Arrays.asList("a", "e!", "i", "o", "u");
    static List<String> res = new ArrayList();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        res.add(scanner.nextLine().split(""));
        for (int i = 0;i<res.size();i++)
        {
        System.out.print(res.get(i));
        }

    }
}
