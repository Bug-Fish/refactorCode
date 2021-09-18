package com.study.before;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 11:58
 */
abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
