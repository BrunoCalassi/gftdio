package ex1;

public class Main {
    /*– Utilizando conceitos de herança, crie uma classe abstrata chamada Idioma com um
    atributo chamado nomeDoIdioma e um método abstrato chamado saudacao() que imprime
    o nome do idioma e uma saudação na tela, em seguida, crie as classes que herdam Idioma
    e suas respectivas saudações:*/
    public static void main(String[] args) {
        idioma i1 =new idioma("Português");
        idioma i2 =new idioma("Inglês");
        idioma i3 =new idioma("Húngaro");
        idioma i4 =new idioma("Tcheco");
        i1.saudacao();
        i2.saudacao();
        i3.saudacao();
        i4.saudacao();
    }

}
