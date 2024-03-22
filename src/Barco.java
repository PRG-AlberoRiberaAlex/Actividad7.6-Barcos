
public class Barco {
    protected String nombre;
    protected String matricula;
    protected Data añoDeConstruccion;
    protected Data fechaAdquisicion;
    protected int horasDeMantenimiento;

    public Barco(String nombre, String matricula, Data anoDeConstruccion) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.añoDeConstruccion = anoDeConstruccion;
        this.fechaAdquisicion = new Data(); // Establece la fecha actual como fecha de adquisición
        this.horasDeMantenimiento = 0; // Inicializa las horas de mantenimiento a 0
    }

    public void realizarMantenimiento() {
        this.horasDeMantenimiento += 100;
    }

    @Override
    public String toString() {
        return "Tipo de barco: Nombre: " + nombre + ",Matricula: " + matricula + ",Año de construcción: " + añoDeConstruccion.getAny() + ",Horas de mantenimiento: " + horasDeMantenimiento;
    }
}