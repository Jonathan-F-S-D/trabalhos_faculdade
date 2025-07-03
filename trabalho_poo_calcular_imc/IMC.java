/*  Questão 2 - Atividade N1

    Desenvolva uma classe em java que calcule o IMC de uma pessoa e
    informe se está acima ou abaixo do peso.

    Construir as três classes e postar no formulário no QR Code.
 */

import java.util.Scanner;

public class IMC {
    public static void main(String [] args) {
        boolean repetir = true;
        while (repetir) {
            //Texto de apresentação

            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println ("Calculador de IMC - ìndice de Massa Corporal");
            System.out.println();
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.println("Por favor, insira sua altura atual, sem pontos ou vírgulas," +
                    " para que possamos calcular seu IMC.");
            System.out.println();

            // Valor da altura + elevação a 2
            Scanner imc= new Scanner(System.in);
            double a, b, c = 0;

            System.out.print("insira sua altura em cm (ex: 165): ");
            a = imc.nextDouble();
            a = a / 100;




            // Valor do peso
            System.out.println("Agora, insira seu peso atual.");
            System.out.println();
            System.out.print("Insira seu peso de acordo com o seu sistema (ex: 80.4). ");
            System.out.print("Caso não funcione com '.', troque por ',', por favor: ");
            b = imc.nextDouble();


            // Resultado
            c= b / (a * a);


            System.out.println("Seu Índice de Massa corporal é: " + c);

            // Variáveis de resultado
            String atual = "Atualmente, você está no: ";
            System.out.println();
            if (c <= 18.5){
                System.out.println( atual + "ABAIXO DO PESO IDEAL");

            }
            else if (c >= 18.6 && c <= 24.9){
                System.out.println(atual + "PESO IDEAL");

            }
            else if (c >=25.0 && c <= 29.9){
                System.out.println(atual + "SOBREPESO");

            }
            else if (c >= 30.0){
                System.out.println(atual + "OBESIDADE");
            }

            System.out.println();
            System.out.print("Gostaria de calcular um novo IMC? (s/n): ");
            String resposta = imc.next();
            if (!resposta.equalsIgnoreCase("s")){
                repetir = false;
            }
        }

    }

}
