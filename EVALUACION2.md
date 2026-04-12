# EVALUACION 2 - -Software-Construction-2---Banking-System

## Informacion general
- Estudiante(s): Alejandro Espinosa Arboleda, Brayan Alejandro Gonzalez Perez, Emmanuel Calderon Payares
- Rama evaluada: main
- Commit evaluado: 435cdc26 (commit mas reciente del estudiante considerando todas las ramas)
- Fecha: 2026-04-11

---

## Tabla de calificacion

| Criterio | Peso | Puntaje (1-5) | Parcial |
|---|---|---|---|
| 1. Modelado de dominio | 20% | 3 | 0.60 |
| 2. Modelado de puertos | 20% | 1 | 0.20 |
| 3. Modelado de servicios de dominio | 20% | 1 | 0.20 |
| 4. Enums y estados | 10% | 2 | 0.20 |
| 5. Reglas de negocio criticas | 10% | 1 | 0.10 |
| 6. Bitacora y trazabilidad | 5% | 1 | 0.05 |
| 7. Estructura interna de dominio | 10% | 2 | 0.20 |
| 8. Calidad tecnica base en domain | 5% | 3 | 0.15 |
| **SUBTOTAL** | 100% | | **1.70** |

### Penalizaciones aplicadas
JPA/framework en dominio (-25%), estados en String (-10%)

---

## Nota final
**1.1 / 5.0**

---

## Evidencia clave
- Modelos con anotaciones JPA (@Entity) directamente en dominio
- Estados criticos como String en Account/Loan/Transfer/User
- Sin puertos ni servicios de dominio con logica real
