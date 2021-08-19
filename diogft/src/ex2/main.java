package ex2;

import ex1.idioma;

public class main {
    /* – A cada período de tempo de casa na GFT, o funcionário recebe um presente. Crie um
    programa para mostrar qual presente o funcionário vai receber.
• Esse programa deverá receber o ano de entrada deste funcionário e considerar o ano
    atual (2021)
• Os presentes são:
    o 1 ano = Vale Presente
    o 2 anos = Smart Watch
    o 5 anos = Fone Bluetooth
    o 10 anos = Vale Jantar
    o 15 anos = Vale Jantar Top
• Caso o funcionário não esteja dentro de nenhum desses anos, o programa deverá
    imprimir em tela: “Esse ano não vai ter presente”*/
    public static void main(String[] args) {
        presente p1 =new presente(2020);
        presente p2 =new presente(2019);
        presente p3 =new presente(2016);
        presente p4 =new presente(2011);
        presente p5 =new presente(2006);
        presente p6 =new presente(2000);
        p1.presentear();
        p2.presentear();
        p3.presentear();
        p4.presentear();
        p5.presentear();
        p6.presentear();

    }

}
