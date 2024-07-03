import java.util.ArrayList;
import java.util.List;

public class TarjetaCredito {

    /* **************** VARIABLES ******************* */

    private double limite = 3250;
    private double saldo;
    private List<Compra> carrito;

    /* **************** INCIALIZANDO VARIABLES ******************* */

    public TarjetaCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.carrito = new ArrayList<>();
    }
    /* **************** GETTERS  ******************* */

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCarrito() {
        return carrito;
    }

    /* **************** LOGICA DE COMPRA Y SALDO ******************* */

    public boolean condicionCompra(Compra compra) {
        if (saldo >= compra.getPrecio()) { //REVISAR
            saldo -= compra.getPrecio();
            this.carrito.add(compra);
            return true;
        } else {
            return false;
        }
    }
}
/*

* A.) Se inicializaron las variables a traves del metodo. Recibira solo la informacion del limite previamente asignado, y el saldo tambien respondera en base al limite. Tambien se inicializo el uso de la lista

B.) Usuario no podra alterar los valores (Saldo y Limite) por lo que solo devolvera informacion, por lo que solo se necesitan GETTER. Recordando que los Setter son para recibir informacion y asi interactuar con informacion dentro del programa.

C. IMPORTANTE recordar que, al tratarse de clases, la PRINCIPAL, tendra acceso a los metodos de estas. Cada funcion tendra su bloque de codigo, por ejemplo, el metodo que condiciona la compra vs el limite(saldo). Por lo que no se hace el codigo sin estructura o de corrido. Siempre en un bloque  para mejor orden.

D

*/