package ro.ubb;

import org.junit.Test;
import ro.ubb.Domain.Student;
import ro.ubb.Exceptions.ValidatorException;
import ro.ubb.Repository.XMLFileRepository.StudentXMLRepo;
import ro.ubb.Service.XMLFileService.StudentXMLService;
import ro.ubb.Validator.StudentValidator;

import static org.junit.Assert.assertNotNull;

public class AppTest {

    StudentValidator studentValidator;
    StudentXMLRepo studentXMLRepo;
    StudentXMLService studentXMLService;

    @Test
    public void tc_1_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = "p1";
        String[] params = {id, nume, grupa, email, prof};

        studentXMLService.add(params);
        Student addedStudent = studentXMLService.findOne("1");
        assertNotNull(addedStudent);
    }

    @Test(expected = ValidatorException.class)
    public void tc_2_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "1.23";
        String email = "e1";
        String prof = "p1";
        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }
}
