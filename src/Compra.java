public class Compra {
 private double precio;
 private String productoDes;

    public Compra(double precio, String productoDes) {
        this.precio = precio;
        this.productoDes = productoDes;
    }
    /* ******************** GETTERS ******************** */

    public double getPrecio() {
        return precio;
    }

    public String getProductoDes() {
        return productoDes;
    }

    /* *********** MEJORANDO el  ToString Producto y Descripcion  ************** */

    @Override
    public String toString() {
        return
        //"Compra{" +
//                "precio=" + precio +
//                ", productoDes='" + productoDes + '\'' +
//                '}';
        "Compra: precio" + precio + ",Descripcion: " + productoDes;


    }
}

/*

1, Se incializa un Constructor, el cual recibira la infomacion del Precio y Descripcion del articulo comprado, por lo que NO es necesario crear SETTERS. Pero si se haran los GETTERS para poder visualizarlos en el Arreglo

2.  Se arreglo el ToString para evitar que salga el HASH al momento de ser llamado por el carrito. */

