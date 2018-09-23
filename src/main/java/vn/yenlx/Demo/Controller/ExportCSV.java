package vn.yenlx.Demo.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import vn.yenlx.Demo.Entities.Student;
import vn.yenlx.Demo.Services.StudentServices;
@Controller
public class ExportCSV {
	@Autowired
	StudentServices services;
	
//	@GetMapping("/download")
//	public String download(Model model) {
//		model.addAttribute("student",services.getLstStudent());
//		return "";
//	}

	// dung cach nay
	@GetMapping("/download")
	public void download(Model model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv");

        List<Student> students = services.getLstStudent();
        String[] header = {"Id", "Name", "Age"};
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
                CsvPreference.STANDARD_PREFERENCE);

        csvWriter.writeHeader(header);
        for (Student  student : students) {
			csvWriter.write(student, header);
		}
//        for (User user : users) {
//            csvWriter.write(user, header);
//        }
        csvWriter.close();
		
	}
}
