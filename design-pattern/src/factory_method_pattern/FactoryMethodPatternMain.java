package factory_method_pattern;

import java.time.LocalDate;

public class FactoryMethodPatternMain {
    public static void main(String[] args) {
        DiscountCouponType discountCouponType = DiscountCouponType.DELIVERY;
        String couponName = "1주년 기념 배달비 1000원 할인 쿠폰";
        short amount = 1000;
        LocalDate expiryDate = LocalDate.of(2021, 03, 20);

        DiscountCoupon coupon = DiscountCouponFactory.create(discountCouponType, couponName, amount, expiryDate);

        System.out.println(coupon.toString());
        System.out.println(coupon.isAvailable());
    }
}
