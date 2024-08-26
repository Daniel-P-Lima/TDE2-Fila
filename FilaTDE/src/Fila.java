public class Fila {
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int Listavazia;



    public Fila(int tamanho)
    {
        this.dados = new int[tamanho];
        primeiro = 0;
        ultimo = - 1;
    }

    public boolean vazia()
    {
        return ultimo == -1;

    }

    public boolean cheia()
    {
        if (ultimo == dados.length)
        {
            System.out.println("Fila cheia. ");
        }
        return ultimo == dados.length;
    }

    public void insere(int e)
    {
        if(cheia())
        {
            System.out.println("A fila está cheia. ");
        }
        else
        {
            ultimo++;
            dados[ultimo] = e;
        }
    }

    public void remove()
    {
        if(vazia())
        {
            System.out.println("Não foi possível remover, lista vazia. ");
        }
        else
        {
            dados[primeiro] = 0;
            primeiro++;
            ultimo--;
        }
    }

    public void imprime()
    {
        for (int i = 0; i <= dados.length - 1; i++) {
            System.out.println("Posição [" + i + "] " + "Dado: " + dados[i]);
        }
        System.out.println();
    }

    public int[] getDados() {
        return dados;
    }
}

