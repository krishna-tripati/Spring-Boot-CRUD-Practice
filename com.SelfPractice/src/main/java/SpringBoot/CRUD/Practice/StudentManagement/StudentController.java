package SpringBoot.CRUD.Practice.StudentManagement;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();

    @GetMapping //getting all student data
    public List<Student> getAllStudent() {
        return studentList;
    }

    @GetMapping("/{id}")
    public Student studentById(@PathVariable("id") int studId) {
        for (Student stud : studentList) {
            if (stud.getStudId() == studId) {
                return stud;
            }
        }
        return null;
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student stud) {
        studentList.add(stud);
        return "student added successfully";
    }

    @PutMapping("/update/{id}")
    public String updateStudentById(@RequestBody Student stud, @PathVariable ("id") int studeId) {
        for(Student s: studentList){
            if(s.getStudId()==studeId){
                s.setStudName(stud.getStudName());
                s.setStudCourse(stud.getStudCourse());
                s.setStudEmail(stud.getStudEmail());
            }
        }
        return "updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable ("id") int studId){
        for(int i=0; i<studentList.size(); i++){
            if(studentList.get(i).getStudId()==studId){
                studentList.remove(i);
                return "student deleted";
            }
        }
         return "student doesn't exits";
    }

}
