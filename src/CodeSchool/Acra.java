package CodeSchool;

public class Acra {
    private static Acra acra = new Acra();

    private Acra() {

    }

    static public Acra singleAcra() {
        return acra;
    }


    //stugumaa dimoxi varki patmutyuny
    public boolean Check(Worker worker) {
        if (worker.salary >= 65000 && worker.passport.age >= 18 && worker.passport.age <= 60 && worker.passport.point >= 400) {
            return true;
        }
        return false;
    }
}
