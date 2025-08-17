# Conversor de Monedas Avanzado 💱

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge)
![Estado](https://img.shields.io/badge/Estado-Completado-brightgreen?style=for-the-badge)
![Gson](https://img.shields.io/badge/Gson-2.10.1-orange?style=for-the-badge)
![Licencia](https://img.shields.io/badge/Licencia-MIT-lightgrey?style=for-the-badge)

---

## 📌 Descripción del Proyecto

El **Conversor de Monedas Avanzado** es una aplicación de consola en **Java** que permite convertir divisas en tiempo real entre:

- **Dólar (USD)**
- **Peso Argentino (ARS)**
- **Real Brasileño (BRL)**
- **Peso Colombiano (COP)**

Se integra con la **API de ExchangeRate** para obtener tasas actualizadas y utiliza **Gson** para parsear JSON. La arquitectura sigue **principios de POO**, con separación clara entre **modelo**, **lógica de negocio** e **interfaz de usuario**.

---

## ✨ Características Principales

- Conversión en tiempo real entre USD, ARS, BRL y COP
- Validación de entrada: solo números positivos
- Uso de API externa confiable para tasas actualizadas
- Interfaz de consola amigable e intuitiva
- Arquitectura modular y escalable

---

## 📂 Estructura del Proyecto

conversor-monedas/
├── src/
│   ├── principal/
│   │   └── Principal.java       # Clase principal con menú y flujo de interacción
│   ├── calculos/
│   │   └── Conversor.java       # Lógica de conversión y obtención de tasas
│   └── modelos/
│       └── TasaCambio.java      # Record para mapear la respuesta JSON de la API
├── README.md                    # Este documento
└── pom.xml / build.gradle        # Configuración del proyecto (si aplica)


---

## 🛠️ Tecnologías y Librerías

- **Java 17+**
- **Gson 2.10.1** para deserialización de JSON
- **API ExchangeRate** (`https://v6.exchangerate-api.com`)
- Consola de Java para interacción con el usuario

---

## 🚀 Instalación

1. Clonar el repositorio:

```bash
git clone https://github.com/usuario/conversor-monedas.git

    Abrir el proyecto en IntelliJ IDEA o tu IDE favorito

    Asegurarse de tener Java 17+ y la dependencia de Gson:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

    Ejecutar la clase principal Principal.java

    Seguir el menú interactivo en consola para realizar conversiones

💻 Uso

Ejemplo de ejecución:

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

Después de seleccionar una opción, se ingresa el monto a convertir:

Ingrese el valor que desea convertir en USD:
100
El valor 100.00 [USD] corresponde al valor final de =>>> 5,200.00 [ARS]

📊 Diagramas UML y de Flujo

Diagrama de clases (ejemplo como imagen, reemplaza con tu propia imagen si quieres):

Diagrama de flujo de ejecución:

Diagrama de clases conceptual en texto:

+------------------+          +------------------+
|    Principal     |          |     Conversor    |
+------------------+          +------------------+
| - main(String[]) |  ----->  | - convertir()    |
|                  |          | - exibirMenu()   |
+------------------+          | - obtenerTasas() |
                              +------------------+
                                     |
                                     v
                              +------------------+
                              |   TasaCambio     |
                              +------------------+
                              | - result         |
                              | - base_code      |
                              | - conversion_rates|
                              +------------------+

✅ Buenas Prácticas Implementadas

    Separación de capas: UI, lógica de negocio, modelos

    Manejo de excepciones en entradas y API

    Uso de record para estructuras inmutables (TasaCambio)

    Código modular, legible y escalable

    Validación de datos y manejo de errores amigable

🌱 Futuras Mejoras

    Añadir soporte para más divisas

    Interfaz gráfica con JavaFX o Swing

    Cache de tasas de cambio para reducir llamadas a la API

    Historial de conversiones y gráficos de evolución

🤝 Contribución

Si deseas contribuir al proyecto:

    Haz un fork del repositorio

    Crea tu branch: git checkout -b feature/nueva-funcionalidad

    Haz commit de tus cambios: git commit -m 'Agrega nueva funcionalidad'

    Envía los cambios: git push origin feature/nueva-funcionalidad

    Abre un Pull Request

📜 Licencia

Este proyecto está bajo la licencia MIT – consulta el archivo LICENSE para más detalles.
👩‍💻 Autor

Ceci Nuba – Proyecto de clase de Programación en Java - Alura Latam.
