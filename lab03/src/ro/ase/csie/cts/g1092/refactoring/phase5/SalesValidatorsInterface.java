package ro.ase.csie.cts.g1092.refactoring.phase5;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {
    void validatePrice(float initialPrice) throws InvalidPriceException;
    void validateYearsSinceRegistration(int yearsSinceRegistration) throws InvalidYearsSinceRegistrationException;
}
