/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package russiawc;

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
    public static void main(String[] args) {
        // TODO code application logic here
        //National Team [0] | Rating [1] | Points [2] | Goals [3] | Goals Conceded [4]
        String[][] A = {{"Russia", "6.7", "0", "0", "0"}, {"Saudi Arabia", "4.4", "0", "0", "0"}, {"Egypt", "4.6", "0", "0", "0"}, {"Uruguay", "7.8", "0", "0", "0"}};
        String[][] B = {{"Portugal", "8.2", "0", "0", "0"}, {"Spain", "8.7", "0", "0", "0"}, {"Iran", "5.9", "0", "0", "0"}, {"Morocco", "5.8", "0", "0", "0"}};
        String[][] C = {{"France", "8.9", "0", "0", "0"}, {"Australia", "5.1", "0", "0", "0"}, {"Peru", "6.4", "0", "0", "0"}, {"Denmark", "6.8", "0", "0", "0"}};
        String[][] D = {{"Argentina", "7.9", "0", "0", "0"}, {"Iceland", "6.6", "0", "0", "0"}, {"Croatia", "8.1", "0", "0", "0"}, {"Nigeria", "6.8", "0", "0", "0"}};
        String[][] E = {{"Brazil", "9.2", "0", "0", "0"}, {"Switzerland", "7.2", "0", "0", "0"}, {"Costa Rica", "6.1", "0", "0", "0"}, {"Serbia", "6.8", "0", "0", "0"}};
        String[][] F = {{"Germany", "8.3", "0", "0", "0"}, {"Mexico", "7.1", "0", "0", "0"}, {"Sweden", "7.2", "0", "0", "0"}, {"South Korea", "6.6", "0", "0", "0"}};
        String[][] G = {{"Belgium", "8.8", "0", "0", "0"}, {"Panama", "3.1", "0", "0", "0"}, {"Tunisia", "4.8", "0", "0", "0"}, {"England", "8.0", "0", "0", "0"}};
        String[][] H = {{"Poland", "6.8", "0", "0", "0"}, {"Senegal", "6.9", "0", "0", "0"}, {"Colombia", "7.3", "0", "0", "0"}, {"Japan", "7.0", "0", "0", "0"}};

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
        System.out.println("GROUP H\n");
        Group Group_H = new Group(H[0][0], Double.valueOf(H[0][1]), H[1][0], Double.valueOf(H[1][1]),
                H[2][0], Double.valueOf(H[2][1]), H[3][0], Double.valueOf(H[3][1]));
        Group_H.Results();

        System.out.println("First team " + Group_A.get_Team1() + "\t" + Group_A.get_rating1());
        System.out.println("Second team " + Group_A.get_Team2() + "\t" + Group_A.get_rating2());
    }
}
