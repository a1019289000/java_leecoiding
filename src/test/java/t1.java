import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            String a=scanner.next();
            System.out.println(count(s,a));
        }

    }
    public static int count(String s,String a){
        int res=0;
        for (int i=0;i<s.length();i++){
            if (s.substring(i,i+1).equals(a) || s.substring(i,i+1).equals(a.toLowerCase())  || (s.substring(i,i+1)).equals(a.toUpperCase())){
                res++;
            }
        }
        return res;
    }
}
