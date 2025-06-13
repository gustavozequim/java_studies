public class Animal extends Pessoa {
    public String raca;
    public String cor;

    public Animal(String novoNome, int novaIdade, double novoPeso, String novaRaca, String novaCor){
        super(novoNome, novaIdade, novoPeso);
        this.raca = novaRaca;
        this.cor = novaCor;
    }

    public static void main(String[] args) {
        Animal objt = new Animal("SPIKE", 6, 22, "BULLDOG", "MARROM");
        System.out.println("Nome: " + objt.nome + ", Idade: " + objt.idade + " e Peso: " + objt.peso);
        System.out.println("Raca: " + objt.raca + " e Cor: " + objt.cor);
    }

}
