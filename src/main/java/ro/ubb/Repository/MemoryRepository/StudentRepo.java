package ro.ubb.Repository.MemoryRepository;


import ro.ubb.Domain.Student;
import ro.ubb.Validator.IValidator;

public class StudentRepo extends AbstractCrudRepo<String, Student> {
    public StudentRepo(IValidator<Student> v){ super(v);
    }
}
