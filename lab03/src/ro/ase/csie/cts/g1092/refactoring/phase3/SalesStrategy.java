package ro.ase.csie.cts.g1092.refactoring.phase3;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidValueException;

public class SalesStrategy {
    public static final int FIDELITY_YEARS_THRESHOLD = 10;
    public static final float MAX_FIDELITY_DISCOUNT = 0.15f;

    public static float getFidelityDiscount(int yearsSinceRegistration) {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }

    public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
        return discount == 0 ? initialPrice :
                (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
    }

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException {
        if (initialPrice <= 0 || yearsSinceRegistration < 0) throw new InvalidValueException();

        float fidelityDiscount = getFidelityDiscount(yearsSinceRegistration);
        return getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
    }
}