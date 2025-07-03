//      Atividades da Aps - 1

// 1.	Desenvolva uma classe chamada “Trapézio” que possua um
//      atributo para armazenar o raio e métodos para calcular
//      a área e o perímetro do trapézio.


import java.util.Scanner;

public class Trapezio {

    // Cálculo do Trapézio
    static Scanner base1 = new Scanner(System.in);
    static Scanner base2 = new Scanner(System.in);
    static Scanner height = new Scanner(System.in);

    // Calculando o perímetro:
    static Scanner lado1 = new Scanner(System.in);
    static Scanner lado2 = new Scanner(System.in);
    static Scanner base01 = new Scanner(System.in);
    static Scanner base02 = new Scanner(System.in);

    public static class Space{
        public static void space_1(){
            // Beleza visual, nada além.
            System.out.println();
        }


    }
    public static void main(String[] args) {

        // Funcionalidade do Texto e Inputs

        Space.space_1();

        System.out.println("### DESENVOLVENDO A ÁREA DE UM TRAPÉZIO ###");
        System.out.println("Irei calcular a área e o perímetro de um trapézio para você.");
        Space.space_1();

        System.out.println("Primeiro, vou precisar de três valores:");
        System.out.println("1. Primeira base.");
        System.out.println("2. Segunda base.");
        System.out.println("3. Altura.");
        Space.space_1();

        System.out.println("Me forneça qualquer valor inteiro, sem ponto ou vígula, para a primeira base.");
        System.out.print("Base 1: ");
        int base_1 = base1.nextInt();
        Space.space_1();

        System.out.println("Agora me forneça um número inteiro para o outro.");
        System.out.print("Base 2: ");
        int base_2 = base2.nextInt();
        Space.space_1();

        System.out.println("Por fim, me forneça um valor inteiro para a altura.");
        System.out.print("Altura: ");
        int altura = height.nextInt();
        Space.space_1();

        // Início dos cálculos:

        float result1 = base_1 + base_2;
        float result2 = result1 / 2;
        float area = result2 * altura;

        System.out.println("Sua àrea do trapézio é: " + area);
        Space.space_1();

        // Calculando o perímetro:


        System.out.println("Agora, para saber o perímetro, deverá ser calculado ambas as bases e lados.");
        System.out.println("Para isso, preciso que você me forneça mais alguns valores: ");
        Space.space_1();

        System.out.print("Lado 1: ");
        int lado01 = lado1.nextInt();

        System.out.print("Lado 2: ");
        int lado02 = lado2.nextInt();

        System.out.print("Lado 3: ");
        int base001 = base01.nextInt();

        System.out.print("Lado 4: ");
        int base002 = base02.nextInt();

        // Conta para achar o perímetro:

        float perimetro = lado01 + lado02 + base001 + base002;
        System.out.println("Com estes valores, podemos dizer que o perímetro do seu trapézio é: " + perimetro);


    }

}
