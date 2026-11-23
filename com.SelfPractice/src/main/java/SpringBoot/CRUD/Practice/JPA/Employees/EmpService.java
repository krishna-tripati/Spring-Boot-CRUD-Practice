package SpringBoot.CRUD.Practice.JPA.Employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;;

@Service
public class EmpService {

    @Autowired
    public EmpRepository empRepository;


     public List<Emp> getAllEmpList(){
         return empRepository.findAll();
     }

     public Emp getEmpById(int id){
          return empRepository.findById(id).orElse(null);
     }

     public String addEmp(Emp e){
         empRepository.save(e);
         return "added successfully";
     }

     public String updateEmpById(Emp e, int id){
        Emp emp= empRepository.findById(id).orElse(null);
        if(emp==null){
           return  "id doesn't exit";
        }else {
            emp.setEmpName(e.getEmpName());
            emp.setEmpEmail(e.getEmpEmail());
            emp.setDept(e.getDept());
            emp.setSalary(e.getSalary());
            empRepository.save(emp);
            return "updated sucessfully";
        }
     }

     public String deleteById(int id){
        Emp emp= empRepository.findById(id).orElse(null);
         if(emp==null){
             return  "id doesn't exit";
         }else {
            empRepository.delete(emp);
            return "deleted";
         }
     }

     public List<Emp> findByDept(String dept){
       return  empRepository.findByDept(dept);
     }

     // find salary is greater than given number
     public List<Emp> findSalaryIsGraterThanGiveNumber(double salary){
        return empRepository.findBySalaryGreaterThan(salary);
     }

     //Find employees whose name contains a given word
    public List<Emp> findNameContains(String name){
        return empRepository.findByEmpNameContaining(name);
    }
     //find dept and minimum salary
   public List<Emp> findByDepartmentAndMinimumSalary(String dept, double salary){
         return empRepository.findByDeptAndSalaryGreaterThanEqual(dept,salary);
   }

    // Find the highest salary employee
     public Emp findHighestSalary(){
         return empRepository.findFirstByOrderBySalaryDesc();
     }


   //Find employees whose salary is between two amounts
     public List<Emp> findSalarybetween(double minsalary, double maxsalary){
         return empRepository.findBySalaryBetween(minsalary, maxsalary);
     }

    //Count employees in a department
    public int countByDept(String dept){
         return empRepository.countByDept(dept);
    }



}
