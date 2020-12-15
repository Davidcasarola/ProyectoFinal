package proyectosupermercadodavid;

import javax.swing.JOptionPane;

public class RutinaComidas {

    private InventarioComidas invComi[]=new InventarioComidas[2];;

    public void llenarVector() {
       
        int x;
        for (x = 0; x < invComi.length; x++) {
           InventarioComidas i03 = new InventarioComidas();

                i03.setNombreComida(JOptionPane.showInputDialog(null,
                        "Ingrese el nombre de la comida: "));
                i03.setTipoComida(JOptionPane.showInputDialog(null,
                        "Ingrese el tipo de comida: "));
                i03.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese la cantidad de comida disponible: ")));
                i03.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese el precio de la comida: ")));
                invComi[x]=i03;
                
            
        }
    }
    public void mostrarVector(){
    int x; 
    String s="";
         for (x = 0; x < invComi.length; x++) {
            
                
                s = s + "Nombre de la comida: "+invComi[x].getNombreComida()+"\n" +
                        "Tipo de comida: "+invComi[x].getTipoComida()
                        +"\n"+"Cantidad: " +invComi[x].getCantidad()
                        +"\n" + "Precio del producto: " +invComi[x].getPrecio()+"\n";
                
            
     
        }
        JOptionPane.showMessageDialog(null, "El inventario de comidas contiene: \n"+s);
    
    
    }
}
