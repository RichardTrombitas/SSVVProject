package ro.ubb.Service.TxtFileService;

import ro.ubb.Domain.Nota;
import ro.ubb.Repository.TxtFileRepository.NotaFileRepo;

public class NotaService extends AbstractService<Integer, Nota> {
    public NotaService(NotaFileRepo notaRepo){
        super(notaRepo);
    }
}
