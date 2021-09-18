package com.study.before;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 12:02
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented){
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2)* 1.5;
        return result;
    }
}
