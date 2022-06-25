package CodeSchool;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int k;
        Bank bank = new Bank();
        Chieaf chieaf = new Chieaf();
        bank.chieaf = chieaf;

        do{
            System.out.println("1.Dimel Varki Hamar");
            System.out.println("2.Exit");
            k= sc.nextInt();

            switch (k){
                case 1:
                    Worker worker =new Worker();
                    Passport passport = new Passport();

                    System.out.print("Name: ");
                    passport.name = sc.next();
                    System.out.print("Surname: ");
                    passport.surName = sc.next();
                    System.out.print("age: ");
                    passport.age = sc.nextInt();
                    System.out.print("point: ");
                    passport.point = sc.nextInt();

                    worker.passport = passport;
                    System.out.print("Salary: ");
                    worker.salary = sc.nextInt();

                    Loan loan = new Loan();

                    System.out.print("Loan Amount: ");
                    loan.amount = sc.nextInt();
                    System.out.println("  1.SPAROXAKAN(Percent-10%, CountOfYear-10),\n" +
                            "    2.LOMBARDAYIN(Percent-5%, CountOfYear-4),\n" +
                            "    3.AVTOVARKER(Percent-7%, CountOfYear-8),\n" +
                            "    4.USUMNAKAN(Percent-6%, CountOfYear-7),\n" +
                            "    5.AREVTRAYIN(Percent-20%, CountOfYear-30),\n" +
                            "    6.GYUXATNTESAKAN(Percent-4%, CountOfYear-9),\n" +
                            "    7.HIPOTEKAYIN(Percent-7%, CountOfYear-2);");

                    int loanType= sc.nextInt();

                    switch (loanType){
                        case 1:
                            loan.loanTypeEnum = LoanTypeEnum.SPAROXAKAN;
                            break;
                        case 2:
                            loan.loanTypeEnum = LoanTypeEnum.LOMBARDAYIN;
                            break;
                        case 3:
                            loan.loanTypeEnum = LoanTypeEnum.AREVTRAYIN;
                            break;
                        case 4:
                            loan.loanTypeEnum = LoanTypeEnum.USUMNAKAN;
                            break;
                        case 5:
                            loan.loanTypeEnum = LoanTypeEnum.AREVTRAYIN;
                            break;
                        case 6:
                            loan.loanTypeEnum = LoanTypeEnum.GYUXATNTESAKAN;
                            break;
                        case 7:
                            loan.loanTypeEnum = LoanTypeEnum.HIPOTEKAYIN;
                            break;
                        default:
                            k=2;
                            break;
                    }

                    if(k!=2) {
                        bank.finalCheck(worker, loan, Acra.singleAcra());
                    }

                    break;

            }


        }while(k<2);


        for (int i = 0; i < bank.workers.size(); i++) {
            System.out.println(bank.workers.get(i)+",");
        }

    }
}
