public class Usuario {
    private double peso;
    private double metaProteina;
    private double proteinaConsumida;

    public Usuario(double peso, double fatorProteina) {
        this.peso = peso;
        metaProteina = peso * fatorProteina;
        proteinaConsumida = 0;
    }
}