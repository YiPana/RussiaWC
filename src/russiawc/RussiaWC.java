/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russiawc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author jonnie
 */
public class RussiaWC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here    
        PrintStream out = new PrintStream(new FileOutputStream("RussiaWC.txt"));
        
        //National Team [0] | Rating [1] | Points [2] | Goals [3] | Goals Conceded [4]
        String[][] A = {{"Russia", "6.7", "0", "0", "0"}, {"Saudi Arabia", "4.4", "0", "0", "0"}, {"Egypt", "4.6", "0", "0", "0"}, {"Uruguay", "7.8", "0", "0", "0"}};
        String[][] B = {{"Portugal", "8.2", "0", "0", "0"}, {"Spain", "8.7", "0", "0", "0"}, {"Iran", "5.9", "0", "0", "0"}, {"Morocco", "5.8", "0", "0", "0"}};
        String[][] C = {{"France", "8.9", "0", "0", "0"}, {"Australia", "5.1", "0", "0", "0"}, {"Peru", "6.4", "0", "0", "0"}, {"Denmark", "6.8", "0", "0", "0"}};
        String[][] D = {{"Argentina", "7.9", "0", "0", "0"}, {"Iceland", "6.6", "0", "0", "0"}, {"Croatia", "8.1", "0", "0", "0"}, {"Nigeria", "6.8", "0", "0", "0"}};
        String[][] E = {{"Brazil", "9.2", "0", "0", "0"}, {"Switzerland", "7.2", "0", "0", "0"}, {"Costa Rica", "6.1", "0", "0", "0"}, {"Serbia", "6.8", "0", "0", "0"}};
        String[][] F = {{"Germany", "8.3", "0", "0", "0"}, {"Mexico", "7.1", "0", "0", "0"}, {"Sweden", "7.2", "0", "0", "0"}, {"South Korea", "6.6", "0", "0", "0"}};
        String[][] G = {{"Belgium", "8.8", "0", "0", "0"}, {"Panama", "3.1", "0", "0", "0"}, {"Tunisia", "4.8", "0", "0", "0"}, {"England", "8.0", "0", "0", "0"}};
        String[][] H = {{"Poland", "6.8", "0", "0", "0"}, {"Senegal", "6.9", "0", "0", "0"}, {"Colombia", "7.3", "0", "0", "0"}, {"Japan", "7.0", "0", "0", "0"}};

        //***********************************************************GROUP STAGE*********************************************************
        System.out.println("GROUP A\n");
        Group Group_A = new Group(A[0][0], Double.valueOf(A[0][1]), A[1][0], Double.valueOf(A[1][1]),
                A[2][0], Double.valueOf(A[2][1]), A[3][0], Double.valueOf(A[3][1]));
        Group_A.Results();
        System.out.println("GROUP B\n");
        Group Group_B = new Group(B[0][0], Double.valueOf(B[0][1]), B[1][0], Double.valueOf(B[1][1]),
                B[2][0], Double.valueOf(B[2][1]), B[3][0], Double.valueOf(B[3][1]));
        Group_B.Results();
        System.out.println("GROUP C\n");
        Group Group_C = new Group(C[0][0], Double.valueOf(C[0][1]), C[1][0], Double.valueOf(C[1][1]),
                C[2][0], Double.valueOf(C[2][1]), C[3][0], Double.valueOf(C[3][1]));
        Group_C.Results();
        System.out.println("GROUP D\n");
        Group Group_D = new Group(D[0][0], Double.valueOf(D[0][1]), D[1][0], Double.valueOf(D[1][1]),
                D[2][0], Double.valueOf(D[2][1]), D[3][0], Double.valueOf(D[3][1]));
        Group_D.Results();
        System.out.println("GROUP E\n");
        Group Group_E = new Group(E[0][0], Double.valueOf(E[0][1]), E[1][0], Double.valueOf(E[1][1]),
                E[2][0], Double.valueOf(E[2][1]), E[3][0], Double.valueOf(E[3][1]));
        Group_E.Results();
        System.out.println("GROUP F\n");
        Group Group_F = new Group(F[0][0], Double.valueOf(F[0][1]), F[1][0], Double.valueOf(F[1][1]),
                F[2][0], Double.valueOf(F[2][1]), F[3][0], Double.valueOf(F[3][1]));
        Group_F.Results();
        System.out.println("GROUP G\n");
        Group Group_G = new Group(G[0][0], Double.valueOf(G[0][1]), G[1][0], Double.valueOf(G[1][1]),
                G[2][0], Double.valueOf(G[2][1]), G[3][0], Double.valueOf(G[3][1]));
        Group_G.Results();
        System.out.println("GROUP H\n");
        Group Group_H = new Group(H[0][0], Double.valueOf(H[0][1]), H[1][0], Double.valueOf(H[1][1]),
                H[2][0], Double.valueOf(H[2][1]), H[3][0], Double.valueOf(H[3][1]));
        Group_H.Results();

        System.out.println("Group A - 1st team : " + String.format("%1$-20s", Group_A.get_Team1()) + "\t" + Group_A.get_rating1());
        System.out.println("Group A - 2nd team : " + String.format("%1$-20s", Group_A.get_Team2()) + "\t" + Group_A.get_rating2());
        
        System.out.println("Group B - 1st team : " + String.format("%1$-20s", Group_B.get_Team1()) + "\t" + Group_B.get_rating1());
        System.out.println("Group B - 2nd team : " + String.format("%1$-20s", Group_B.get_Team2()) + "\t" + Group_B.get_rating2());
        
        System.out.println("Group C - 1st team : " + String.format("%1$-20s", Group_C.get_Team1()) + "\t" + Group_C.get_rating1());
        System.out.println("Group C - 2nd team : " + String.format("%1$-20s", Group_C.get_Team2()) + "\t" + Group_C.get_rating2());
        
        System.out.println("Group D - 1st team : " + String.format("%1$-20s", Group_D.get_Team1()) + "\t" + Group_D.get_rating1());
        System.out.println("Group D - 2nd team : " + String.format("%1$-20s", Group_D.get_Team2()) + "\t" + Group_D.get_rating2());
        
        System.out.println("Group E - 1st team : " + String.format("%1$-20s", Group_E.get_Team1()) + "\t" + Group_E.get_rating1());
        System.out.println("Group E - 2nd team : " + String.format("%1$-20s", Group_E.get_Team2()) + "\t" + Group_E.get_rating2());
        
        System.out.println("Group F - 1st team : " + String.format("%1$-20s", Group_F.get_Team1()) + "\t" + Group_F.get_rating1());
        System.out.println("Group F - 2nd team : " + String.format("%1$-20s", Group_F.get_Team2()) + "\t" + Group_F.get_rating2());
        
        System.out.println("Group G - 1st team : " + String.format("%1$-20s", Group_G.get_Team1()) + "\t" + Group_G.get_rating1());
        System.out.println("Group G - 2nd team : " + String.format("%1$-20s", Group_G.get_Team2()) + "\t" + Group_G.get_rating2());
        
        System.out.println("Group H - 1st team : " + String.format("%1$-20s", Group_H.get_Team1()) + "\t" + Group_H.get_rating1());
        System.out.println("Group H - 2nd team : " + String.format("%1$-20s", Group_H.get_Team2()) + "\t" + Group_H.get_rating2());
        
        //********************************************************KNOCKOUT 16*******************************************************
        System.out.println("\n\n\t\t\t\t PHASE OF KNOCKOUT 16\n");
        SimResult knockout = new SimResult();
        
        knockout.GetKnockoutResult(Group_A.get_Team1(), Group_A.get_rating1(), Group_B.get_Team2(), Group_B.get_rating2());
        String W_A1B2 = knockout.getWinnerTeam();
        double r_A1B2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_B.get_Team1(), Group_B.get_rating1(), Group_A.get_Team2(), Group_A.get_rating2());
        String W_B1A2 = knockout.getWinnerTeam();
        double r_B1A2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_C.get_Team1(), Group_C.get_rating1(), Group_D.get_Team2(), Group_D.get_rating2());
        String W_C1D2 = knockout.getWinnerTeam();
        double r_C1D2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_D.get_Team1(), Group_D.get_rating1(), Group_C.get_Team2(), Group_C.get_rating2());
        String W_D1C2 = knockout.getWinnerTeam();
        double r_D1C2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_E.get_Team1(), Group_E.get_rating1(), Group_F.get_Team2(), Group_F.get_rating2());
        String W_E1F2 = knockout.getWinnerTeam();
        double r_E1F2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_F.get_Team1(), Group_F.get_rating1(), Group_E.get_Team2(), Group_E.get_rating2());
        String W_F1E2 = knockout.getWinnerTeam();
        double r_F1E2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_G.get_Team1(), Group_G.get_rating1(), Group_H.get_Team2(), Group_H.get_rating2());
        String W_G1H2 = knockout.getWinnerTeam();
        double r_G1H2 = knockout.getWinnerRating();
        
        knockout.GetKnockoutResult(Group_H.get_Team1(), Group_H.get_rating1(), Group_G.get_Team2(), Group_G.get_rating2());
        String W_H1G2 = knockout.getWinnerTeam();
        double r_H1G2 = knockout.getWinnerRating();
        
        //************************************************QUARTER FINALS ******************************************************
        System.out.println("\n\n\t\t\t\t PHASE OF QUARTER FINALS\n");
        //QF_A1B2_C1D2
        knockout.GetKnockoutResult(W_A1B2, r_A1B2, W_C1D2, r_C1D2);
        String Q1 = knockout.getWinnerTeam();
        double r_Q1 = knockout.getWinnerRating();
        //QF_B1A2_D1C2
        knockout.GetKnockoutResult(W_B1A2, r_B1A2, W_D1C2, r_D1C2);
        String Q3 = knockout.getWinnerTeam();
        double r_Q3 = knockout.getWinnerRating();
        //QF_E1F2_G1H2
        knockout.GetKnockoutResult(W_E1F2, r_E1F2, W_G1H2, r_G1H2);
        String Q2 = knockout.getWinnerTeam();
        double r_Q2 = knockout.getWinnerRating();
        //QF_F1E2_H1G2
        knockout.GetKnockoutResult(W_F1E2, r_F1E2, W_H1G2, r_H1G2);
        String Q4 = knockout.getWinnerTeam();
        double r_Q4 = knockout.getWinnerRating();
        
        //*************************************************SEMI FINALS************************************************************
        System.out.println("\n\n\t\t\t\t PHASE OF SEMI FINALS\n");
        //SF1
        knockout.GetKnockoutResult(Q1, r_Q1, Q2, r_Q2);
        String SF1_W = knockout.getWinnerTeam();
        double r_SF1_W = knockout.getWinnerRating();
        String SF1_L = knockout.getDefeatedTeam();
        double r_SF1_L = knockout.getDefeatedRating();
        //SF2
        knockout.GetKnockoutResult(Q3, r_Q3, Q4, r_Q4);
        String SF2_W = knockout.getWinnerTeam();
        double r_SF2_W = knockout.getWinnerRating();
        String SF2_L = knockout.getDefeatedTeam();
        double r_SF2_L = knockout.getDefeatedRating();
        
        //**************************************************THIRD PLACE***********************************************************
        System.out.println("\n\n\t\t\t\t THIRD PLACE\n");
        knockout.GetKnockoutResult(SF1_L, r_SF1_L, SF2_L, r_SF2_L);
        out.println(knockout.getWinnerTeam());
        
        //*****************************************************FINAL**************************************************************
        System.out.println("\n\n\t\t\t\t FINAL\n");
        knockout.GetKnockoutResult(SF1_W, r_SF1_W, SF2_W, r_SF2_W);
        
        System.out.println("Russia World Cup 2018 WINNER : " + knockout.getWinnerTeam() + "\n");
        
        out.println(knockout.getWinnerTeam());
        System.setOut(out);
    }
}
