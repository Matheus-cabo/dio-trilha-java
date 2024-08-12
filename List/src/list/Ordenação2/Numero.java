package list.Ordenação2;

public class Numero implements Comparable<Numero> {

    private int numero;

    
    
    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    

    public int compareTo(Numero n) {
        return Integer.compare(numero, n.getNumero());
    }    
    
}

