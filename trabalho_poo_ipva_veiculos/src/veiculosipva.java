//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class veiculosipva {
    /* Primeira Questão:

     *  Uma agência de veículos comercializa carros, motos e embarcações
     *  de pequeno porte. Sabendo que a alíquota de IPVA de carros corresponde
     *  a 4%, de motos 6% e de jetsky 0,5%.
     *
     *  Desenvolva uma aplicação onde irá aparecer a porcentagem de acordo
     *  com o veículo, informando o nome do veículo e o ano.
     *
     *  Para isso você deverá utilizar uma classe principal denominada
     *  "veiculosipva" e uma classe "veículos" que irá ser herdada nas
     *  classes carros, motos e jet.
     */

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Transportes Disponíveis:");
        System.out.println();


        // Veículo - Carro
        carro carro_1 = new carro("Honda", 2006, 4f);
        System.out.println("Carro: " + carro_1.nome + " - Ano: " + carro_1.ano + " - IPVA: " + carro_1.ipvaca + "%");



        // Veículo - Moto
        moto moto_1 = new moto("Yamaha", 2011, 6f);
        System.out.println("Moto: " + moto_1.nome + " - Ano: " + moto_1.ano + " - IPVA: " + moto_1.ipvamo + "%");



        // Veículo - Jetsky
        jetsky jet_1 = new jetsky("Kawasaki", 2010, 0.5f);
        System.out.println("Jetsky: " + jet_1.nome + " - Ano: " + jet_1.ano + " - IPVA: " + jet_1.ipvaje + "%");



    }

}