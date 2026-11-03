/*
public class Date{
    private int year;
    private int month;
    private int day;
    public void Date4(){
        this.year=2000;
        this.month=1;
        this.day=1;

    }
    public  void Date4(int year,int month,int day){
        this.year=year;
        this.month=year;
        this.day=day;
    }
    public int Sum(Date4 d){
    int years=this.year;
    int months=this.month;
    int days=this.day;

    int sumday=0;
    int[] everyday={31,29,31,30,31,30,31,31,30,31,30,31};
    for (int i=0;i<month-1;i++){
        sumday+=everyday[i];
    }
    sumday+=day;
    return sumday;


    }
    public int interval(Date4 d){
        int sumday1=Sum(this);
        int sumday2=Sum(d1);
        return sumday2-sumday1;
    }

    public static void main(String[] args) {
        Date d1=new Date(2020,1,1);
        Date d2=new Date(2020,12,31);
        int interval=d1.interval(d2);
        System.out.println("The interval between two dates is: "+interval+" days.");
    }

}
*/
