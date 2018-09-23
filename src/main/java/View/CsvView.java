package View;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import vn.yenlx.Demo.Entities.Student;

public class CsvView extends AbstractCsvView{

	@Override
	protected void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		   response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv");

	        List<Student> students = (List<Student>) model.get("student");
	        String[] header = {"Id", "Name", "Age"};
	        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
	                CsvPreference.STANDARD_PREFERENCE);

	        csvWriter.writeHeader(header);
	        for (Student  student : students) {
				csvWriter.write(student, header);
			}
//	        for (User user : users) {
//	            csvWriter.write(user, header);
//	        }
	        csvWriter.close();
		
	}

}
