import java.util.Arrays;
import java.util.Scanner;

public class Planting_Trees {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int trees = scanner.nextInt();

        int[] treeList = new int[trees];
        for (int i = 0;i<trees;i++) {
            treeList[i] = scanner.nextInt();
        }
        Arrays.sort(treeList);

        for(int i = 0; i < treeList.length / 2; i++)
        {
            int temp = treeList[i];
            treeList[i] = treeList[treeList.length - i - 1];
            treeList[treeList.length - i - 1] = temp;
        }

        for (int i = 0;i<treeList.length;i++){
            treeList[i] += 2+i;
        }

        Arrays.sort(treeList);

        System.out.print(treeList[treeList.length-1]);

    }

}
