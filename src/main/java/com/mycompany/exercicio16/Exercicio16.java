

package com.mycompany.exercicio16;

import javax.swing.JOptionPane;
public class Exercicio16 {

    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("DIgite o primeiro numero:");
        Double numero1 = Double.valueOf(input1);
        
        String input2 =JOptionPane.showInputDialog("Digite o segundo numero");
        double numero2 = Double.parseDouble(input2);
        
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int escolha = JOptionPane.showOptionDialog(null,
                "Escolha a operação", "Calculadora",
                JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,
                null,opcoes, opcoes[0]);
        double resultado = 0;
        String operacao = null;
        
        
        switch(escolha) {
            case 1 -> {
                resultado = numero1 + numero2;
                operacao = "Subtração";
            }
            case 2 -> {
                resultado = numero1 * numero2;
                operacao = "multiplicação";
            }
            case 3 -> {
                if (numero2 !=0) {
                    resultado = numero1 / numero2;
                    operacao = "divisão";
                }else{
                    JOptionPane.showMessageDialog(null, "erro,divisão por zero nao é permitida.");
                    
                    return;
                }
            }
            default -> JOptionPane.showMessageDialog(null, "Operação inválida,");
        }
        
        JOptionPane.showMessageDialog(null, "O resultado da " + operacao + "é" + resultado);
        
    }
}
