package proyectosupermercadodavid;

public class InventarioBebidas {

    private String tipoBebida, nombreBebida;
    private int cantidad, precio;

    public InventarioBebidas() {
        this.tipoBebida = "";
        this.nombreBebida = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    public String getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public String getNombreBebida() {
        return nombreBebida;
    }

    public void setNombreBebida(String nombreBebida) {
        this.nombreBebida = nombreBebida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
