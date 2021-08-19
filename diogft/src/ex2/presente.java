package ex2;

public class presente {
    int anoentrada;
    int atual=2021;
    String mensagem;

    public presente(int anoentrada) {
        this.anoentrada = anoentrada;
    }

    public void presentear(){
        switch (atual-anoentrada) {
            case 1:  mensagem = "Vale Presente";
                break;
            case 2:  mensagem = "Smart Watch";
                break;
            case 5:  mensagem = "Fone Bluetooth";
                break;
            case 10:  mensagem = "Vale Jantar";
                break;
            case 15:  mensagem = "Vale Jantar Top";
                break;
            default: mensagem = "Esse ano não vai ter presente";
                break;
        }
        System.out.println(mensagem);
    }

}
