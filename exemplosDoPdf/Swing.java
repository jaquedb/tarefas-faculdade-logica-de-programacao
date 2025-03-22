package exemplosDoPdf;

import javax.swing.JOptionPane;

public class Swing {
    public static void main(String[] args) {
        //pedindo para o usuário digitar o números para realização do cálculo
        String firstNumber = JOptionPane.showInputDialog("Enter first integer: "); 
        String secondNumber = JOptionPane.showInputDialog("Enter second integer: ");
        
        //Convertendo os números inseridos pelo usuário para "integer"pois foi inserido como String
        int number = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        //Fazendo o cálculo  depois da conversão
        int sum = number + number2;

        //Exibindo o resultado na tela
        JOptionPane.showMessageDialog(null, "the sum is "+ sum, "Sum of two integers", JOptionPane.PLAIN_MESSAGE);
    }
    
}
