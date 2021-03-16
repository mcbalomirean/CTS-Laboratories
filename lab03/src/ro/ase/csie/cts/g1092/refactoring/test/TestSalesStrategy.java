package ro.ase.csie.cts.g1092.refactoring.test;

import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1092.refactoring.exceptions.InvalidYearsSinceRegistrationException;
import ro.ase.csie.cts.g1092.refactoring.phase5.ProductType;
import ro.ase.csie.cts.g1092.refactoring.phase5.SalesStrategy;
import ro.ase.csie.cts.g1092.refactoring.phase5.marketing.MarketingStrategyInterface;
import ro.ase.csie.cts.g1092.refactoring.phase5.services.Marketing2021Service;
import ro.ase.csie.cts.g1092.refactoring.phase5.services.ValidatorService;

public class TestSalesStrategy {
    public static void main(String[] args) {
        Marketing2021Service marketingService = new Marketing2021Service();
        ValidatorService validatorService = new ValidatorService();
        SalesStrategy salesStrategy = new SalesStrategy(marketingService, validatorService);

        try {
            float finalPrice = salesStrategy.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
            System.out.println("The final price is: " + finalPrice);

            salesStrategy.setMarketingStrategy(new MarketingStrategyInterface() {
                @Override
                public float getFidelityDiscount(int yearsSinceRegistration) {
                    return 0.5f;
                }
            });
            finalPrice = salesStrategy.computeFinalPrice(ProductType.DISCOUNTED, 100, 5);
            System.out.println("The final price is: " + finalPrice);
        } catch (InvalidPriceException | InvalidYearsSinceRegistrationException e) {
            e.printStackTrace();
        }
    }
}
