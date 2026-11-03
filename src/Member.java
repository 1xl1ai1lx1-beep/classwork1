public class Member {
    String number;
    String borndate;
    String name;
    String date;
    String position;
    String gender;
    double money;
    String HRID;
    public Member(String number, String borndate, String name, String date, String position, String gender, double money, String HRID){
        this.number = number;
        this.borndate = borndate;
        this.name = name;
        this.date = date;
        this.position = position;
        this.gender = gender;
        this.money = money;
        this.HRID = HRID;
    }
    public String getNumber(){
        return number;
    }
    public String getBorndate(){
        return borndate;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
    public String getPosition(){
        return position;
    }
    public String getGender(){
        return gender;
    }
    public double getMoney(){
        return money;
    }
    public String getHRID(){
        return HRID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setBorndate(String borndate){
        this.borndate = borndate;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setMoney(double money){
        this.money = money;
    }
    public void setHRID(String HRID){
        this.HRID = HRID;
    }
    public String toString(){
        return "Number: " + number + ", Borndate: " + borndate + ", Name: " + name + ", Date: " + date + ", Position: " + position + ", Gender: " + gender + ", Money: " + money + ", HRID: " + HRID;
    }


}
