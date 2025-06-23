package data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import model.TaxaCambio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Cliente para acessar a API de taxas de câmbio.
 */
public class TaxaCambioAPIClient {
    // Sua chave de API
    private static final String API_KEY = "48aab8cc8c6816020b85459b";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    /**
     * Obtém a taxa de câmbio entre duas moedas.
     */
    public TaxaCambio obterTaxaCambio(String moedaOrigem, String moedaDestino) throws Exception {
        try {
            URL url = java.net.URI.create(API_URL + moedaOrigem).toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Erro ao acessar a API: HTTP " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String linha;
            while ((linha = br.readLine()) != null) {
                sb.append(linha);
            }
            br.close();

            JsonObject json = JsonParser.parseString(sb.toString()).getAsJsonObject();
            double taxa = json.getAsJsonObject("conversion_rates").get(moedaDestino).getAsDouble();

            return new TaxaCambio(moedaOrigem, moedaDestino, taxa);
        } catch (Exception e) {
            throw new Exception("Falha ao obter taxa de câmbio: " + e.getMessage());
        }
    }
}