package proyectosupermercadodavid;

public class InventarioCarnes {

    private String corteCarne, tipoCarne;
    private int precioKilo, cantidad;
    

    public InventarioCarnes() {
        this.corteCarne = "";
        this.tipoCarne = "";
        this.precioKilo = 0;
        this.cantidad = 0;

    }

    public String getCorteCarne() {
        return corteCarne;
    }

    public void setCorteCarne(String corteCarne) {
        this.corteCarne = corteCarne;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public int getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(int precioKilo) {
        this.precioKilo = precioKilo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
