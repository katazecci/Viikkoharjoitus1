package k23.CarDatabase.Week1And2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import k23.CarDatabase.Week1And2.domain.Student;

@Controller
public class StudentController {

	@GetMapping("/hellos")
	public String sayGreetingsToStudents(Model model) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Katarina", "Zec"));
		students.add(new Student("Antti", "Holma"));
		model.addAttribute("students", students);
		return "studentlist";
	}
}