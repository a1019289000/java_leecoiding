import java.util.*;

public class stack {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int count=scanner.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int i=1;i<=count;i++){
                int key=scanner.nextInt();
                int value=scanner.nextInt();
                if (map.containsKey(key)){
                    map.put(key,value+map.get(key));
                }else{
                    map.put(key,value);
                }
            }
            Set<Integer> set=map.keySet();
            set.stream().sorted((a,b)->a-b).forEach(a->{
                System.out.println(a+" "+map.get(a));
                    }
            );
        }
    }
}
