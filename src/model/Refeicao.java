package model;

/**
 * Classe que representa uma refeição consumida pelo utilizador.
 */
public class Refeicao {
    private double quantProt;
    private double quantCarb;
    private double quantGordura;
    private String nome;

    // Construtor com validação de dados (Desafio 1)
    public Refeicao (String nome, double quantProt, double quantCarb, double quantGordura) {
        this.nome = nome;

        // Validação da Proteína
        if (quantProt >= 0) {
            this.quantProt = quantProt;
        } else {
            System.out.println("Aviso: Proteína negativa inserida. Ajustado para 0.");
            this.quantProt = 0;
        }

        // Validação do Carboidrato
        if (quantCarb >= 0) {
            this.quantCarb = quantCarb;
        } else {
            System.out.println("Aviso: Carboidrato negativo inserido. Ajustado para 0.");
            this.quantCarb = 0;
        }

        // Validação da Gordura
        if (quantGordura >= 0) {
            this.quantGordura = quantGordura;
        } else {
            System.out.println("Aviso: Gordura negativa inserida. Ajustado para 0.");
            this.quantGordura = 0;
        }
    }

    public double getProt() {
        return this.quantProt;
    }

    // Corrigido para getCarbo() para falar a mesma língua que o Usuario
    public double getCarbo() {
        return this.quantCarb;
    }

    public double getGordura() {
        return this.quantGordura;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCaloriasTotais() {
        return (this.quantProt * 4) + (this.quantCarb * 4) + (this.quantGordura * 9);
    }
}