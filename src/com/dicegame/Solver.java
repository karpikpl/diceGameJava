package com.dicegame;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Solver {

    private final Reader reader;

    public Solver(Reader reader) {
        this.reader = reader;
    }

    public String solve() {
        int gunnarMin1 = reader.readInt();
        int gunnarMax1 = reader.readInt();
        int gunnarMin2 = reader.readInt();
        int gunnarMax2 = reader.readInt();
        reader.readLine();
        int emmaMin1 = reader.readInt();
        int emmaMax1 = reader.readInt();
        int emmaMin2 = reader.readInt();
        int emmaMax2 = reader.readInt();

        float gunnarScore = calculate(gunnarMin1, gunnarMax1) + calculate(gunnarMin2, gunnarMax2);
        float emmaScore = calculate(emmaMin1, emmaMax1) + calculate(emmaMin2, emmaMax2);

        System.err.printf("Gunnar %f, Emma %f", gunnarScore, emmaScore);

        if (gunnarScore > emmaScore) {
            return "Gunnar";
        } else if (gunnarScore < emmaScore) {
            return "Emma";
        } else {
            return "Tie";
        }
    }

    public static float calculate(int min, int max) {
        // sum: (a1 + an)*n/2
        // probability: 1/n
        //      - > (a1 + an)/2

        return (min + max) / 2f;
    }
}
