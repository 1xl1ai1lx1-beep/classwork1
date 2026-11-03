import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Campany {

    public static void main(String[] args) {
        ArrayList<Manager> list = new ArrayList<>();
        ArrayList<Member> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String choice1, choice2;
        while (true) {
            showMenu1();
            choice1 = sc.nextLine();
            switch (choice1) {
                case "1":
                    if (list.size() == 0) {
                        System.out.println("暂时还没有管理员！");
                        continue;
                    } else {
                        login(list);
                        break;
                    }
                case "2":
                    register(list);
                    continue;
                case "3":
                    resetpassword(list);
                    continue;
                case "4":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("没有这个选项");
                    continue;
            }
            break;
        }
        while(true){
            showMenu2();
            choice2=sc.nextLine();
            switch (choice2){
                case "1":
                    addEmployee(list1);
                    break;
                case "2":
                    deleteEmployee(list1);
                    break;
                case "3":
                    transferEmployee(list1);
                    break;
                case "4":
                    adjustSalary(list1);
                    break;
                case "5":
                    updateEmployee(list1);
                    break;
                case "6":
                    showEmployee(list1);
                    break;
                case "7":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("没有这个选项");
                    break;
            }
        }
    }

    public static void showMenu1() {
        System.out.println("欢迎来到人事管理系统");
        System.out.println("请选择操作");
        System.out.println("1、管理员登录");
        System.out.println("2、管理员注册");
        System.out.println("3、管理员密码修改");
        System.out.println("4、退出");
    }

    public static boolean check(ArrayList<Manager> list, String accountlogin, String passwordlogin, String idlogin) {
        for (Manager manager : list) {
            if (manager.getAccount().equals(accountlogin) &&
                    manager.getPassword().equals(passwordlogin) &&
                    manager.getID().equals(idlogin)) {
                return true;
            }
        }
        return false;
    }

    public static void login(ArrayList<Manager> list) {
        Scanner sc = new Scanner(System.in);
        String Mccount;
        String password;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入管理员账号");
            Mccount = sc.next();
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请输入ID");
            String ID = sc.next();

            boolean result = check(list, Mccount, password, ID);
            if (result) {
                System.out.println("登录成功!欢迎" + Mccount + "!");
                return;
            } else {
                System.out.println("登录失败,账号或密码错误");
                if (i == 2) {
                    System.out.println("当前账号：" + Mccount + "被锁定");
                    System.exit(0);
                } else {
                    System.out.println("还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    public static void register(ArrayList<Manager> list) {
        Scanner sc = new Scanner(System.in);
        String accountregister;
        System.out.println("请输入管理员账号：");
        accountregister = sc.nextLine();
        System.out.println("请输要注册的入密码");
        String passwordregister = sc.nextLine();
        System.out.println("请输要注册的入ID");
        String idregister = sc.nextLine();
        Manager m = new Manager(accountregister, passwordregister, idregister);
        list.add(m);
        System.out.println("注册成功");
    }

    public static Manager findManager(String account, ArrayList<Manager> list) {
        for (Manager person : list) {
            if (person.getAccount().equals(account)) {
                return person;
            }
        }
        return null;
    }

    public static void resetpassword(ArrayList<Manager> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改密码的管理员账号：");
        String account = sc.nextLine();
        Manager manager = findManager(account, list);
        if (manager == null) {
            System.out.println("没有找到该管理员");
        }
        else{System.out.println("请输入新的密码：");
        String newPassword = sc.nextLine();
        manager.setPassword(newPassword);
        System.out.println("修改密码成功");
        System.out.println("请输入新的ID：");
        String newID = sc.nextLine();
        manager.setID(newID);
        System.out.println("修改ID成功");}
    }

    public static void showMenu2() {
        System.out.println("---------欢迎来到人事系统---------");
        System.out.println("请选择操作：");
        System.out.println("1.员工入职：添加员工信息");
        System.out.println("2.员工离职：删除员工信息");
        System.out.println("3.员工调岗");
        System.out.println("4.员工调薪");
        System.out.println("5.修改员工信息");
        System.out.println("6.查看全班员工信息");
        System.out.println("7.退出");
    }

    private static void addEmployee(ArrayList<Member> list1) {
        String number = null;
        String name = null;
        String joindate = null;
        String position = null;
        String gender = null;
        double salary = 0;
        String hrid = null;
        String borndate = null;
        Member em = new Member(number, borndate, name, joindate, position, gender, salary, hrid);
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入员工的工号");
        String number1 = sc.nextLine();
        em.setNumber(number1);

        System.out.println("请输入员工的出生日期");
        String borndate1 = sc.nextLine();
        em.setBorndate(borndate1);

        System.out.println("请输入员工的姓名");
        String name1 = sc.nextLine();
        em.setName(name1);

        System.out.println("请输入员工的入职日期");
        String joindate1 = sc.nextLine();
        em.setDate(joindate1);

        System.out.println("请输入员工的岗位性质");
        String position1 = sc.nextLine();
        em.setPosition(position1);

        System.out.println("请输入员工的基本工资");
        double salary1 = sc.nextDouble();
        em.setMoney(salary1);

        System.out.println("请输入员工性别");
        sc.nextLine();
        String gender1 = sc.nextLine();
        em.setGender(gender1);

        System.out.println("请输入员工的HRID");
        String hrid1 = sc.nextLine();
        em.setHRID(hrid1);
        list1.add(em);
        System.out.println("员工信息添加成功");
    }
    public static Member findEmployee(String name,String ID,ArrayList<Member> list1){
        for (Member member : list1){
            if(member.getName().equals(name)&&member.getNumber().equals(ID)){
                return member;

            }
        }
        return null;

    }
    private static void deleteEmployee(ArrayList<Member> list1) {
        System.out.println("请输入要删除的员工的姓名");
        Scanner sc = new Scanner(System.in);
        String deletname = sc.nextLine();
        System.out.println("请输入要删除的员工的工号");
        String deletid = sc.nextLine();
        int sum=0;
        for (Member member : list1) {
            if (member.getName().equals(deletname) && member.getNumber().equals(deletid)) {
                list1.remove(member);
                System.out.println("员工信息删除成功");
                sum++;
                return;
            }
            if(sum==0){
                System.out.println("没有找到该员工");
            }
        }

    }

    private static void transferEmployee(ArrayList<Member> list1) {
        System.out.println("请输入要调岗的员工的姓名");
        Scanner sc = new Scanner(System.in);
        String adjustname = sc.nextLine();
        System.out.println("请输入要调岗的员工的工号");
        String adjustid = sc.nextLine();
        int sum=0;
        for (Member member : list1) {
            if (member.getName().equals(adjustname)&&member.getNumber().equals(adjustid)) {
                System.out.println("请输入新岗位:");
                String newposition = sc.nextLine();
                member.setPosition(newposition);
                System.out.println("员工岗位修改成功");
                return;
            }
            if(sum==0){
                System.out.println("没有找到该员工");
            }
        }

    }

    private static void adjustSalary(ArrayList<Member> list1) {
        System.out.println("请输入要调薪的员工的姓名");
        Scanner sc = new Scanner(System.in);
        String adjustname = sc.nextLine();
        System.out.println("请输入要调薪的员工的工号");
        int sum=0;
        String adjsutID=sc.nextLine();
        for (Member member : list1) {
            if (member.getName().equals(adjustname)&&member.getNumber().equals(adjsutID)) {
                System.out.println("请输入新工资:");
                double newsalary = sc.nextDouble();
                member.setMoney(newsalary);
                System.out.println("员工工资修改成功");
                sum++;
                return;
            }
            if(sum==0){
                System.out.println("没有找到该员工");
            }
        }

    }

    private static void showEmployee(ArrayList<Member> list1) {
        System.out.println("-----------所有员工信息---------");
        for (Member member : list1) {
            System.out.println("工号：" + member.getNumber());
            System.out.println("出生日期：" + member.getBorndate());
            System.out.println("姓名：" + member.getName());
            System.out.println("入职日期：" + member.getDate());
            System.out.println("岗位：" + member.getPosition());
            System.out.println("工资：" + member.getMoney());
            System.out.println("性别：" + member.getGender());
            System.out.println("HRID：" + member.getHRID());
            System.out.println("---------------------------------");
        }
    }

    private static void updateEmployee(ArrayList<Member> list1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的员工的姓名");
        String adjustname1 = sc.nextLine();
        System.out.println("请输入要修改的员工的工号");
        String adjustid1= sc.nextLine();
        int sum=0;
        for (Member member : list1) {
            if (member.getName().equals(adjustname1)&&member.getNumber().equals(adjustid1)) {
                sum++;
                while (true) {
                    System.out.println("选择操作");
                    System.out.println("----1:修改工号");
                    System.out.println("----2:修改出生日期");
                    System.out.println("----3:修改姓名");
                    System.out.println("----4:修改入职日期");
                    System.out.println("----5:修改岗位");
                    System.out.println("----6:修改工资");
                    System.out.println("----7:修改性别");
                    System.out.println("----8:修改HRID");
                    System.out.println("----9：退出");
                    String choice3 = sc.nextLine();
                    switch (choice3) {
                        case "1":
                            System.out.println("请输入新工号:");
                            String newnumber = sc.nextLine();
                            member.setNumber(newnumber);
                            System.out.println("修改成功");
                            break;
                        case "2":
                            System.out.println("请输入新出生日期");
                            String newdate = sc.nextLine();
                            member.setBorndate(newdate);
                            System.out.println("修改成功");
                            break;
                        case "3":
                            System.out.println("请输入名字");
                            String newname = sc.nextLine();
                            member.setName(newname);
                            System.out.println("修改成功");
                            break;
                        case "4":
                            System.out.println("请输入新入职日期");
                            String newworkdate = sc.nextLine();
                            member.setDate(newworkdate);
                            System.out.println("修改成功");
                            break;
                        case "5":
                            System.out.println("请输入新岗位");
                            String newposition = sc.nextLine();
                            member.setPosition(newposition);
                            System.out.println("修改成功");
                            break;
                        case "6":
                            System.out.println("请输入新工资");
                            double newsalary = sc.nextDouble();
                            member.setMoney(newsalary);
                            System.out.println("修改成功");
                            sc.nextLine(); // consume newline
                            break;
                        case "7":
                            System.out.println("请输入新性别");
                            String newgender = sc.nextLine();
                            member.setGender(newgender);
                            System.out.println("修改成功");
                            break;
                        case "8":
                            System.out.println("请输入新HRID");
                            String newHRID = sc.nextLine();
                            member.setHRID(newHRID);
                            System.out.println("修改成功");
                            break;
                        case "9":
                            System.out.println("退出");
                            return;
                        default:
                            System.out.println("没有这个选项");
                            break;
                    }
                }

            }
            if(sum==0){
                System.out.println("没有找到该员工");
            }
        }


    }
    private static void checksalary(ArrayList<Member> list1){
        age age1=new age();
        int sum=0;
        for(Member member : list1){
            int birthyear=Integer.parseInt(member.getBorndate().substring(0,4));
            int birthMonth = Integer.parseInt(member.getBorndate().substring(4,6));
            int birthDay = Integer.parseInt(member.getBorndate().substring(6,8));
            Calendar currentCalendar = Calendar.getInstance();
            int currentYear = currentCalendar.get(Calendar.YEAR);
            int currentMonth = currentCalendar.get(Calendar.MONTH) + 1;
            int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
            int age = currentYear - birthyear;
            if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
                age--;
            }
            if(age >=30){
                sum+=member.getMoney();
            }

        }
        double average=sum/ list1.size();
        System.out.println(average);

    }
}
