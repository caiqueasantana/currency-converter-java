package service;

import data.TaxaCambioAPIClient;
import model.TaxaCambio;

/**
 * Serviço para conversão de moedas.
 */
public class ConversorMoedasService {
    private TaxaCambioAPIClient apiClient = new TaxaCambioAPIClient();

    /**
     * Converte um valor de uma moeda para outra.
     */
    public double converterMoeda(double valor, String moedaOrigem, String moedaDestino) throws Exception {
        TaxaCambio taxa = apiClient.obterTaxaCambio(moedaOrigem, moedaDestino);
        return valor * taxa.getValor();
    }
}