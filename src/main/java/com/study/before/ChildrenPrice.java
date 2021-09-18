package com.study.before;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 12:00
 */
public class ChildrenPrice extends Price {

    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3)* 1.5;
        return result;
    }
}
