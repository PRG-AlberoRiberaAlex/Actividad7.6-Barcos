public class TestBarco {
    public static void main(String[] args) {
        // Crear un barco estándar
        Barco barco = new Barco("Barco Standard", "123ABC", new Data(1, 1, 2020));
        System.out.println(barco);
        System.out.println();

        // Crear un barco de guerra
        String[] armamento = {"Cañones", "Torpedos"};
        BarcoDeGuerra barcoDeGuerra = new BarcoDeGuerra("Barco de Guerra", "456DEF", new Data(15, 5, 2018), 100, armamento);
        System.out.println(barcoDeGuerra);
        barcoDeGuerra.anyadirArmamento("Misiles");
        barcoDeGuerra.aumentarTripulantes(50);
        System.out.println("Después de agregar armamento y tripulantes:");
        System.out.println(barcoDeGuerra);
        System.out.println();

        // Crear un barco de pesca
        Red[] redes = {new Red("Grande", "Poliamida", "Pesca Spinning"), new Red("Mediana", "Poliéster", "Pesca Submarina")};
        BarcoDePesca barcoDePesca = new BarcoDePesca("Barco de Pesca", "789GHI", new Data(20, 10, 2015), 500, 80.5, redes);
        System.out.println(barcoDePesca);
        barcoDePesca.eliminarRed(redes[0]);
        System.out.println("Después de eliminar una red:");
        System.out.println(barcoDePesca);
        System.out.println();

        // Realizar mantenimiento en todos los barcos
        barco.realizarMantenimiento();
        barcoDeGuerra.realizarMantenimiento();
        barcoDePesca.realizarMantenimiento();
        System.out.println("Después de realizar mantenimiento:");
        System.out.println(barco);
        System.out.println(barcoDeGuerra);
        System.out.println(barcoDePesca);
    }
}
