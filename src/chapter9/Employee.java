package chapter9;

public class Employee extends Person{
    private String employee;
    private String title;

    public Employee(){
        super("angie");
        System.out.println(" In employee default constructor");
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
