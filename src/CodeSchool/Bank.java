package CodeSchool;

import java.util.ArrayList;

public class Bank {
    ArrayList workers = new ArrayList<Worker>();
    Chieaf chieaf;

    //verjnakan yst tnoreni stugvaci dimoxin tramadruma vark
    public void finalCheck(Worker worker, Loan loan, Acra acra) {
        if (chieaf.premission(acra, worker)) {
            workers.add(worker);
            if (worker.passport.point >= 400 && worker.passport.point < 500) {
                if (loan.amount <= 2 * worker.salary) {
                    worker.loans.add(loan);
                } else {
                    worker.loans.add(2 * worker.salary);
                }
            } else if (worker.passport.point >= 500 && worker.passport.point < 700) {
                if (loan.amount <= 5 * worker.salary) {
                    worker.loans.add(loan);
                } else {
                    worker.loans.add(5 * worker.salary);
                }
            } else if (worker.passport.point >= 700) {
                if (loan.amount <= 10 * worker.salary) {
                    worker.loans.add(loan);
                } else {
                    worker.loans.add(10 * worker.salary);
                }
            }
            System.out.println("Thank You");
        } else {
            System.out.println("We can not give you a loan");
        }
    }
}
