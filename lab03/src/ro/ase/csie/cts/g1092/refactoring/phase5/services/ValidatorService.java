package ro.ase.csie.cts.g1092.refactoring.phase5.services;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.csie.cts.g1092.refactoring.phase5.SalesValidatorsInterface;

public class ValidatorService implements SalesValidatorsInterface {
    @Override
    public void validatePrice(float initialPrice) throws InvalidPriceException {
        if (initialPrice <= 0) {
            throw new InvalidPriceException();
        }
    }

    @Override
    public void validateYearsSinceRegistration(int yearsSinceRegistration) throws InvalidYearsSinceRegistrationException {
        if (yearsSinceRegistration < 0) {
            throw new InvalidYearsSinceRegistrationException();
        }
    }
}
