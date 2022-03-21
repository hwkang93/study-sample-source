package factory_method;

import java.time.LocalDate;

public class DeliveryDiscountCoupon extends DiscountCoupon {

    private DiscountCouponType discountCouponType;
    private String couponName;
    private short amount;
    private LocalDate expiryDate;

    public DeliveryDiscountCoupon(DiscountCouponType discountCouponType, String couponName, short amount, LocalDate expiryDate) {
        this.discountCouponType = discountCouponType;
        this.couponName = couponName;
        this.amount = amount;
        this.expiryDate = expiryDate;
    }

    @Override
    public DiscountCouponType getType() {
        return this.discountCouponType;
    }

    @Override
    public String getCouponName() {
        return this.couponName;
    }

    @Override
    public short getAmount() {
        return this.amount;
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.expiryDate;
    }
}
