package ro.ase.csie.cts.g1092.refactoring.phase3;

public enum ProductType {
    NEW(0f), DISCOUNTED(0.1f), LIMITED_STOCK(0.25f), OLD(0.35f);

    private float discount;

    ProductType(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }
}
