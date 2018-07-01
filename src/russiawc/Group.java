/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russiawc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;

/**
 * 
 * @author jonnie
 */
public class Group {

    private String team1, team2, team3, team4;
    private double rating1, rating2, rating3, rating4;
    String[][] Table = new String[4][5];

    public Group(String team1, double rating1, String team2, double rating2, String team3, double rating3, String team4, double rating4) {
        this.team1 = team1;
        this.rating1 = rating1;
        Table[0][0] = team1;
        Table[0][1] = Double.toString(rating1);
        this.team2 = team2;
        this.rating2 = rating2;
        Table[1][0] = team2;
        Table[1][1] = Double.toString(rating2);
        this.team3 = team3;
        this.rating3 = rating3;
        Table[2][0] = team3;
        Table[2][1] = Double.toString(rating3);
        this.team4 = team4;
        this.rating4 = rating4;
        Table[3][0] = team4;
        Table[3][1] = Double.toString(rating4);
        for (int i = 0; i <= 3; i++) {
            Table[i][2] = Table[i][3] = Table[i][4] = "0";
        }
    }

    /**
     * Simulates the results at group stage
     */
    public void Results() {
        DecimalFormat df = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.ENGLISH));
        FinalResult fr = new FinalResult();
        for (int j = 1; j <= 3; j++) {
            for (int i = j; i <= 3; i++) {
                fr.RandomizeFactor(Double.valueOf(Table[j - 1][1]), Double.valueOf(Table[i][1]));
//                System.out.println(df.format(a) + " " + df.format(b) + " " + Table[j - 1][0] + "-" + Table[i][0]);
                System.out.println(String.format("%1$-50s", "Final factor for " + Table[j - 1][0] + " : " + df.format(fr.getRf1()))
                        + "\t Final factor for " + Table[i][0] + " : " + df.format(fr.getRf2()));
                if (fr.getRf1() - fr.getRf2() > 1) {
                    //Points
                    Table[j - 1][2] = Integer.toString(Integer.valueOf(Table[j - 1][2]) + 3);
                    //Goals for winner
                    Table[j - 1][3] = Integer.toString(Integer.valueOf(Table[j - 1][3]) + fr.GoalAhead());
                    //Goals conceded for defeated
                    Table[i][4] = Integer.toString(Integer.valueOf(Table[i][4]) + fr.GoalAhead());
                    //Goals conceded for winner
                    Table[j - 1][4] = Integer.toString(Integer.valueOf(Table[j - 1][4]) + fr.GoalBase());
                    //Goals for defeated
                    Table[i][3] = Integer.toString(Integer.valueOf(Table[i][3]) + fr.GoalBase());
                    System.out.println("\t\t\t\t  " + Table[j - 1][0] + "-" + Table[i][0] + " " + fr.GoalAhead() + "-" + fr.GoalBase());
                } else if (fr.getRf1() - fr.getRf2() < -1) {
                    //Points
                    Table[i][2] = Integer.toString(Integer.valueOf(Table[i][2]) + 3);
                    //Goals for winner
                    Table[i][3] = Integer.toString(Integer.valueOf(Table[i][3]) + fr.GoalAhead());
                    //Goals conceded for defeated
                    Table[j - 1][4] = Integer.toString(Integer.valueOf(Table[j - 1][4]) + fr.GoalAhead());
                    //Goals conceded for winner
                    Table[i][4] = Integer.toString(Integer.valueOf(Table[i][4]) + fr.GoalBase());
                    //Goals for defeated
                    Table[j - 1][3] = Integer.toString(Integer.valueOf(Table[j - 1][3]) + fr.GoalBase());
                    System.out.println("\t\t\t\t  " + Table[i][0] + "-" + Table[j - 1][0] + " " + fr.GoalAhead() + "-" + fr.GoalBase());
                } else {
                    //Points
                    Table[j - 1][2] = Integer.toString(Integer.valueOf(Table[j - 1][2]) + 1);
                    Table[i][2] = Integer.toString(Integer.valueOf(Table[i][2]) + 1);
                    //Goals 
                    Table[i][3] = Integer.toString(Integer.valueOf(Table[i][3]) + fr.Draw());
                    Table[j - 1][3] = Integer.toString(Integer.valueOf(Table[j - 1][3]) + fr.Draw());
                    //Goals conceded
                    Table[i][4] = Integer.toString(Integer.valueOf(Table[i][4]) + fr.Draw());
                    Table[j - 1][4] = Integer.toString(Integer.valueOf(Table[j - 1][4]) + fr.Draw());
                    System.out.println("\t\t\t\t  " + Table[i][0] + "-" + Table[j - 1][0] + " " + fr.Draw() + "-" + fr.Draw());
                }
            }
        }

        String[] tmpRow;
        //Sort by overall Points
        for (int i = 0; i <= 2; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (Integer.valueOf(Table[j][2]) > Integer.valueOf(Table[i][2])) {
                    tmpRow = Table[j];
                    Table[j] = Table[i];
                    Table[i] = tmpRow;
                }
            }
        }
        //Sort by Goal difference in case there are teams with equal overall Points
        for (int i = 0; i <= 2; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (Objects.equals(Integer.valueOf(Table[j][2]), Integer.valueOf(Table[i][2]))) {
                    if (Integer.valueOf(Table[j][3]) - Integer.valueOf(Table[j][4]) > Integer.valueOf(Table[i][3]) - Integer.valueOf(Table[i][4])) {
                        tmpRow = Table[j];
                        Table[j] = Table[i];
                        Table[i] = tmpRow;
                    }
                }
            }
        }
        //Sort by attack goals in case there is still no discrete order
        for (int i = 0; i <= 2; i++) {
            for (int j = i + 1; j <= 3; j++) {
                if (Integer.valueOf(Table[j][3]) - Integer.valueOf(Table[j][4]) == Integer.valueOf(Table[i][3]) - Integer.valueOf(Table[i][4])
                        && Objects.equals(Integer.valueOf(Table[j][2]), Integer.valueOf(Table[i][2]))) {
                    if (Integer.valueOf(Table[j][3]) > Integer.valueOf(Table[i][3])) {
                        tmpRow = Table[j];
                        Table[j] = Table[i];
                        Table[i] = tmpRow;
                    }
                }
            }
        }
        
        System.out.println("\n -------------------------------------- ");
        for (int i = 0; i <= 3; i++) {
            System.out.println("| " + String.format("%1$-15s", Table[i][0]) + " " + Table[i][2] + " Points "
                    + String.format("%1$3d", Integer.valueOf(Table[i][3]) - Integer.valueOf(Table[i][4])) + " GD " + Integer.valueOf(Table[i][3]) + " GA |");
        }
        System.out.println(" -------------------------------------- \n");
    }
    /**
     * Gets the name of the first qualified team
     * @return 
     */
    public String get_Team1(){
        String team;
        team = Table[0][0];
        return team;
    }
    /**
     *  Gets the rating of the first qualified team
     * @return 
     */
    public double get_rating1(){
        double rating;
        rating = Double.valueOf(Table[0][1]);
        return rating;
    }
    /**
     * Gets the name of the second qualified team
     * @return 
     */
    public String get_Team2(){
        String team;
        team = Table[1][0];
        return team;
    }
    /**
     * Gets the rating of the second qualified team
     * @return 
     */
    public double get_rating2(){
        double rating;
        rating = Double.valueOf(Table[1][1]);
        return rating;
    }

}
