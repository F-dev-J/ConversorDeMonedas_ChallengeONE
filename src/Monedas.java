import java.util.Map;

public record Monedas(String result , String base_code, Map<String, Double> conversion_rates) {
}
