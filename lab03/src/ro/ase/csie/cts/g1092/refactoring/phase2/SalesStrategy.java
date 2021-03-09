package ro.ase.csie.cts.g1092.refactoring.phase2;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidValueException;

public class SalesStrategy {
    public static final int FIDELITY_YEARS_THRESHOLD = 10;
    public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException {
        if (initialPrice <= 0 || yearsSinceRegistration < 0) throw new InvalidValueException();

        float fidelityDiscount = (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
        return productType.getDiscount() == 0 ? initialPrice :
                (initialPrice - (productType.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (productType.getDiscount() * initialPrice));
    }
}
