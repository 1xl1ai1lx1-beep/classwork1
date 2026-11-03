/*
public class EmployeeManager {
    private int number;
    private Employee[] employees;
    private int capacity;
    public EmployeeManager(int capacity) {
        this.capacity = capacity;
        this.employees = new Employee[capacity];
        this.number = 0;
    }

    public void addEmployee(Employee employee) {
        if (number<capacity){
            employees[number++]=employee;
        }
        else{
            System.out.println("wrong");
        }
    }
    public void deleteEmployee(Employee employee) {
        for (int i=0; i<number; i++){
            if (employees[i].getId().equals(employee.getId())){
                for (int j=i; j<number-1; j++){
                    employees[j]=employees[j+1];
                }
                employees[number-1]=null;
                number--;
                return;
            }
        }
        System.out.println("not found");
    }
    public void updateEmployee(Employee employee){
        for(int i=0;i<number;i++){
            if(employees[i].getId().equals(employee.getId())){
                employees[i]=employee;            }

        }
    }
    public double calculateAverageAge(){
        int sum=0;
        for(int i=0;i<number;i++){
            sum+=employees[i].getAge();
        }
        return (double)sum/number;

    }
}*/
