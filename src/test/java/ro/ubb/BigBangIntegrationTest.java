package ro.ubb;

import org.junit.Test;
import ro.ubb.Domain.Nota;
import ro.ubb.Domain.Student;
import ro.ubb.Domain.TemaLab;
import ro.ubb.Exceptions.ValidatorException;
import ro.ubb.Repository.XMLFileRepository.NotaXMLRepo;
import ro.ubb.Repository.XMLFileRepository.StudentXMLRepo;
import ro.ubb.Repository.XMLFileRepository.TemaLabXMLRepo;
import ro.ubb.Service.XMLFileService.NotaXMLService;
import ro.ubb.Service.XMLFileService.StudentXMLService;
import ro.ubb.Service.XMLFileService.TemaLabXMLService;
import ro.ubb.Validator.NotaValidator;
import ro.ubb.Validator.StudentValidator;
import ro.ubb.Validator.TemaLabValidator;

import static org.junit.Assert.assertNotNull;

public class BigBangIntegrationTest {
    StudentValidator studentValidator;
    StudentXMLRepo studentXMLRepo;
    StudentXMLService studentXMLService;

    TemaLabValidator temaLabValidator;
    TemaLabXMLRepo temaLabXMLRepo;
    TemaLabXMLService temaLabXMLService;

    NotaValidator notaValidator;
    NotaXMLRepo notaXMLRepo;
    NotaXMLService notaXMLService;

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

    @Test
    public void tc_2_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "1";
        String descr = "d1";
        String saptLim = "11";
        String saptPred = "7";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
        TemaLab addedAssignment = temaLabXMLService.findOne(1);
        assertNotNull(addedAssignment);
    }

    @Test
    public void tc_3_AddGrade() throws ValidatorException {
        notaValidator = new NotaValidator();
        notaXMLRepo = new NotaXMLRepo(notaValidator, "NotaXML_test.xml");
        notaXMLService = new NotaXMLService(notaXMLRepo);

        String id = "1";
        String idStudent = "1";
        String idTema = "1";
        String val = "10";
        String data = "2007-12-03T10:15:30";
        String[] params={id,idStudent,idTema,val,data};

        notaXMLService.add(params);
        Nota addedGrade = notaXMLService.findOne(1);
        assertNotNull(addedGrade);
    }

    @Test
    public void tc_4_Integration() throws ValidatorException {
        studentValidator = new StudentValidator();
        studentXMLRepo = new StudentXMLRepo(studentValidator, "StudentiXML_test.xml");
        studentXMLService = new StudentXMLService(studentXMLRepo);

        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        notaValidator = new NotaValidator();
        notaXMLRepo = new NotaXMLRepo(notaValidator, "NotaXML_test.xml");
        notaXMLService = new NotaXMLService(notaXMLRepo);

        String idStudent = "1";
        String nume = "n1";
        String grupa = "11";
        String email = "e1";
        String prof = "p1";
        String[] studentParams = {idStudent, nume, grupa, email, prof};
        studentXMLService.add(studentParams);

        String idTema = "1";
        String descr = "d1";
        String saptLim = "11";
        String saptPred = "7";
        String[] temaParams = {idTema, descr, saptLim, saptPred};
        temaLabXMLService.add(temaParams);

        String id = "1";
        String val = "10";
        String data = "2007-12-03T10:15:30";
        String[] params={id,idStudent,idTema,val,data};
        notaXMLService.add(params);

        Student addedStudent = studentXMLService.findOne("1");
        assertNotNull(addedStudent);

        TemaLab addedAssignment = temaLabXMLService.findOne(1);
        assertNotNull(addedAssignment);

        Nota addedGrade = notaXMLService.findOne(1);
        assertNotNull(addedGrade);
    }
}
