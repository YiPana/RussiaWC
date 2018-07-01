/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russiawc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author jonnie
 */
public class FinalResult {

    DecimalFormat df;
    double rf1, rf2;

    public FinalResult() {
        df = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.ENGLISH));
    }

    public void RandomizeFactor(double rating1, double rating2) {
        double prob1, prob2;
        prob1 = Math.random();
        prob1 += Math.random();
        prob1 += Math.random();
        prob1 = (prob1/3);
        if (prob1 < 0.3) {
            prob1 = 0.3;
        }
        rf1 = Double.valueOf(df.format(prob1)) * rating1;
        prob2 = Math.random();
        prob2 += Math.random();
        prob2 += Math.random();
        prob2 = (prob2/3);
        if (prob2 < 0.3) {
            prob2 = 0.3;
        }
        rf2 = Double.valueOf(df.format(prob2)) * rating2;
    }

    public double getRf1() {
        return rf1;
    }

    public double getRf2() {
        return rf2;
    }
    

    private int GoalDiff() {
        int goalDiff;
        goalDiff = (int) Math.abs((rf1 - rf2));
        return goalDiff;
    }

    protected int GoalAhead() {
        int gd = GoalDiff();
        int gb = GoalBase();
        return gd + gb;
    }

    protected int GoalBase() {
        int goals;
        double base;
        base = Math.min(rf1, rf2);
        if (base < 3) {
            goals = 0;
        } else if (base < 6) {
            goals = 1;
        } else if (base < 8) {
            goals = 2;
        } else {
            goals = 3;
        }
        return goals;
    }

    protected int Draw() {
        int goals;
        if ((rf1 + rf2) < 5) {
            goals = 0;
        } else if ((rf1 + rf2) < 8) {
            goals = 1;
        } else if ((rf1 + rf2) < 10) {
            goals = 2;
        } else {
            goals = 3;
        }
        return goals;
    }
}
