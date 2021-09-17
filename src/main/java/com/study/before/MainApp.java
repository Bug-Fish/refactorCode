package com.study.before;

/**
 * @author jiaoyuzhang
 * @date 2021年09月17日 20:39
 */
public class MainApp {
    public static void main(String[] args) {
        Movie movie = new Movie("refactorCode", 2);
        Rental rental = new Rental(movie, 121);
        Customer customer = new Customer("Zjy");
        customer.addRental(rental);
        System.out.println(customer.statement());
    }
}
