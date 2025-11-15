# 🎧 Spotify Web Automation – POM + Serenity BDD + Cucumber

Automatización end-to-end de Spotify Web en Java utilizando el patrón **Page Object Model (POM)**, **Serenity BDD**, **Cucumber**, y **Selenium WebDriver**.

Este proyecto automatiza funcionalidades clave:
- Login en Spotify
- Búsqueda de canciones y artistas
- Navegación de playlists populares
- Reproducción de canciones

---

# 📌 1. Tecnologías y dependencias principales

| Tecnología | Versión                                    |
|-----------|--------------------------------------------|
| **Java** | 17                                         |
| **Gradle** | Wrapper 7.x+                               |
| **Serenity BDD** | 4.3.2                                      |
| **Cucumber JVM** | 7.18.1                                     |
| **Selenium WebDriver** | Incluido en Serenity                       |
| **WebDriverManager** | 6.3.3 (manejo automático del ChromeDriver) |

---
## 📌 2. Requisitos de instalación

Antes de ejecutar las pruebas necesitas:

🔧 Java 17

Verifica la versión instalada:

java -version

🔧 Gradle Wrapper

No necesitas instalar Gradle manualmente.
Usa el wrapper incluido en el repositorio:

./gradlew --version       # Linux/Mac
gradlew --version         # Windows

🔧 Google Chrome

Debes tener Chrome instalado.
El proyecto usa WebDriverManager para descargar automáticamente el driver compatible.

## 📌  3. Configuración de Variables de Entorno

El proyecto requiere credenciales reales de Spotify.

Windows (CMD)
setx SPOTIFY_EMAIL "tu_correo"
setx SPOTIFY_PASSWORD "tu_password"

Linux / Mac
export SPOTIFY_EMAIL="tu_correo"
export SPOTIFY_PASSWORD="tu_password"


Verificación:

echo %SPOTIFY_EMAIL%   # Windows
echo $SPOTIFY_EMAIL    # Mac/Linux

## 📌 4. Estructura del proyecto (Page Object Model)
src
├── main/java
│   └── co.com.castor.spotify
│       ├── pages/          → Page Objects (elementos y acciones)
│       ├── interactions/   → Interacciones customizadas
│       ├── utils/          → Lectura de variables, datos, helpers
│       └── constants/      → Constantes globales (opcional)
│
├── test/java
│   └── co.com.castor.spotify
│       ├── definitions/    → Step Definitions de Cucumber
│       ├── steps/          → Lógica de negocio
│       ├── hooks/          → Inicialización y teardown
│       └── runners/        → Runner de Cucumber + Serenity
│
└── test/resources
├── features/           → Escenarios Gherkin (.feature)
└── serenity.conf       → Configuración del WebDriver

## 📌 5. Instrucciones de ejecución
▶ Ejecutar todas las pruebas
./gradlew clean test

▶ Ejecutar pruebas filtradas por tag
./gradlew clean test -Dcucumber.filter.tags="@login"

▶ Ejecutar por Runner específico
./gradlew clean test --tests *Runner

## 6. Generación del reporte de Serenity

Después de ejecutar las pruebas, Serenity genera un reporte HTML en:

target/site/serenity/index.html

Abrir el reporte:

Windows

start target/site/serenity/index.html


Mac

open target/site/serenity/index.html


Linux

xdg-open target/site/serenity/index.html

## 📌  7. Cómo interpretar el reporte de Serenity

El dashboard de Serenity incluye:

✔ Resumen general

Total de pruebas

Pasadas / Falladas / Ignoradas

Tiempo total de ejecución

✔ Gráficas de rendimiento

Tendencia de éxito

Duration per test

✔ Ejecución paso a paso

Serenity muestra cada paso:

Given / When / Then ejecutado

Capturas de pantalla automáticas

Explicación del error en caso de falla

Elementos encontrados

Valores ingresados

✔ Reporte de pruebas por funcionalidad

Agrupadas por:

Feature

Escenario

Requerimiento

Ejemplo de sección del reporte:

Scenario: Search for an artist
Given the user is logged in
When the user searches "Coldplay"
Then results containing "Coldplay" should appear


Con evidencia visual:

Capturas de cada interacción

Highlight de elementos

Tiempos exactos