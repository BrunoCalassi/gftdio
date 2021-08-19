package ex3;

public class Gato extends Animal{
    int qtd;

    public Gato(String nome, int i) {
        super(nome, i);
    }

    public void som(){
        System.out.println(nome + " miau");
    }
    /*o Gatos abaixo ou igual a 4kg consomem 12g por cada kg do seu peso
    o Gatos acima de 4kg consomem 15g por cada kg do seu peso */
    public void quantidadeDeRacao(){
        if(peso<=4){
            qtd = 12*(peso);
        }if(peso>4){
            qtd = 15*(peso);
        }
        System.out.println(qtd);
    }

}
