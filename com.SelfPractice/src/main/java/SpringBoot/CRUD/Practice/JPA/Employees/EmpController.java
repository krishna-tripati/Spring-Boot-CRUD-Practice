package SpringBoot.CRUD.Practice.JPA.Employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping
    public List<Emp> getEmplist(){
        return empService.getAllEmpList();
    }

    @GetMapping("/{id}")
    public Emp getEmpById(@PathVariable ("id") int id){
        return empService.getEmpById(id);
    }

    @PostMapping("/add")
    public String addEmp(@RequestBody Emp e){
        return empService.addEmp(e);
    }

    @PutMapping("/update/{id}")
    public String updateEmpById(@RequestBody Emp e, @PathVariable ("id") int id){
        return empService.updateEmpById(e,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmpById(@PathVariable ("id") int id){
        return empService.deleteById(id);
    }

    @GetMapping("/dept/{dept}")
    public List<Emp> findEmpByDept(@PathVariable ("dept") String dept){
        return empService.findByDept(dept);
    }

    @GetMapping("/salary/{salary}")
    public List<Emp> findSalaryGreaterThanNumber(@PathVariable ("salary") double salary){
        return empService.findSalaryIsGraterThanGiveNumber(salary);
    }

    @GetMapping("/name/{name}")
    public List<Emp> findNameByWords(@PathVariable ("name") String name){
        return empService.findNameContains(name);
    }

     @GetMapping("/dept/{dept}/salary/{salary}")
    public List<Emp> findDeptAndMinimunSalary(@PathVariable ("dept") String dept, @PathVariable ("salary") double salary){
        return empService.findByDepartmentAndMinimumSalary(dept,salary);
    }

    @GetMapping("/salary/{minsalary}/{maxsalary}")
    public List<Emp> findsalarybetween(@PathVariable ("minsalary") double minsalary,
                        @PathVariable ("maxsalary") double maxsalary){

        return empService.findSalarybetween(minsalary,maxsalary);
    }

    @GetMapping("/salary/highest")
    public Emp findHighest(){
        return empService.findHighestSalary();
    }

    @GetMapping("/count/dept/{dept}")
    public int countByDept(@PathVariable ("dept") String dept){
        return empService.countByDept(dept);
    }
}
