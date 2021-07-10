public class servicios {
    int consumo;
    int unidades;
    int estrato;

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double facturacion(int consumo, int unidades){
        int factura = consumo * unidades;
        System.out.println("Total unidades de consumo en el mes: " + unidades);
        System.out.println("El valor de la factura antes del impuesto del 1% es de $" + factura);
        double impuesto = factura * 0.01;
        System.out.println("El valor del impuesto se de $" + impuesto);
        System.out.println("El valor de la factura despues del impuesto del 1% es de $" + (factura+impuesto));
        return factura+impuesto;
    }
    public void descuentoEstrato(int estrato, double total) {
        if (estrato == 1 || estrato == 2) {
            double descuento = total * 0.50;
            System.out.println("Su descuento es de: $" + descuento);
            System.out.println("Total a pagar: $" + (total-descuento));
        } else if (estrato == 3 || estrato == 4) {
            double descuento = total * 0.10;
            System.out.println("Su descuento es de: $" + descuento);
            System.out.println("Total a pagar: $" + (total-descuento));
        } else if (estrato == 5 || estrato == 6) {
            double descuento = total * 0.25;
            System.out.println("Su sobrecosto es de: $" + descuento);
            System.out.println("Total a pagar: $" + (total+descuento));
        } else {
            System.out.println("Opcion invalida");
        }
    }
}