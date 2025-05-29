# Home Automation System — Refactored Design

## ✅ Objetivo

Mejorar la estructura del código de un sistema de automatización del hogar mediante el uso de patrones de diseño adecuados, con el fin de garantizar mantenibilidad, escalabilidad y claridad en la interacción entre componentes.

---

## 🧠 Cambios Realizados

### 1. Singleton Mejorado (AutomationController)
- **Qué se hizo:** Se agregó `synchronized` al método `getInstance()`.
- **Por qué:** Para asegurar que la clase `AutomationController` siga siendo Singleton incluso en entornos multihilo, garantizando una única instancia segura.

---

### 2. Builder (LightSource)
- **Qué se hizo:** Se mantuvo e integró adecuadamente el patrón Builder con valores por defecto (`level = 0`, `status = OFF`).
- **Por qué:** Este patrón es ideal para crear objetos complejos como `LightSource` de forma clara y fluida, especialmente con múltiples parámetros opcionales.

---

### 3. Facade (HomeSystemFacade)
- **Qué se hizo:** Se creó una clase nueva que actúa como fachada para ocultar la complejidad de inicializar y configurar el sistema completo.
- **Por qué:** Facilita la interacción del cliente con el sistema, mejorando la usabilidad y desacoplando la lógica de configuración.

---

## 📈 Beneficios

- ✔ Mayor cohesión y menor acoplamiento.
- ✔ Código más intuitivo y organizado.
- ✔ Fácil de extender para agregar nuevos dispositivos (ej. termostatos, cámaras, etc.).
- ✔ Claridad en la lógica gracias al patrón Facade.
- ✔ Seguridad y robustez mejoradas con el Singleton thread-safe.

---

## 🏁 Próximos Pasos

- Integrar más dispositivos al sistema usando el mismo patrón `Builder`.
- Ampliar el `Facade` con nuevos métodos para controlar múltiples dispositivos.
- Implementar patrones adicionales como Observer si se requiere respuesta en tiempo real.
- Dividir cada clase en su propio archivo para sistemas más robustos.

---

## Autores
- Iker Rolando Casillas Parra  | A01641047 
- César Simental Dueñas | A01641385
- Andrea Guadalupe Blanco Rubio | A01737220
- Fernanda Reyes Martínez | A01637163
- Alexei Delgado De Gante  A01637405
- Martín Rivera Ahumada | A01749620
