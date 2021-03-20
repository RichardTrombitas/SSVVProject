package ro.ubb;

import ro.ubb.Exceptions.ValidatorException;
import ro.ubb.Repository.XMLFileRepository.NotaXMLRepo;
import ro.ubb.Repository.XMLFileRepository.StudentXMLRepo;
import ro.ubb.Repository.XMLFileRepository.TemaLabXMLRepo;
import ro.ubb.Service.XMLFileService.NotaXMLService;
import ro.ubb.Service.XMLFileService.StudentXMLService;
import ro.ubb.Service.XMLFileService.TemaLabXMLService;
import ro.ubb.UI.ui;
import ro.ubb.Validator.NotaValidator;
import ro.ubb.Validator.StudentValidator;
import ro.ubb.Validator.TemaLabValidator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ValidatorException {
        //System.out.println("Hello World!");
        StudentValidator vs=new StudentValidator();
        TemaLabValidator vt=new TemaLabValidator();
        NotaValidator vn=new NotaValidator();
        StudentXMLRepo strepo=new StudentXMLRepo(vs,"StudentiXML.xml");
        TemaLabXMLRepo tmrepo=new TemaLabXMLRepo(vt,"TemaLaboratorXML.xml");
        NotaXMLRepo ntrepo=new NotaXMLRepo(vn,"NotaXML.xml");
        StudentXMLService stsrv=new StudentXMLService(strepo);
        TemaLabXMLService tmsrv=new TemaLabXMLService(tmrepo);
        NotaXMLService ntsrv=new NotaXMLService(ntrepo);
        ui ui=new ui(stsrv,tmsrv,ntsrv);
        ui.run();
    }
}
