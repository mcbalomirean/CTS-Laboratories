package ro.ase.csie.cts.g1092.refactoring.phase5.marketing;

public interface MarketingStrategyInterface {
    int FIDELITY_YEARS_THRESHOLD = 10;
    float MAX_FIDELITY_DISCOUNT = 0.15f;

    float getFidelityDiscount(int yearsSinceRegistration);
}
