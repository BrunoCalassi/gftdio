package ex4;

public class Main {
    /*Existem 7 notas musicais: “Dó Ré Mi Fá Sol Lá Si” que se repetem infinitamente.
    Associando essas notas a numerais:
    Dó = 0 | Ré = 1 | Mi = 2 | Fá = 3 | Sol = 4 | Lá = 5 | Si = 6
    Crie um programa que receba um número inicial e um número final, e imprima todas as notas
    desse intervalo, quando chegar a 7, deverá recomeçar a impressão de notas a partir de Dó.
    Exemplos:*/
    public static void main(String[] args) {
            notas n1 = new notas(4,7);
            n1.calculo();
    }
}
