package com.study.example.movemethod;

/**
 * @author jiaoyuzhang
 * @date 2021年09月18日 18:44
 */
public class Account {

    private AccountType _type;
    private int _daysOverdrawn;

    double overdraftCharge(){
        return _type.overdraftCharge(_daysOverdrawn);
    }

    double bankCharge(){
        double result = 4.5;
        if (_daysOverdrawn > 0)result += overdraftCharge();
        return result;
    }

}
