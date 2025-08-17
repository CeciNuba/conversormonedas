package calculos;

import modelos.TasaCambio;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;

public class Conversor {

    private static final String API_KEY = "5ac015076b33c5607ebc670f";

    public void exibirMenu() {
        System.out.println("""
        ******************************************************
        Sea bienvenido/a al Conversor de Moneda =]

        1) Dólar =>> Peso argentino
        2) Peso argentino =>> Dólar
        3) Dólar =>> Real brasileño
        4) Real brasileño =>> Dólar
        5) Dólar =>> Peso colombiano
        6) Peso colombiano =>> Dólar
        7) Salir
        Elija una opción válida:
        ******************************************************
        """);
    }

    public void convertir(String origen, String destino) {
        try {
            TasaCambio tasaCambio = obtenerTasas(origen);
            double tasa = tasaCambio.conversion_rates().get(destino);

            Scanner scanner = new Scanner(System.in);
            double valor = 0;

            while (true) {
                try {
                    System.out.println("Ingrese el valor que desea convertir en " + origen + ":");
                    valor = Double.parseDouble(scanner.nextLine());
                    if (valor < 0) {
                        System.out.println("Ingrese un valor positivo.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Debe ingresar un número.");
                }
            }

            double resultado = valor * tasa;
            System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]%n", valor, origen, resultado, destino);

        } catch (Exception e) {
            System.out.println("Error al obtener la tasa: " + e.getMessage());
        }
    }

    private TasaCambio obtenerTasas(String base) throws Exception {
        String urlStr = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/" + base;
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder contenido = new StringBuilder();
        String linea;
        while ((linea = in.readLine()) != null) {
            contenido.append(linea);
        }
        in.close();

        Gson gson = new Gson();
        return gson.fromJson(contenido.toString(), TasaCambio.class);
    }
}