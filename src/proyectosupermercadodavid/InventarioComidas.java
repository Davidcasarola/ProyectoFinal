
package proyectosupermercadodavid;

public class InventarioComidas {
    private String tipoComida, nombreComida;
    private int cantidad, precio;

   
    public InventarioComidas() {
        this.tipoComida = "";
        this.nombreComida = "";
        this.cantidad = 0;
        this.precio = 0;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
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
