package ro.ubb.Repository.MemoryRepository;


import ro.ubb.Domain.Nota;
import ro.ubb.Validator.IValidator;

public class NotaRepo extends AbstractCrudRepo<Integer, Nota> {
    public NotaRepo(IValidator<Nota> v){ super(v);
    }
}
