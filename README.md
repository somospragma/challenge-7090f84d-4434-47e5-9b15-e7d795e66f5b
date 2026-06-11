# Implementación de un sistema de procesamiento de eventos en tiempo real

El sistema debe manejar eventos provenientes de múltiples fuentes (sensores, aplicaciones externas, usuarios) y procesarlos en tiempo real. El sistema debe ser resiliente, escalable y confiable. Los eventos tienen atributos como identificador, timestamp, tipo de evento y payload. El sistema debe garantizar que cada evento se procese una sola vez (idempotencia) y que los eventos se procesen en el orden en que se reciben. En caso de fallos temporales en las fuentes de eventos, el sistema debe ser capaz de recuperarse y continuar procesando los eventos una vez que la fuente se recupere.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | programación reactiva |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Configuración del sistema de eventos

**Objetivo:** Establecer un sistema capaz de recibir y almacenar eventos de múltiples fuentes.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar las fuentes de eventos y sus características.
- Diseñar un mecanismo para garantizar la idempotencia y el orden de los eventos.
- Implementar la recepción y almacenamiento de eventos.

**Entregable:** Sistema operativo que recibe y almacena eventos de múltiples fuentes con garantías de idempotencia y orden.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores para filtrar y transformar eventos.
- Piensa en cómo manejar la concurrencia y los fallos temporales.

</details>

### Fase 2: Procesamiento de eventos en tiempo real

**Objetivo:** Implementar la lógica para procesar los eventos en tiempo real y tomar decisiones basadas en ellos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseñar la lógica de procesamiento de eventos.
- Implementar la toma de decisiones basada en los eventos recibidos.
- Asegurar que el procesamiento sea escalable y resiliente.

**Entregable:** Sistema que procesa eventos en tiempo real y toma decisiones basadas en ellos, garantizando escalabilidad y resiliencia.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores para combinar y transformar eventos.
- Piensa en cómo manejar la latencia y la consistencia en el procesamiento de eventos.

</details>

### Fase 3: Resiliencia y recuperación ante fallos

**Objetivo:** Implementar mecanismos para garantizar la resiliencia y la recuperación ante fallos en el sistema de procesamiento de eventos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar posibles puntos de fallo en el sistema.
- Diseñar y implementar mecanismos de recuperación ante fallos.
- Asegurar que el sistema pueda recuperarse y continuar procesando eventos una vez que la fuente se recupere.

**Entregable:** Sistema resiliente que puede recuperarse y continuar procesando eventos una vez que la fuente se recupere.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores para manejar la resiliencia y la recuperación ante fallos.
- Piensa en cómo comunicar los fallos y las recuperaciones a los usuarios y otros sistemas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es la programación reactiva y por qué es importante en el procesamiento de eventos en tiempo real?
- **paraQueSirve**: ¿Para qué sirve la programación reactiva en el contexto de un sistema de procesamiento de eventos?
- **comoSeUsa**: ¿Cómo se usan los operadores de Project Reactor para manejar flujos de eventos?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de procesamiento de eventos reactivo?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de un sistema de procesamiento de eventos reactivo resiliente y escalable?

## Criterios de Evaluacion

- Implementación de un sistema que recibe y almacena eventos de múltiples fuentes con garantías de idempotencia y orden.
- Implementación de la lógica para procesar eventos en tiempo real y tomar decisiones basadas en ellos.
- Implementación de mecanismos para garantizar la resiliencia y la recuperación ante fallos en el sistema de procesamiento de eventos.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
