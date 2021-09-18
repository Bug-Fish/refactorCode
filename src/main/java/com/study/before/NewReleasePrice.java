package com.study.before;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 12:01
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented){
        return daysRented * 3;
    }

    @Override
    int getFrequentRenterPoints(int daysRented){
        return (daysRented > 1) ? 2 : 1;
    }
}
