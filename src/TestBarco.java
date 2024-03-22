public class TestBarco {
        public static Red[] redes = { new Red("Grande", "Poliamida", "Pesca Spinning"),
                        new Red("Mediana", "Poliéster", "Pesca Submarina") };

        public static void main(String[] args) {
                barcos();

        }

        public static void barcos() {
               

        }

        public static void mantenimiento(Barco barco) {
                barco.realizarMantenimiento();
                System.out.println(barco.toString());
                System.out.println();
                System.out.println();
        }

        public static void añadir(Barco barco) {
                if (barco instanceof BarcoDeGuerra) {
                        BarcoDeGuerra barcoDeGuerra = (BarcoDeGuerra) barco;
                        barcoDeGuerra.añadirArmamento("metralleta");
                        barcoDeGuerra.añadirArmamento("metralleta");
                        System.out.println(barcoDeGuerra.toString());
                        System.out.println();
                        System.out.println();
                }
                if (barco instanceof BarcoDePesca) {
                        BarcoDePesca barcoDePesca = (BarcoDePesca) barco;
                        for (Red red : redes) {
                                barcoDePesca.añadirRed(red);
                        }
                        System.out.println(barcoDePesca.toString());
                        System.out.println();
                        System.out.println();
                }
        }

        public static void eliminarPrimeraRed(BarcoDePesca barco) {
                Red[] redes = barco.redes;

                if (redes != null && redes.length > 0) {
                        barco.eliminarRed(redes[0]); // Eliminar la primera red
                        System.out.println("Primera red eliminada del barco de pesca:");
                        System.out.println(barco.toString());
                } else {
                        System.out.println("No hay redes en el barco de pesca para eliminar.");
                }
        }

}
