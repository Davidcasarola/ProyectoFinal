
package proyectosupermercadodavid;

public class SistemaCajas {
    private String nombreSupermercado = "DavidMart", nombreProducto, fecha;
    private int cantProducto, precioUnitario, totalPagar;

    public SistemaCajas() {
        this.nombreProducto = "";
        this.fecha = "";
        this.cantProducto = 0;
        this.precioUnitario = 0;
        this.totalPagar = 0;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public void setCantProducto(int cantProducto) {
        this.cantProducto = cantProducto;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }
    
}
