import java.util.Scanner;



public class Principal {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int salir=1;

        /* ************** SE DA EL LIMITE ************** */

        TarjetaCredito pruebaUno=new TarjetaCredito(3250);
        System.out.println("\n ***** COMPRAS EN LINEA ***** \n");
        System.out.println("El limite actual de tu tarjeta es de: " + pruebaUno.getLimite());

        /* ************** SE HACE EL BUCLE PARA SALIR O CONTINUAR ************** */

        while(salir!=0){ //Mientras SALIR sea DIFERENTE de 0
            System.out.println("\nEscribe el articulo que deseas agregar al carrito: ");
            String artic= teclado.next();

            System.out.println("Escribe el valor del Producto: ");
            double articValor= Double.valueOf(teclado.nextDouble());

//          Compra compra=new Compra(700, "Calzones"); AQUI ME HABIA EQUIVOCADO.
            Compra compra=new Compra(articValor,artic);
            boolean realizaCompra=pruebaUno.condicionCompra(compra);

            /* ************** SE LLAMA A LA CONDICION DE COMPRA  ************** */

            if (realizaCompra){
                System.out.println("Compra realizada!");
                System.out.println("Para SALIR presiona 0 | Para continuar comprando, presiona 1");
                salir=teclado.nextInt();}
            else {
                System.out.println("Saldo Insuficiente!");
                salir=0;
            }
            System.out.println("\n ****************** \n");
            System.out.println("COMPRAS REALIZADAS: \n");
            for(Compra compras : pruebaUno.getCarrito()){ //usando LAMBDA y llamando al Carrito de TarjetaCredito.
                System.out.println(compras.getProductoDes() + " : " + compras.getPrecio());//Llamando a descripcion del producto
            }

            System.out.println("\n ************************** ");
            System.out.println("\n Saldo restante: " + pruebaUno.getSaldo());
        }

    }

}