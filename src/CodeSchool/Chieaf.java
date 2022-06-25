package CodeSchool;

import java.util.Random;

public class Chieaf {

    //banki tnoreny verjnakan stuguma dimoxi varki patmutyun
    public boolean premission(Acra acra, Worker worker) {
        if (acra.Check(worker)) {
            return true;
        }
        return false;
    }
}
