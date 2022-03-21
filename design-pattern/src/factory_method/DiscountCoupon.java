package factory_method;

import java.time.LocalDate;

public abstract class DiscountCoupon {

    abstract public DiscountCouponType getType();
    abstract public String getCouponName();
    abstract public short getAmount();
    abstract public LocalDate getExpiryDate();

    public boolean isAvailable() {
        return !this.getExpiryDate().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {

        return this.getType() + " Coupon :: Coupon Name : " + this.getCouponName() +
                " , Amount : " + this.getAmount() +
                ", ExpiryDate : " + this.getExpiryDate();
    }
}
