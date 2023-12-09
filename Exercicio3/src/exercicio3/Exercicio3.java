/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Matheus
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        File file = new File("./Alunos.csv");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bf.readLine()) != null) {
                Aluno aluno = new Aluno();
                String[] linhaAtualDividida = line.split(",");
                aluno.setNome(linhaAtualDividida[0]);
                int[] notas = new int[3];
                for (int i = 0; 3 > i; i++) {
                    notas[i] = Integer.parseInt(linhaAtualDividida[i + 1]);
                }
                aluno.setNotas(notas);
                alunos.add(aluno);
            }
            bf.close();
            for (int i = 0; alunos.size() > i; i++) {
                Aluno alunoAtual = alunos.get(i);
                double media = 0;
                for (int j = 0; alunoAtual.getNotas().length > j; j++) {
                    media += alunoAtual.getNotas()[j];
                }
                media = media / 3;
                JOptionPane.showMessageDialog(null, "Nome do aluno: " + alunoAtual.getNome()
                        + "\nMédia final do aluno: " + media);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
