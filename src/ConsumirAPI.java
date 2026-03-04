import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;

public class ConsumirAPI {
    public Monedas moneda(String tipoDeCambio){
        String key = "83f765305db1d83cf7555ef9";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+key+"/latest/"+tipoDeCambio);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try{
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (IOException | InterruptedException | InputMismatchException e){
            throw new RuntimeException(e);
        }

    }
    public double obtenerTasa(String base, String destino) {
        Monedas datos = moneda(base);
        return datos.conversion_rates().get(destino);
    }

}
