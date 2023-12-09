/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("./Alunos.csv");
        Random random = new Random();
        try {
            int lineNumber = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de alunos para registrar"));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; lineNumber > i; i++) {
                bw.write(JOptionPane.showInputDialog("Informe o nome do aluno") + ",");
                bw.write(random.nextInt(10) + ",");
                bw.write(random.nextInt(10) + ",");
                bw.write(random.nextInt(10) + "");
                if (i + 1 != lineNumber) {
                    bw.write("\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
