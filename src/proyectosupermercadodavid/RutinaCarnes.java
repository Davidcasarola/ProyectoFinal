
package proyectosupermercadodavid;
import javax.swing.JOptionPane;
public class RutinaCarnes {
    
    private InventarioCarnes invCar[]=new InventarioCarnes[3];
    
    public void llenarVector(){
    
    int x;
        for (x = 0; x < invCar.length; x++) {
            InventarioCarnes i02=new InventarioCarnes();
                i02.setTipoCarne(JOptionPane.showInputDialog(null, 
                        "Ingrese el tipo de carne disponible: "));
                i02.setCorteCarne(JOptionPane.showInputDialog(null, 
                        "Ingrese el corte de carne disponible: "));
                i02.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese la cantidad disponible del produto: ")));
                i02.setPrecioKilo(Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Ingrese el precio por kilo: ")));
                invCar[x]=i02;
            
        }
}
    public void mostrarVector(){
    int x; 
    String s="";
         for (x = 0; x < invCar.length; x++) {
            
                s = s +"Corte de carne: "+ invCar[x].getCorteCarne()+"\n"+
                        "Tipo de carne: " + invCar[x].getTipoCarne()+"\n"+
                        "Cantidad disponible: "+invCar[x].getCantidad()+"\n"+
                        "Precio por kilo: "+invCar[x].getPrecioKilo()+"\n";        
        }
        JOptionPane.showMessageDialog(null, "El inventario de carnes contiene: \n"+s);
    }
}
