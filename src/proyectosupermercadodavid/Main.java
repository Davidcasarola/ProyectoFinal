package proyectosupermercadodavid;



public class Main {

    public static void main(String[] args) {

        RutinaBebidas r01 = new RutinaBebidas();
        r01.llenarMatriz();
        r01.mostrarMatriz();
        RutinaCarnes r02 = new RutinaCarnes();
        r02.llenarVector();
        r02.mostrarVector();
        RutinaComidas r03 = new RutinaComidas();
        r03.llenarVector();
        r03.mostrarVector();
        RutinaEmpleados r04 = new RutinaEmpleados();
        r04.llenarVector();
        r04.mostrarVector();

    }
}
