package modelos;

import java.util.Map;

public record TasaCambio(
        String result,
        String base_code,
        Map<String, Double> conversion_rates
) {}