public class Main {

    public static void main(String[] args) {

        System.out.println("Salário Dos Funcionários da Empresa");


        // Funcionário 1
        System.out.println("____________________________________");
        Funcionario fun1 = new Funcionario ("Ana Liz", 2500.00, "Gerente de Vendas");
        System.out.println("Benefícios: VR, VT, carro da empresa, R$ 250 a mais por venda");
        fun1.dados();
        System.out.println("____________________________________");

        // Funcionário 2
        Funcionario fun2 = new Funcionario ("Eduardo Cabral", 1225.00, "Estagiário");
        System.out.println("Benefícios: VR, VT, R$50 a mais por venda");
        fun2.dados();
        System.out.println("____________________________________");

        // Funcionário 3
        Funcionario fun3 = new Funcionario ("Vitor Pinheiro", 3150.00, "Vendedor");
        System.out.println("Benefícios: VR, VT, R$100 a mais por venda");
        fun3.dados();
        System.out.println("____________________________________");

    }

}
