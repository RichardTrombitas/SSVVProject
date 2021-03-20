package ro.ubb.Validator;

import ro.ubb.Exceptions.ValidatorException;

public interface IValidator<E> {
    void validate(E entity) throws ValidatorException;
}
