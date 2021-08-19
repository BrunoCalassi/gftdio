package ex3;

import ex1.idioma;

public class main {
    /*– Crie uma classe Abstrata chamada Animal com os atributos nome e peso, sendo que no
    construtor você deverá passar o nome e o peso do animal e crie dois métodos abstratos:
    som() e quantidadeDeRacao() . Em seguida, crie duas classes herdando de Animal: Cachorro
    e Gato.
            • O método som() deverá retornar o som que cada animal faz. (“auau” para cachorro e
“miau” para gato)
            • O método quantidadeDeRacao() deverá retornar quanta ração o animal come por
    dia, observando as seguintes regras
    o Gatos abaixo ou igual a 4kg consomem 12g por cada kg do seu peso
    o Gatos acima de 4kg consomem 15g por cada kg do seu peso
    o Cachorros abaixo ou igual a 3kg consomem 35g por cada kg do seu peso
    o Cachorros acima 3kg e abaixo ou igual a 10kg consomem 45g por cada kg do
    seu peso
    o Cachorros acima de 10kg consomem 50g por cada kg do seu peso
• Exemplos:
    o Um gato de 5kg consome: 15 x 5 = 75g de ração por dia
    o Um cachorro de 7kg consome: 45 x 7 = 315g de ração por dia

    Continuação do exercício na próxima página

    Crie uma classe com método Main(), e crie os seguintes: animais:
            • Uma gata de 20kg chamada Coca
• Uma gata de 3kg chamada Foxy
• Um cachorro de 10kg chamado Einstein
• Um gato de 5kg chamado Edward
    Some a quantidade de ração consumida por todos os animais e exiba na tela.*/
    public static void main(String[] args) {
        Gato g1= new Gato("Coca",20);
        Gato g2= new Gato("Foxy",3);
        Cachorro c1= new Cachorro("Einstein",10);
        Cachorro c2= new Cachorro("Edward",20);
        g1.som();
        g1.quantidadeDeRacao();
        g2.som();
        g2.quantidadeDeRacao();
        c1.som();
        c1.quantidadeDeRacao();
        c2.som();
        c2.quantidadeDeRacao();


    }
}
