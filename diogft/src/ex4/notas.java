package ex4;

public class notas {
    int nfinal;
    int inicial;
    int x;
    public notas(int inicial, int nfinal) {
        this.nfinal = nfinal;
        this.inicial = inicial;
    }

    public int getNfinal() {
        return nfinal;
    }

    public void setNfinal(int nfinal) {
        this.nfinal = nfinal;
    }

    public int getInicial() {
        return inicial;
    }

    public void setInicial(int inicial) {
        this.inicial = inicial;
    }

    public void calculo(){
        for(int i=this.inicial; i<=this.nfinal;i++){
                switch (i) {
                    case 0:
                        System.out.println("Dó");;
                        break;
                    case 1:
                        System.out.println("Ré");;
                        break;
                    case 2:
                        System.out.println("Mi");;
                        break;
                    case 3:
                        System.out.println("Fa");;
                        break;
                    case 4:
                        System.out.println("Sol");;
                        break;
                    case 5:
                        System.out.println("Lá");;
                        break;
                    case 6:
                        System.out.println("Si");;
                        break;
                }

            }


        }
    }





