package ex3;

public class Cachorro extends Animal {
    int qtd;

    public Cachorro(String nome, int i) {
        super(nome, i);
    }

    public void som(){
        System.out.println(nome + " auau");
    }
   /* Cachorros abaixo ou igual a 3kg consomem 35g por cada kg do seu peso
    o Cachorros acima 3kg e abaixo ou igual a 10kg consomem 45g por cada kg do
    seu peso
    o Cachorros acima de 10kg consomem 50g por cada kg do seu peso*/
   public void quantidadeDeRacao(){
       if(peso<=3){
           qtd = 35*(peso);
       }if(peso>3 || peso<=10){
           qtd = 45*(peso);
       }if(peso>10){
        qtd = 50*(peso);
    }
       System.out.println(qtd);
   }
}
