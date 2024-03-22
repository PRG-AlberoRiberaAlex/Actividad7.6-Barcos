public class TestBarco {
        public static Red[] redes = { new Red("Grande", "Poliamida", "Pesca Spinning"),
                        new Red("Mediana", "Poliéster", "Pesca Submarina") };

        public static void main(String[] args) {
                barcos();

        }

        public static void barcos() {
                // Crear un barco estándar
                Barco barco = new Barco("BARCO", "123ABC", new Data(1, 1, 2020));
                System.out.println(barco.toString());
                System.out.println();
                System.out.println();

                // Crear un barco de guerra
                String[] armamento = { "Cañones", "Torpedos" };
                BarcoDeGuerra barcoDeGuerra = new BarcoDeGuerra("Barco de Guerra", "456DEF", new Data(15, 5, 2018), 100,
                                armamento);
                System.out.println(barcoDeGuerra.toString());
                barcoDeGuerra.añadirArmamento("Misiles");
                barcoDeGuerra.aumentarTripulantes(50);
                System.out.println();
                System.out.println();
                System.out.println("Después de agregar armamento y tripulantes:");
                System.out.println(barcoDeGuerra.toString());
                System.out.println();
                System.out.println();

                // Crear un barco de pesca

                BarcoDePesca barcoDePesca = new BarcoDePesca("Barco de Pesca", "789GHI", new Data(20, 10, 2015), 500,
                                80.5, redes);
                System.out.println(barcoDePesca.toString());
                System.out.println();
                System.out.println();
                System.out.println("Incrementa las horas de mantenimiento de los 3 barcos y del pesquero una vez más");
                mantenimiento(barco);
                mantenimiento(barcoDeGuerra);
                mantenimiento(barcoDePesca);
                System.out.println(
                                "Añade 2 redes diferentes al barco pesquero y un armamento compuesto por 2 armas iguales al barco de guerra, pero diferente a la que ya tiene registrada");
                añadir(barcoDeGuerra);
                añadir(barcoDePesca);
                System.out.println("Barco de pesca después de eliminar su primera red");
                eliminarPrimeraRed(barcoDePesca);
                System.out.println(barcoDePesca.toString());
                System.out.println(
                                "Prueba también que la gestión del número de tripulantes de los barcos de guerra funciona, siguiendo la misma metodología");
                System.out.println("Barco de guerra después de añadir tripulantes");
                barcoDeGuerra.aumentarTripulantes(50);
                System.out.println(barcoDeGuerra.toString());
                System.out.println();
                System.out.println();
                System.out.println("Barco de guerra después de aumentar el maximo tripulantes");
                barcoDeGuerra.aumentarMaximoDeTripulantes(100);
                System.out.println(barcoDeGuerra.toString());
                System.out.println();
                System.out.println();

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
