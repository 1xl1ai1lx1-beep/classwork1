/*
import java.util.*;
*/
/*
public class NewMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] number =new int[10];
        for (int i=0; i<number.length; i++) {
            number[i]=sc.nextInt();

        }
        for (int i=0; i<number.length; i++) {
            for (int j=0; j<number.length; j++) {
                if (number[i]<number[j]) {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        for(int i=0; i<number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
*//*

*/
/*
public class NewMain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sum1=" ";
        String sum2=" ";
        for (int i=0; i<5;i++){
            int number=sc.nextInt();
            if(number>=0){
                sum1+=number+",";
            }
            else{
                sum2+=number+",";
            }

        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}*//*

public class NewMain {
    public static void main(String[] args) {

        int[][] number={
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25,26}
        };
        for (int i=0; i<number.length; i++) {
            for (int j=0; j<number[i].length; j++){
                System.out.print(number[i][j]+" ");

            }




        }
    }

}
*/
