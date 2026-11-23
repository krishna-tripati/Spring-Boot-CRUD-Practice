package SpringBoot.CRUD.Practice.EMPSys;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeeList=new ArrayList<>();

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public String addemp(Employee emp){
        employeeList.add(emp);
        return "emp data added";
    }

    public Employee getEmpById(int id){
        for(Employee emp: employeeList){
            if(emp.getEmpId()==id){
                return emp;
            }
        }
        return null;
    }

    ArrayList<Employee> empDept=new ArrayList<>();
    public List<Employee> getEmpbyDept(String department){
        for(Employee emp: employeeList){
            if(emp.getDept().equalsIgnoreCase(department)){
               empDept.add(emp);
            }
        }
        return empDept;
    }

    public String updateEmp(Employee emp, int id) {
        for(Employee emp1: employeeList){
            if(emp1.getEmpId()==id){
                emp1.setEmpName(emp.getEmpName());
                emp1.setEmpEmail(emp.getEmpEmail());
                emp1.setDept(emp.getDept());
                emp1.setSalary(emp.getSalary());
              return "data updated successfully";
            }

        }
      return   "id doesn't exit";
    }

    public String deleteEmpbyid(int id){
        for(int i=0; i<employeeList.size(); i++){
              if(employeeList.get(i).getEmpId()==id){
                  employeeList.remove(i);
                  return "deleted";
              }
        }

        return "id doesn't exits";
    }

}
