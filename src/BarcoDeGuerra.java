
public class BarcoDeGuerra extends Barco {
    private String[] armamento;
    private int numTripulantesMax;
    private int numTripulantesActual;

    public BarcoDeGuerra(String nombre, String matricula, Data anoDeConstruccion, int numTripulantesMax, String[] armamento) {
        super(nombre, matricula, anoDeConstruccion);
        this.numTripulantesMax = numTripulantesMax;
        this.armamento = armamento;
        this.numTripulantesActual = 0;
    }

    public void aumentarTripulantes(int cantidad) {
        this.numTripulantesActual += cantidad;
        if (this.numTripulantesActual > this.numTripulantesMax) {
            this.numTripulantesActual = this.numTripulantesMax;
        }
    }

    public void aumentarMaximoDeTripulantes(int cantidad) {
        this.numTripulantesMax += cantidad;
    }

    public void anyadirArmamento(String arma) {
        String[] nuevoArmamento = new String[this.armamento.length + 1];
        for (int i = 0; i < this.armamento.length; i++) {
            nuevoArmamento[i] = this.armamento[i];
        }
        nuevoArmamento[this.armamento.length] = arma;
        this.armamento = nuevoArmamento;
    }

    @Override
    public void realizarMantenimiento() {
        this.horasDeMantenimiento += 300;
    }

    @Override
    public String toString() {
        StringBuilder armamentoStr = new StringBuilder();
        for (String arma : armamento) {
            armamentoStr.append(arma).append(", ");
        }
        return "Tipo de barco: Barco de Guerra\n" +
                super.toString() + "\n" +
                "Armamento: " + armamentoStr.substring(0, armamentoStr.length() - 2) + "\n" +
                "Número de tripulantes máximo: " + numTripulantesMax + "\n" +
                "Número de tripulantes actual: " + numTripulantesActual;
    }
}
