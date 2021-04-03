package ro.ubb;

import org.junit.Test;
import ro.ubb.Domain.TemaLab;
import ro.ubb.Exceptions.ValidatorException;
import ro.ubb.Repository.XMLFileRepository.TemaLabXMLRepo;
import ro.ubb.Service.XMLFileService.TemaLabXMLService;
import ro.ubb.Validator.TemaLabValidator;

import static org.junit.Assert.assertNotNull;

public class WhiteBoxTest {
    TemaLabValidator temaLabValidator;
    TemaLabXMLRepo temaLabXMLRepo;
    TemaLabXMLService temaLabXMLService;

    @Test
    public void tc_1_AddTemaLab() throws ValidatorException {
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

    @Test(expected = ValidatorException.class)
    public void tc_2_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "";
        String descr = "d1";
        String saptLim = "11";
        String saptPred = "7";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
    }

    @Test(expected = ValidatorException.class)
    public void tc_3_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "1";
        String descr = "";
        String saptLim = "11";
        String saptPred = "7";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
    }

    @Test(expected = ValidatorException.class)
    public void tc_4_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "1";
        String descr = "d1";
        String saptLim = "";
        String saptPred = "7";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
    }

    @Test(expected = ValidatorException.class)
    public void tc_5_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "1";
        String descr = "d1";
        String saptLim = "11";
        String saptPred = "";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
    }

    @Test
    public void tc_6_AddTemaLab() throws ValidatorException {
        temaLabValidator = new TemaLabValidator();
        temaLabXMLRepo = new TemaLabXMLRepo(temaLabValidator, "TemaLabXML_test.xml");
        temaLabXMLService = new TemaLabXMLService(temaLabXMLRepo);

        String id = "1";
        String descr = "d1";
        String saptLim = "11";
        String saptPred = "7";
        String[] params = {id, descr, saptLim, saptPred};

        temaLabXMLService.add(params);
        temaLabXMLService.add(params);
        TemaLab addedAssignment = temaLabXMLService.findOne(1);
        assertNotNull(addedAssignment);
    }

}
