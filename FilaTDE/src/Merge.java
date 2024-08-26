public class Merge {
    public static void main(String[] args) {
        Fila filaA = new Fila(4);
        Fila filaB = new Fila(4);
        Fila filaC = new Fila(filaA.getDados().length + filaB.getDados().length);
        filaA.insere(12);
        filaA.insere(35);
        filaA.insere(52);
        filaA.insere(55);

        filaB.insere(5);
        filaB.insere(15);
        filaB.insere(23);
        filaB.insere(64);




        filaA.imprime();
        filaB.imprime();

        int contadorA = 0;
        int contadorB = 0;
        int contadorC = 0;



            while (contadorA <= filaA.getDados().length && contadorB <= filaB.getDados().length) {
                if(filaA.vazia())
                {
                    filaC.getDados()[contadorC] = filaB.getDados()[contadorB];
                    filaB.remove();
                } else if (filaB.vazia()) {
                    filaC.getDados()[contadorC] = filaA.getDados()[contadorA];
                    filaA.remove();
                }
                if(filaA.vazia() && filaB.vazia())
                {
                    break;
                }
                if (filaA.getDados()[contadorA] <= filaB.getDados()[contadorB]) {
                    filaC.getDados()[contadorC] = filaA.getDados()[contadorA];
                    contadorA++;
                    filaA.remove();
                    contadorC++;
                } else if (filaA.getDados()[contadorA] >= filaB.getDados()[contadorB]) {
                    filaC.getDados()[contadorC] = filaB.getDados()[contadorB];
                    contadorB++;
                    filaB.remove();
                    contadorC++;

                }
            }




        System.out.println("Fila com merge: ");
        for (int i = 0; i < filaC.getDados().length; i++) {
            System.out.print("["+filaC.getDados()[i]+"]");
        }



    }
}
