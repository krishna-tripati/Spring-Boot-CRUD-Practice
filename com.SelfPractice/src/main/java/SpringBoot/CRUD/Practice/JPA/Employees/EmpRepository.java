package SpringBoot.CRUD.Practice.JPA.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{


     List<Emp> findByDept(String dept);

     List<Emp> findBySalaryGreaterThan(double Salary);

     List<Emp> findByEmpNameContaining(String name);

     List<Emp> findByDeptAndSalaryGreaterThanEqual(String dept, double salary);

     List<Emp> findBySalaryBetween(double min, double max);

     int countByDept(String dept);

     // Find the highest salary employee
      Emp findFirstByOrderBySalaryDesc();


}
