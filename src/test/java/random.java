import java.util.ArrayList;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int count=scanner.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for (int i=1;i<=count;i++){
                int num=scanner.nextInt();
                if (!arr.contains(num)){
                    arr.add(num);
                }

            }
            arr.stream().sorted((a, b)->a-b).forEach(System.out::println);
        }
    }
}
