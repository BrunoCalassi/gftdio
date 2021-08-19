package ex1;

public class idioma {
    String nomeDoIdioma;
    String saud;
    public idioma(String nomeDoIdioma) {
        this.nomeDoIdioma = nomeDoIdioma;
    }

    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    public void setNomeDoIdioma(String nomeDoIdioma) {
        this.nomeDoIdioma = nomeDoIdioma;
    }

    public void lingua (){

    }
    public void saudacao(){
        if(nomeDoIdioma.equals("Português")){
            saud="Ola Mundo";
        }
        if(nomeDoIdioma.equals("Inglês")){
            saud="Hello World";
        }
        if(nomeDoIdioma.equals("Húngaro")){
            saud="Helló Világ";
        }
        if(nomeDoIdioma.equals("Tcheco")){
            saud="Ahoj Svete";

        }
        System.out.println("Idioma falado: " + this.nomeDoIdioma + " Saudação: " + saud);
    }
}
