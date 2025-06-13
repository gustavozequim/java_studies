public class Pessoa{
    public String nome;
    public int idade;
    public double peso;

    public Pessoa(String novoNome, int novaIdade, double novoPeso){
        this.nome = novoNome;
        this.idade = novaIdade;
        this.peso = novoPeso;
    }
    
    public static void main(String[] args) {
        Pessoa objt = new Pessoa("Orlando", 16, 78.5);
        System.out.println("Nome: " + objt.nome + ", Idade: " + objt.idade + " e Peso: " + objt.peso);
    }
}