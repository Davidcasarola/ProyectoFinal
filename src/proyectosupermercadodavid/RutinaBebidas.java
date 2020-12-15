package proyectosupermercadodavid;

import javax.swing.JOptionPane;

public class RutinaBebidas {

    private InventarioBebidas Bebidas[][] = new InventarioBebidas[2][2];

    public void llenarMatriz() {

        int x, y;
        for (x = 0; x < Bebidas.length; x++) {
            for (y = 0; y < Bebidas.length; y++) {
                InventarioBebidas i01 = new InventarioBebidas();
                i01.setNombreBebida(JOptionPane.showInputDialog(null,
                        "Ingrese el nombre de la bebida: "));
                i01.setTipoBebida(JOptionPane.showInputDialog(null,
                        "Ingrese el tipo de bebida: "));
                i01.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese la cantidad de bebida disponible: ")));
                i01.setPrecio(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese el precio de la bebida: ")));
                Bebidas[x][y] = i01;
            }
        }
    }

    public void mostrarMatriz() {

        int x, y;
        String s = "";
        InventarioBebidas i01 = new InventarioBebidas();
        for (x = 0; x < Bebidas.length; x++) {
            for (y = 0; y < Bebidas.length; y++) {

                s = s + "Nombre bebida: " + Bebidas[x][y].getNombreBebida() + "\n" + 
                        "Tipo bebida: " + Bebidas[x][y].getTipoBebida() + "\n" + 
                        "Cantidad de bebida disponible: " + Bebidas[x][y].getCantidad() + "\n"
                        + "Precio unitario: " + Bebidas[x][y].getPrecio()+"\n";
            }
            s = s + "\n";
        }
        JOptionPane.showMessageDialog(null, "La matriz contiene: \n" + s);
    }
}
