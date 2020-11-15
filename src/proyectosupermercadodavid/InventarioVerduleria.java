
package proyectosupermercadodavid;

public class InventarioVerduleria {
    private String tipoVerdura, nombreVerdura;
    private int cantidad, precio, total;

    public InventarioVerduleria() {
        this.tipoVerdura = "";
        this.nombreVerdura = "";
        this.cantidad = 0;
        this.precio = 0;
        this.total = 0;
    }

    public String getTipoVerdura() {
        return tipoVerdura;
    }

    public void setTipoVerdura(String tipoVerdura) {
        this.tipoVerdura = tipoVerdura;
    }

    public String getNombreVerdura() {
        return nombreVerdura;
    }

    public void setNombreVerdura(String nombreVerdura) {
        this.nombreVerdura = nombreVerdura;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
}
