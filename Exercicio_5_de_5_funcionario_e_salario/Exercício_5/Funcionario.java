public class Funcionario {

    String nome;
    double salario;
    String cargo;

        public Funcionario (String nome, double salario, String cargo) {
            this.nome = nome;
            this.salario = salario;
            this.cargo = cargo;

        }

        public double calcularSalario(){

            double descontoImposto = salario * 0.10;

            return salario - descontoImposto;
        }

        public void dados(){
            System.out.println("Nome: " + nome);
            System.out.println("Cargo: " + cargo);
            System.out.println("Salário Bruto: R$ " + salario);
            System.out.println("Salário Líquido: R$ " + calcularSalario());
        }


}
