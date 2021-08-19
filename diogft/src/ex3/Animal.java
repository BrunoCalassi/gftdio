package ex3;

public class Animal {
    String nome;
    int peso;

    public Animal(String nome,int peso) {
        this.nome = nome;
        this.peso = peso;
    }


    public void som(){
        System.out.println("som");
    }
    public void quantidadeDeRacao(){
        System.out.println("qtd");
    }

}
