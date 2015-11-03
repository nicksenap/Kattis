import java.util.Scanner;

public class Conundrum {
    static int count = 0;
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        int length = text.length();
        for (int i = 0;i<length-2;i++){
              if (text.charAt(i)!='P'){
                  count +=1;
                  System.out.println(count+"P"+i);}else{
                  if (text.charAt(i+1)!='E'){
                      count +=1;
                      System.out.println(count+"E"+(i+1));}else{
                      if (text.charAt(i+2)!='R')
                      {count+=1;
                          System.out.println(count+"R"+(i+2));}}}}
    System.out.println(count);
    }
}

