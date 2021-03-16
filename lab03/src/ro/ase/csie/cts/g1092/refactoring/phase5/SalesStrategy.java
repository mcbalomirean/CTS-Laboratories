package ro.ase.csie.cts.g1092.refactoring.phase5;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.csie.cts.g1092.refactoring.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {
    private MarketingStrategyInterface marketingStrategy = null;
    private SalesValidatorsInterface salesValidators = null;

    public SalesStrategy(MarketingStrategyInterface marketingStrategy, SalesValidatorsInterface salesValidators) {
        if (marketingStrategy == null || salesValidators == null) {
            throw new NullPointerException();
        }
        this.marketingStrategy = marketingStrategy;
        this.salesValidators = salesValidators;
    }

    // optional
    // allowing the change at runtime of the marketing strategy
    public void setMarketingStrategy(MarketingStrategyInterface marketingStrategy) {
        if (marketingStrategy == null) {
            throw new NullPointerException();
        }
        this.marketingStrategy = marketingStrategy;
    }

    public void setSalesValidators(SalesValidatorsInterface salesValidators) {
        if (salesValidators == null) {
            throw new NullPointerException();
        }
        this.salesValidators = salesValidators;
    }

    public static float getPriceWithDiscount(float initialPrice, float discount, float fidelityDiscount) {
        float initialDiscount = initialPrice - (discount * initialPrice);
        return initialDiscount * (1 - fidelityDiscount);
    }

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidPriceException, InvalidYearsSinceRegistrationException {
        salesValidators.validatePrice(initialPrice);
        salesValidators.validateYearsSinceRegistration(yearsSinceRegistration);

        float fidelityDiscount = (productType != ProductType.NEW) ? marketingStrategy.getFidelityDiscount(yearsSinceRegistration) : 0;
        return getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
    }
}