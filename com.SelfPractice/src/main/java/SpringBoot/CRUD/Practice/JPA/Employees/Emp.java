package SpringBoot.CRUD.Practice.JPA.Employees;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Emp {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name="Name", nullable = false)
    private String empName;
    @Column(name="Email")
    private String empEmail;
    @Column(name="Department")
    private String dept;
    @Column(name = "Salary")
    private double salary;

    public Emp() {
    }

    public Emp(int empId, String empName, String empEmail, String dept, double salary) {
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
