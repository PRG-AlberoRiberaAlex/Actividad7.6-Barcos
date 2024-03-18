public class Red {
    private String tamano;
    private String material;
    private String tipoPesca;

    public Red(String tamano, String material, String tipoPesca) {
        this.tamano = tamano;
        this.material = material;
        this.tipoPesca = tipoPesca;
    }

    @Override
    public String toString() {
        return "Red de pesca: {" +
                "tamaño='" + tamano + '\'' +
                ", material='" + material + '\'' +
                ", tipo de pesca='" + tipoPesca + '\'' +
                '}';
    }
}
