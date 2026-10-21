
public class Mesa {

    // Atributos
    private int numero;
    private boolean ocupada;

    // Constructor
    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public boolean getOcupada() {
        return ocupada;
    }

    // Setter
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    // Métodos
    public void ocuparMesa() {
        ocupada = true;
    }

    public void liberarMesa() {
        ocupada = false;
    }

    public String toString() {
        String estado = "Libre";

        if (ocupada) {
            estado = "Ocupada";
        }

        return "Mesa " + numero + " - " + estado;
    }
}
