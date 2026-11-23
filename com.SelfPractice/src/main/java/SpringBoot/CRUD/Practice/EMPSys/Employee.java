package SpringBoot.CRUD.Practice.EMPSys;

public class Employee {
    private int empId;
    private String empName;
    private String empEmail;
    private String dept;
    private double salary;

    public Employee(int empId, String empName, String empEmail, String dept, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.dept = dept;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
