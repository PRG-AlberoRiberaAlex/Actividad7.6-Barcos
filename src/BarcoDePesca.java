
public class BarcoDePesca extends Barco {

    private double capacidadCarga;
   protected Red[] redes;
    private int numRedes;
    private double porcentajeCapturasExitosas;

    public BarcoDePesca(String nombre, String matricula, Data anoDeConstruccion, double capacidadCarga, double porcentajeCapturasExitosas, Red[] redes2) {
        super(nombre, matricula, anoDeConstruccion);
        this.capacidadCarga = capacidadCarga;
        this.redes = redes2;
        this.numRedes = 0;
        this.porcentajeCapturasExitosas = porcentajeCapturasExitosas;
    }
    public void añadirRed(Red red) {
        if (numRedes < redes.length) {
            redes[numRedes] = red;
            numRedes++;
        } else {
            System.out.println("No se puede añadir más redes. Se ha alcanzado el máximo.");
        }
    }

    public void eliminarRed(Red red) {
        for (int i = 0; i < numRedes; i++) {
            if (redes[i].equals(red)) {
                // Mover las redes restantes hacia atrás
                for (int j = i; j < numRedes - 1; j++) {
                    redes[j] = redes[j + 1];
                }
                redes[numRedes - 1] = null; // Eliminar la última referencia redundante
                numRedes--;
                return;
            }
        }
        System.out.println("La red especificada no se encontró.");
    }
    
    @Override
    public void realizarMantenimiento() {
        this.horasDeMantenimiento += 200; // Doble de horas de mantenimiento que un barco estándar
    }

    @Override
    public String toString() {
        StringBuilder redesStr = new StringBuilder();
        for (int i = 0; i < numRedes; i++) {
            redesStr.append(redes[i]);
            if (i < numRedes - 1) {
                redesStr.append(", ");
            }
        }

        return "Tipo de barco: Barco de Pesca\n" +
                super.toString() +
                ",Capacidad de carga: " + capacidadCarga + " metros cúbicos"+ ",Redes de pesca: " + redesStr.toString()+ ",Porcentaje de capturas exitosas: " + porcentajeCapturasExitosas + "%";
    }
    
}
