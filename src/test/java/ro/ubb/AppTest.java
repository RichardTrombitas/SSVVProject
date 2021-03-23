package ro.ubb;

import org.junit.Test;
import ro.ubb.Domain.Student;
import ro.ubb.Exceptions.ValidatorException;
import ro.ubb.Repository.XMLFileRepository.StudentXMLRepo;
import ro.ubb.Service.XMLFileService.StudentXMLService;
import ro.ubb.Validator.StudentValidator;

import static org.junit.Assert.assertEquals;
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

    @Test(expected = ValidatorException.class)
    public void tc_3_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "-12";
        String email = "e1";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = NullPointerException.class)
    public void tc_4_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = null;
        String grupa = "11";
        String email = "e1";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = ValidatorException.class)
    public void tc_5_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "";
        String grupa = "11";
        String email = "e1";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = NullPointerException.class)
    public void tc_6_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "11";
        String email = null;
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }


    @Test(expected = ValidatorException.class)
    public void tc_7_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "11";
        String email = "";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = NullPointerException.class)
    public void tc_8_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = null;

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = ValidatorException.class)
    public void tc_9_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = "1";
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = "";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test
    public void tc_10_AddStudent() throws ValidatorException {
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

    @Test
    public void tc_11_AddStudent() throws ValidatorException {
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
        assertEquals(addedStudent.getNume(), nume);
    }

    @Test
    public void tc_12_AddStudent() throws ValidatorException {
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
        assertEquals(addedStudent.getGrupa(), Integer.parseInt(grupa));
    }

    @Test
    public void tc_13_AddStudent() throws ValidatorException {
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
        assertEquals(addedStudent.getEmail(), email);
    }

    @Test
    public void tc_14_AddStudent() throws ValidatorException {
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
        assertEquals(addedStudent.getIndrumator(), prof);
    }

    @Test(expected = NullPointerException.class)
    public void tc_15_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = null;
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }

    @Test(expected = NullPointerException.class)
    public void tc_16_AddStudent() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        String id = null;
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = "p1";

        String[] params = {id, nume, grupa, email, prof};
        studentXMLService.add(params);
    }
}
