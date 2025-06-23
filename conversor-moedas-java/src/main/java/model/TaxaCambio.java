package model;

/**
 * Representa a taxa de câmbio entre duas moedas.
 */
public class TaxaCambio {
    private String moedaOrigem;
    private String moedaDestino;
    private double valor;

    public TaxaCambio(String moedaOrigem, String moedaDestino, double valor) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valor = valor;
    }

    public String getMoedaOrigem() { return moedaOrigem; }
    public String getMoedaDestino() { return moedaDestino; }
    public double getValor() { return valor; }
}