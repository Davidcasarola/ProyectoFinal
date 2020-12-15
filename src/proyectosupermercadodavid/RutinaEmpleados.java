
package proyectosupermercadodavid;

import javax.swing.JOptionPane;

public class RutinaEmpleados {
    
    private Empleados Emp[]=new Empleados[2];
    
    public void llenarVector(){
        
        int x,y;
        for (x = 0; x < Emp.length; x++) {
            
                Empleados e01=new Empleados();
                e01.setNombreCompleto(JOptionPane.showInputDialog(null, 
                        "Ingrese el nombre completo del empleado: "));
                e01.setIdentifacion(JOptionPane.showInputDialog(null, 
                        "Ingrese el numero de identificacion del empleado: "));
                e01.setDireccion(JOptionPane.showInputDialog(null, 
                        "Ingrese direccion de residencia: "));
                e01.setGafete(JOptionPane.showInputDialog(null, 
                        "Ingrese el numero de gafete del empleado: "));
            Emp[x]=e01;
        }
}
    public void mostrarVector(){
    
    String s="";
    int x;
         for (x = 0; x < Emp.length; x++) {
            
                
                s = s+ "Nombre completo del empleado: "+Emp[x].getNombreCompleto()+"\n"
                        +"Numero identificacion del empleado: "+Emp[x].getIdentifacion()+"\n"
                        +"Direccion del empleado: "+Emp[x].getDireccion()+"\n"+
                        "Gafete del empleado: "+Emp[x].getGafete()+"\n";
                
           
           
        }
        JOptionPane.showMessageDialog(null, "Los empleados contratados son: \n"+s);
    
    }
}
