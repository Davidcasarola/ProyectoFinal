
package proyectosupermercadodavid;

public class Empleados {
    private String nombreCompleto, direccion, identifacion, gafete;

    public Empleados() {
        this.nombreCompleto = "";
        this.direccion = "";
        this.identifacion = "";
        this.gafete = "";
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentifacion() {
        return identifacion;
    }

    public void setIdentifacion(String identifacion) {
        this.identifacion = identifacion;
    }

    public String getGafete() {
        return gafete;
    }

    public void setGafete(String gafete) {
        this.gafete = gafete;
    }
    
}
