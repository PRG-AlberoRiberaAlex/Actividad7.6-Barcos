import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Barco> listaBarcos;

    public Flota() {
        listaBarcos = new ArrayList<>();
    }

    public void añadirBarco(Barco barco) {
        if (!existeBarco(barco)) {
            listaBarcos.add(barco);
        } else {
            System.out.println("El barco ya existe en la flota.");
        }
    }

    private boolean existeBarco(Barco barco) {
        for (Barco b : listaBarcos) {
            if (b.equals(barco)) {
                return true;
            }
        }
        return false;
    }

    private class Barco {
        private String matricula;

        public Barco(String matricula) {
            this.matricula = matricula;
        }

        public String getMatricula() {
            return matricula;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Barco otroBarco = (Barco) obj;
            return this.matricula.equals(otroBarco.matricula);
        }

    }
}