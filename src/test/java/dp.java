import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class dp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int sumMoney=scanner.nextInt();
            int count=scanner.nextInt();
            int[][] goods=new int[count][4];
            for (int i=1;i<count+1;i++){
                for (int j=0;j<3;j++){
                    goods[i-1][j]=scanner.nextInt();
                }
            }
            dpp(goods,sumMoney);
            System.out.println(arr.stream().max((a,b)->a-b).get());
        }
    }
    static ArrayList<Integer> arr=new ArrayList();
    static void dpp(int[][] goods,int sumMoney){
//        int min=sumMoney;
//        for (int j=0;j<goods.length;j++){
//            if (goods[j][0]<min && goods[j][2]==0){
//                min=goods[j][0];
//            }
//            if (goods[j][0]<min && goods[j][2]!=0){
//                if (goods[goods[j][2]-1][3]==0){
//                    if (goods[goods[j][2]-1][0]+goods[j][0]<min){
//                        min=goods[goods[j][2]-1][0]+goods[j][0];
//                    }
//                }else{
//                    if (goods[j][0]<min){
//                        min=goods[j][0];
//                    }
//                }
//            }
//        }
//            int ii=0;
//            for (int i=0;i<goods.length;i++){
//
//                if (goods[i][3]==1){
//                    for (int j=0;j<goods[i].length;j++){
//                        ii=ii+goods[i][0]*goods[i][1];
//
//                    }
//                }
//
//            }
//            System.out.println(ii);
//



        for (int i=0;i<goods.length;i++){
            if (goods[i][2]==0){
                if (goods[i][0]<=sumMoney && goods[i][3]==0){

                        goods[i][3]=1;
                        dpp(goods,sumMoney-goods[i][0]);
                        goods[i][3]=0;
                }
            }else{
                if (goods[i][0]<sumMoney && goods[i][3]==0){
                    if (goods[goods[i][2]-1][3]==0){
                        if (goods[goods[i][2]-1][0]+goods[i][0]<sumMoney){
                            goods[i][3]=1;
                            goods[goods[i][2]-1][0]=1;
                            dpp(goods,sumMoney-goods[i][0]-goods[goods[i][2]-1][0]);
                            goods[i][3]=0;
                            goods[goods[i][2]-1][0]=0;
                        }
                    }
                    else{
                        goods[i][3]=1;
                        dpp(goods,sumMoney-goods[i][0]);
                        goods[i][3]=0;
                    }
                }
            }
        }
        int iii=0;
        for (int i=0;i<goods.length;i++){

            if (goods[i][3]==1){
                    iii=iii+goods[i][0]*goods[i][1];


            }

        }
        arr.add(iii);
    }
}
