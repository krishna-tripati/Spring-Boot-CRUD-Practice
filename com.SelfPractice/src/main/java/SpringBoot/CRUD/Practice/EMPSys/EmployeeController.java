package SpringBoot.CRUD.Practice.EMPSys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmployeeService serviceemp;


    @GetMapping
    public List <Employee> getAllEmp(){
        return serviceemp.getEmployeeList();
    }

    @PostMapping("/add")
    public String addEmp(@RequestBody Employee emp) {
        return serviceemp.addemp(emp);
    }

    @GetMapping("/{id}")
    public Employee getEmpById(@PathVariable ("id") int empid){
        return serviceemp.getEmpById(empid);
    }

    @GetMapping("/department/{dept}")
    public List<Employee>  getEmpByDept(@PathVariable ("dept") String dept){
        return serviceemp.getEmpbyDept(dept);
    }

    @PutMapping("/update/{id}")
    public String updateEmpbyId(@RequestBody Employee emp, @PathVariable ("id") int id){
         return serviceemp.updateEmp(emp,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletebyId(@PathVariable ("id") int id){
         return serviceemp.deleteEmpbyid(id);
    }


}
