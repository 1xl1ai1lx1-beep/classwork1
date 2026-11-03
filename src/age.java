import java.util.Calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

    public class age extends Campany{
        public void age(){
            String number = null;
            String name = null;
            String joindate = null;
            String position = null;
            String gender = null;
            double salary = 0;
            String hrid = null;
            String borndate = null;
            Member me=new Member(number, borndate, name, joindate, position, gender, salary, hrid);
            Scanner scanner = new Scanner(System.in);
            int birthYear = Integer.parseInt(me.getBorndate().substring(0,4));
            int birthMonth = Integer.parseInt(me.getBorndate().substring(4,6));
            int birthDay = Integer.parseInt(me.getBorndate().substring(6,8));
            Calendar currentCalendar = Calendar.getInstance();
            int currentYear = currentCalendar.get(Calendar.YEAR);
            int currentMonth = currentCalendar.get(Calendar.MONTH) + 1;
            int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
            int age = currentYear - birthYear;
            if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
                age--;
            }
        }
        public static void main(String[] args) {



        }
    }

