/*
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int[] score= new int[10];
        double sum=0;
        double max=score[0];
        double min=score[0];
        for (int i=0; i<score.length; i++){
            score[i]=kb.nextInt();
            sum=sum + score[i];
            if (score[i]>max) max=score[i];
            if (score[i]<min) min=score[i];

        }
        double averages=sum/score.length;
        System.out.println(max+" " +min+" " +averages);


    }

}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str=kb.nextLine().toLowerCase();
        int[] count= new int[26];
        for (int i=0; i<str.length(); i++){
            int index =str.charAt(i)-'a';
            count[index]++;
        }
        for (int i=0;i<26;i++){
            if (count[i]!=0)
                System.out.println((char)(i+'a') + ":" + count[i]);
        }
    }

}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=kb.nextInt();

        }
        for (int i=0;i<=a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for(int k:a){        System.out.println(k+"");}
    }
}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=kb.nextInt();


        }
        int number= kb.nextInt();
        int[] b=new int[n+1];
        int pos=0;
        for (int i=0; i<n; i++){
            if ((number>a[i])||pos>i){
                b[pos]=a[i];
                pos++;}
            else{
                b[pos]=number;
                b[pos+1]=a[i];
                pos=pos+2;
                }


        }
        for (int k:a){
            System.out.println(k);
        }

    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=kb.nextInt();
        }
        int number=kb.nextInt();
        int[] b=new int[n-1];
        if (number==n-1){

            for (int i=0;i<n-1;i++){
                b[i]=a[i];
            }

        }
        else if (number==0){

            for (int i=0;i<n-1;i++){
                b[i]=a[i+1];
            }

        }
        else{
            for (int i=0;i<n-1;i++){
                if (i>=number){
                    b[i]=a[i+1];
                }
                else{
                    b[i]=a[i];
                }
            }
        }

    }
}*//*
*/
/*
import java.util.Scanner;

*//*

*/
/*public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        // Swap the minimum value with the first element
        int temp = numbers[minIndex];
        numbers[minIndex] = numbers[0];
        numbers[0] = temp;


        if (maxIndex == 0) {
            maxIndex = minIndex;
        }


        temp = numbers[maxIndex];
        numbers[maxIndex] = numbers[n - 1];
        numbers[n - 1] = temp;


        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}*//*
*/
/*

import java.util.Scanner;

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个十进制数: ");
        int decimalNumber = scanner.nextInt();

        String binaryString = "";
        while (decimalNumber > 0) {
            binaryString = (decimalNumber % 2) + binaryString;
            decimalNumber = decimalNumber / 2;
        }

        System.out.println("二进制数为: " + binaryString);
        scanner.close();
    }
}

*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int temp=0;
        int[] a=new int[n];

        for (int i=0;i<n;i++){
            a[i] =kb.nextInt();}
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++){
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int k:a){
            System.out.println(k);
        }
    }
}
*//*
*/
/*
*//*

*/
/*public class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double fee = kb.nextDouble();
        double price =0;
        if(fee>0&&fee<400){
            price =fee*0.005;
            System.out.println(price);
        } else if (fee >= 400 && fee < 600) {
            price = fee * 0.01;
            System.out.println(price);
        }
        else if (fee >= 600 && fee < 800) {
            price = fee * 0.015;
            System.out.println(price);
        }
        else if (fee >= 800 && fee < 1500) {
            price = fee * 0.02;
            System.out.println(price);
        }
        else if (fee >=1500) {
            price = fee * 0.03;
            System.out.println(price);
        }
        else {
            System.out.printf("no");
        }
    }
}
*//*
*/
/*
*//*

*/
/*public class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double fee = kb.nextDouble();
        double price =0;
        switch (fee) {

            case (fee > 0 && fee < 400):
                price =fee*0.005;
                System.out.println(price);
                break;

            case (fee >= 400 && fee < 600):
                price = fee * 0.01;
                System.out.println(price);
                break;

            case (fee >= 600 && fee < 800):
                price = fee * 0.015;
                System.out.println(price);
                break;

            case (fee >= 800 && fee < 1500):
                price = fee * 0.02;
                System.out.println(price);
                break;

            case (fee >= 1500):
                price = fee * 0.03;
                System.out.println(price);
                break;

            default:
                System.out.printf("no");
                break;
        }
    }
}*//*
*/
/*


*//*

*/
/*
public class Main{
    String code,skills;
    int years,salary;
    public void work(){
        System.out.println(code);
    }

    public static void main(String[] args) {
        Main p1 = new Main();
        p1.code = "001";
        p1.skills = "Java";
        p1.years = 3;
        p1.salary = 8000;
        p1.work();
    }

}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        System.out.print("18!=");
        fact();
        System.out.print("bye.\n");
    }
    static void fact(){
        double f=1;
        for (int i=1;i<=18;i++){
            f=f*i;
            System.out.printf("%.0f\n",f);
        }
    }
}*//*
*/
/*

*//*

*/
/*
class Main{
    static long fib1(int k){
        if (k==1) return 0;
        else if (k==2) return 1;
        else return fib1(k-1)+fib1(k-2);
    }

    public static void main(String[] args) {
        System.out.println(fib1(7));
    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int b=a.length;
        System.out.println(b);
    }
}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        int[] number={1,1,2,3};
        int index=1;
        for (int i=0;i<number.length;i++){
            if(number[i]!=number[i+1]){
                number [index]=number[i+1];
                index++;
            }

        }


    }

}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        int[] a={1,2,3,5,6,7,8,10,12,14};
        int[] b={2,3,5,6,9,10,13,1,16,18};
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length) {
            if (a[i]<b[i]){
                c[k]=a[i];
                i++;
                k++;
            }
            else if (a[i]==b[i]){
                c[k]=a[i];
                i++;
                k++;
                j++;

            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }

        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j];
            j++;
            k++;
        }
        for(int l:c){
            System.out.print(l+" ");
        }
    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    int a=kb.nextInt();
    int[] b={5,6,7,8,10,13,16,19};
    if(Arrays.binarySearch(b,a)>=0){
        System.out.println("yes");

    }
    else{
        System.out.println("no");
    }
    }
}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        String[] i={"黑桃","红桃","方片","梅花"};
        String[] j={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[][] card=new String[4][13];
        for (int a=0;a<i.length;a++) {
            for (int b = 0; b < j.length; b++) {
                card[a][b]=i[a]+j[b];
                System.out.printf("%s",card[a][b]);
            }
            System.out.println("\n");
        }

    }
}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String strings[][]=new String[10][3];
        for (int i=0;i<10;i++) {
            String[] strs=sc.nextLine().split(",");
            for (int j=0;j<strs.length;j++) {
                strings[i][j]=strs[j];            }
        }
        System.out.println(Arrays.deepToString(strings));
        int max=0,index=0,sum=0;
        for(int i=0;i<10;i++) {
            int score=Integer.parseInt(strings[i][2]);
            if(score>max){
             max=score;
             index=i;
            }
            sum+=score;
        }
    }

}*//*
*/
/*

*//*

*/
/*
class Main{
     static int gcd1(int p, int q){
         int r;
         while (p!= 0) {
             r = q % p;
             q = p;
             p = r;
         }

     return q;
    }
    static int gcd2(int p, int q){
        if (q==0) return p;
        else return gcd2(q,p%q);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int m,n;
        m=kb.nextInt();
        n=kb.nextInt();
        System.out.println(gcd1(m,n));;
    }
}*//*
*/
/*

*//*

*/
/*class Main{
    static long fib1(int k){*//*
*/
/*

*//*

*/
/*
        if(k==1||k==2)
            return 1;
        else
            return fib1(k-1)+fib1(k-2);
    }
    static long fib2(int k){
        int f1,f2,i,f;
        f1=1;
        f2=1;
        for(i=2;i<=k;i++){
            f=f1+f2;
            f1=f2;
            f2=f;

    }
        return f1;

    }

    public static void main(String[] args) {
        for (int i=0;i<=1000;i++){
            System.out.println(fib1(i)+"");
            if (i%10==0){
                System.out.println();
            }

        }

    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    String code;
    int years;
    int salary;
    String skill;
    public Main(String a,int b,int c,String d){
        code=a;
        years=b;
        salary=c;
        skill=d;

    }
    public void work(){
        System.out.println(code);
    }

    public static void main(String[] args) {
        Main farmer;
        farmer=new Main("F001",5,5000,"apple");
        farmer.work();
    }

}
*//*
*/
/*

*//*

*/
/*
class Main{
    static long sum(int n){
        if (n==1)
            return n;
        else
           return n+sum(n-1);
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}*//*
*/
/*

*//*

*/
/*
class Main{
    static long sum(int month){

        if (month==1||month==2)
            return 1;
        else
            return sum(month-1)+sum(month-2);

    }

    public static void main(String[] args) {
        System.out.println(sum(7));
    }
}*//*
*/
/*

*//*

*/
/*
class Main{
    static long number(int n){
        if (n==1)
            return n;
        else if(n==2)
            return n;
        else
            return number(n-1)+number(n-2);
    }

    public static void main(String[] args) {
        System.out.println(number(10));
    }
}
*//*
*/
/*

*//*

*/
/*
class Main{
    static long number(int num){
        if (num==10)
            return 1;

        else
            return 2*number(num+1)+2;
    }

    public static void main(String[] args) {
        System.out.println(number(1));
    }
}*//*
*/
/*

*//*

*/
/*
public static void main(String[] args) {
    int n=3;
    move(n,1,2,3);
}

public static void move(int n,int one ,int two,int three) {
    if(n==1){
        System.out.printf(" \n",one,three);
        return;
    }
    move(n-1,one,three,two);
    move(1,one ,two,three);
    move(n-1,two,one,three);
}
*//*
*/
/*

import java.util.Scanner;

*//*

*/
/*
public class Main {
    // 成员变量
    private String name;
    private double height;
    private double weight;

    // 构造方法，通过参数实现对成员变量的赋初值操作
    public Main(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 成员方法check0，该方法返回0、1、-1分别表示标准、过胖或过瘦
    public int check0() {
        double referenceWeight = height - 110;
        if (weight > referenceWeight + 5) {
            return 1; // 过胖
        } else if (weight < referenceWeight - 5) {
            return -1; // 过瘦
        } else {
            return 0; // 标准
        }
    }

    // 主方法，用于测试People类并处理学生数据
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 50;
        int standardCount = 0, overWeightCount = 0, underWeightCount = 0;

        // 输入50个学生的信息
        for (int i = 0; i < studentCount; i++) {
            Main[] people=new Main[i];
            String name = scanner.next();
            double height = scanner.nextDouble();
            double weight = scanner.nextDouble();

            // 创建People对象并调用check0方法
            Main person = new Main(name, height, weight);
            int result = person.check0();

            // 根据check0方法的返回值统计人数
            if (result == 0) {
                standardCount++;
            } else if (result == 1) {
                overWeightCount++;
            } else if (result == -1) {
                underWeightCount++;
            }
        }

        // 输出标准、过胖或过瘦的人数
        System.out.println("标准人数：" + standardCount);
        System.out.println("过胖人数：" + overWeightCount);
        System.out.println("过瘦人数：" + underWeightCount);

        // 关闭扫描器
        scanner.close();
    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    private double x;
    private double y;
    public Main(double x, double y){
        this.x=x;
        this.y=y;
    }
    public  void show(){
        System.out.printf("("+x+","+y+")");
    }
    public void number(double x,double y){
        this.x=x;
        this.y=y;

    }

    public static void main(String[] args) {
        Main p1=new Main(3,4);
        Main p2=new Main(6,8);
        p1.show();
        p2.show();
        p1.number(5,6);
        p1.show();

    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    private int yuan;
    private int jiao;
    private int feng;
    public Main(int yuan,int jiao,int feng){
        this.yuan=yuan;
        this.jiao=jiao;
        this.feng=feng;
    }
    public void show(){
        System.out.println(yuan+"元"+jiao+"角"+feng+"分");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int j=sc.nextInt();
        int f=sc.nextInt();
        Main price= new Main(y,j,f);
        price.show();
    }
}
*//*
*/
/*

*//*

*/
/*
public class Main{
    Scanner sc=new Scanner(System.in);
    private String name;
    private int age;
    private double height;
    private double weight;
    private String politicalstatus;
    private static int people=0;
    private static int sum1=0;
    private static int sum2=0;
    private static int sum3=0;
    public Main(String name,int age,double height,double weight,String politicalstatus,int people){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.politicalstatus=politicalstatus;
        this.people=people;
        people++;
    }
    public void show(){
        System.out.println(name+" "+age+" "+height+" "+weight);
    }
    public static void showpeople(String politicalstatus){

        switch (politicalstatus){
            case "群众":

                        sum1++;


                break;
            case "中共党员":

                        sum2++;


                break;
            case "共青团员":

                        sum3++;


                break;
            default:
                System.out.println("输入的政治面m面貌有误");
        }

        System.out.println("群众"+sum1+"中共党员"+sum2+"共青团员"+sum3);
    }

    public static void main(String[] args) {

        Main p1=new Main("Tom",18,175,70,"群众",100);
        Main p2=new Main("Jerry",20,180,75,"中共党员",100);
        Main p3=new Main("Lucy",22,165,65,"共青团员",100);
        p1.show();
        p2.show();
        p3.show();
        showpeople("群众");
        showpeople("中共党员");

    }

}
*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        String ss="3301";
        System.out.println("输入身份证号码");
        Scanner sc=new Scanner(System.in);
        String id =sc.nextLine();
        if (id.length()!=18){
            System.out.println("输入不正确");
            return;


        }
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        int sexNum=id.charAt(16)-'0';
        System.out.println("生日："+year+"-"+month+"-"+day);
        String sex=(sexNum%2==0)?"女":"男";
        System.out.println(sex);
        String ids=id.substring(0,4);
        if(ss.equals(ids)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}*//*
*/
/*

*//*

*/
/*
public class Main{
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("abc").append(true).append(123);
        System.out.println(sb.toString());
        sb.append('!');
        System.out.println(sb.toString());
        sb.insert(2,"qq");
        System.out.println(sb.toString());
        sb.delete(1,3);
        System.out.println(sb.toString());
        sb.deleteCharAt(0);
        System.out.println(sb.toString());
        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("t"));
        sb.replace(1,3,"java");
        System.out.println(sb.toString());
        sb.setCharAt(2,'m');
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
    }
}*//*
*/
/*


*//*

*/
/*public class Main{
    public static void main(String[] args) {
        Date dOld=new Date();
        long lOld=dOld.getTime();
        System.out.println(dOld.toString());
        int sum=0;
        for (int i=0; i<100;i++){
            sum+=i;
        }
        Date dNew= new Date();
        long lNew=dNew.getTime();
        System.out.println(dNew.toString());
        System.out.println(lNew-lOld);

    }

}*//*
*/
/*

*//*

*/
/*
public class Main {
    String color="";
    String place="";
    public void eat(){
        System.out.println(color+","+place);
    }
    public class Apple extends Main {
        int pirce=0;

        public  void main(String[] args) {
            Apple a= new Apple();
            a.color="red";
            a.place="apple";
            a.eat();
            a.price=100;
            System.out.println(a.price);
        }
    }
}
*//*
*/
/*

*//*

*/
/*
public class Main {
    String food="";
    String cloth="";
    int number=0;
    String name="";
    String date="";
    String information="";
    public void show(String food,String cloth){
        System.out.println(food+","+cloth);
    }
}

*/
