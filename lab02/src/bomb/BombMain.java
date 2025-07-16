package bomb;

import common.IntList;
import edu.princeton.cs.algs4.In;

public class BombMain {
    public static void answers(String[] args) {
        int phase = 2;
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            int[] values = {8,0,3,9,0};
            IntList password = null;
            for (int value : values){
                password = new IntList(value,password);
            }
            b.phase1(password); // Figure this out too
        }
        if (phase >= 2) {
            b.phase2("793227803");
        }
    }
}
