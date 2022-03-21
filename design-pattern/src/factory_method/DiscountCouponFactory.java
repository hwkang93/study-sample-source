package factory_method;

import java.time.LocalDate;

public class DiscountCouponFactory {

    private DiscountCouponFactory(){}

    public static DiscountCoupon create(DiscountCouponType discountCouponType, String couponName, short amount, LocalDate expiryDate) {

        return switch (discountCouponType) {
            case DELIVERY   -> new DeliveryDiscountCoupon(discountCouponType, couponName, amount, expiryDate);
            case ORDER      -> new OrderDiscountCoupon(discountCouponType, couponName, amount, expiryDate);
            default         -> null;
        };
    }
}
