package com.study.example.movemethod;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 18:44
 */
public class AccountType {
    public boolean isPremium() {
        return false;
    }

    double overdraftCharge(int _daysOverdrawn){
        if (isPremium()){
            double result = 10;
            if (_daysOverdrawn > 7)result += (_daysOverdrawn - 7)* 0.85;
            return result;
        }
        else return _daysOverdrawn * 1.75;
    }
}
