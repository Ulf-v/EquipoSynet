# Decisiones Tecnológicas y Debates - EquipoSynet

**Período:** Septiembre 2025 - Marzo 2026  
**Documento:** Consolidación de decisiones técnicas y discusiones

---

## 1. ARQUITECTURA GENERAL

### Decisión: Three-Tier Architecture (Capas)
**Adoptado:** Sí  
**Fecha:** Octubre 2025  
**Debatido:** Oct-02, Oct-16

**Capas implementadas:**
1. **Presentación (Frontend):** HTML5/CSS3/JavaScript vanilla
2. **Lógica de negocio (Backend):** Spring Boot REST API
3. **Persistencia (BD):** MongoDB Server

**Alternativas consideradas:**
- Microservicios: Rechazado por complejidad innecesaria
- Monolítico simple: No considerado
- Arquitectura basada en eventos: Aplazado para v2.0

**Justificación:**
- Claridad y separación de responsabilidades
- Escalabilidad horizontal en el futuro
- Facilidad de testing y deployment

---

## 2. FRONTEND

### Decisión: JavaScript Vanilla vs Frameworks

**Adoptado:** JavaScript vanilla (HTML + CSS + vanilla JS)  
**Fecha:** Noviembre 2025  
**Debatido:** Nov-13

**Opciones evaluadas:**
| Framework | Ventajas | Desventajas | Votación |
|-----------|----------|------------|----------|
| **React** | Componentes, comunidad grande | Curva aprendizaje, overhead | 2 votos |
| **Vue** | Balance, fácil de aprender | Menos documentación | 1 voto |
| **Angular** | Full-featured, enterprise | Muy pesado para proyecto | 0 votos |
| **Vanilla JS** | Simplicidad, control total | Menos mantenible | 5 votos |

**Decisión final:** Vanilla JavaScript con HTML/CSS puro

**Razón:** Acelerar desarrollo inicial, simplicidad, sin dependencias

**Posible migración:** Se menciona posible refactor a React en v2.0 si proyecto crece

### Decisión: CSS Framework

**Adoptado:** Bootstrap 5  
**Fecha:** Enero 2026  
**Debatido:** Enero-08, Feb-05

**Opciones evaluadas:**
| Framework | Tamaño | Curva | Comunidad | Elegida |
|-----------|--------|-------|-----------|---------|
| Bootstrap 5 | ~150KB | Baja | Enorme | Seleccionado |
| Tailwind CSS | ~50KB | Media | Grande | Considerado |
| Foundation | ~220KB | Media | Media | No |
| Semantic UI | ~200KB | Baja | Pequeña | No |

**Decisión final:** Bootstrap 5

**Razón:** 
- Muy fácil de usar sin CSS avanzado
- Excelente documentación
- Componentes predefinidos aceleran desarrollo
- Responsive design listo para usar

### Decisión: Validación en Cliente

**Adoptado:** Validación en frontend + backend  
**Fecha:** Diciembre 2025

**Validaciones implementadas:**
- Frontend: Validaciones HTML5 + JavaScript personalizado
- Backend: Validaciones en servidores antes de guardar en BD
- Campos validados:
  - Email format
  - Requeridos vs opcionales
  - Longitud máxima/mínima
  - Patrones regex

**Razón:** Security en layers - frontend para UX, backend para seguridad

---

## 3. BACKEND

### Decisión: Spring Boot Versión

**Adoptado:** Spring Boot 2.7+ (LTS)  
**Fecha:** Octubre 2025  
**Debatido:** Oct-16

**Opciones evaluadas:**
| Versión | Soporte | Estabilidad | Características | Elegida |
|---------|---------|-------------|-----------------|---------|
| 2.7 LTS | Hasta 2024 | Alta | Completa | Seleccionado |
| 3.x | Hasta 2025 | Media | Java 17+ | No |
| 2.6 | Hasta 2023 | Alta | Estable | Considerado |

**Decisión final:** Spring Boot 2.7+

**Razón:**
- Long Term Support
- Estabilidad probada
- Compatible con Java 11+ que equipo tiene instalado
- Abundante documentación

### Decisión: Autenticación/Autorización

**Adoptado:** Spring Security 5+ + Google OAuth 2.0 + JWT  
**Fecha:** Noviembre 2025  
**Debatido:** Nov-13, Dec-11

**Componentes:**
1. **Spring Security:** Framework de seguridad de Spring
2. **Google OAuth 2.0:** Autenticación por Google
3. **JWT (JSON Web Tokens):** Token de sesión sin servidor

**Alternativas consideradas:**
| Método | Ventajas | Desventajas | Estado |
|--------|----------|------------|--------|
| OAuth 2.0 | Seguro, delegado | Configuración compleja | Parcialmente implementado (95%) |
| JWT stateless | Escalable, móvil-friendly | Sin session control | Implementado |
| Sesiones tradicionales | Simple, conocido | Requiere servidor | No |
| API Keys | Rápido | Inseguro | No |
| Basic Auth | Simple | Inseguro | No |

**Problemas encontrados:**
- Callback URL de Google difficult de configurar → aplazado, en progress
- Token JWT en localStorage vulnerable a XSS → se considera cambiar a httpOnly en v1.1
- Refresh token no completamente implementado → next sprint

**Estado actual:** 95% completado, falta logout limpio

### Decisión: Patrón REST para API

**Adoptado:** RESTful con versionado /api/v1/  
**Fecha:** Diciembre 2025  
**Debatido:** Dec-04

**Convenciones implementadas:**
```
GET    /api/v1/casos           → Listar
POST   /api/v1/casos           → Crear
GET    /api/v1/casos/{id}     → Detalle
PUT    /api/v1/casos/{id}     → Actualizar (completo)
PATCH  /api/v1/casos/{id}     → Actualizar (parcial) [pendiente]
DELETE /api/v1/casos/{id}     → Eliminar
```

**Códigos de estado HTTP:**
- 200 OK: Éxito
- 201 Created: Recurso creado
- 400 Bad Request: Datos inválidos
- 401 Unauthorized: No autenticado
- 403 Forbidden: No autorizado
- 404 Not Found: Recurso no existe
- 500 Internal Server Error: Error servidor

**Alternativas consideradas:**
| Estilo | Ventajas | Desventajas | Elegida |
|--------|----------|------------|---------|
| RESTful | Estándar, escalable | Menos flexible | Seleccionado |
| GraphQL | Flexible, eficiente | Curva aprendizaje | No (v2.0) |
| RPC | Simple | No estándar | No |
| SOAP/XML | Enterprise | Pesado y complejo | No |

### Decisión: Versionado de API

**Adoptado:** Versionado en URL (/api/v1/)  
**Fecha:** Diciembre 2025

**Alternativas consideradas:**
| Método | Ventajas | Desventajas | Elegida |
|--------|----------|------------|---------|
| URL path (/v1/) | Claro, sencillo | Duplica código | Seleccionado |
| Header (Accept) | Limpio | Menos obvio | No |
| Query param (?v=1) | Flexible | Menos claro | No |
| Subdomain (v1.api.com) | Escalable | Complejo setup | No |

### Decisión: Serialización de Datos

**Adoptado:** JSON  
**Fecha:** Octubre 2025

**Alternativas consideradas:**
| Formato | Ventajas | Desventajas | Elegida |
|---------|----------|------------|---------|
| **JSON** | Web-friendly, simple | Menos compacto | Seleccionado |
| XML | Standard, validable | Pesado, verbose | No |
| Protocol Buffers | Compacto, rápido | Complejo, binary | No |
| YAML | Legible | No es web standard | No (docs only) |

**Razón:** JSON es estándar de facto en web APIs modernas

---

## 4. BASE DE DATOS

### Decisión: MongoDB vs SQL

**Adoptado:** MongoDB (NoSQL)  
**Fecha:** Octubre 2025  
**Debatido:** Oct-02, Oct-16

**Comparación:**

| Aspecto | MongoDB | SQL (MySQL/PostgreSQL) |
|--------|---------|----------------------|
| Schema | Flexible (JSON documents) | Rígido (tablas) |
| Escalabilidad | Horizontal (sharding) | Vertical |
| Transacciones | Limitadas (4.0+) | ACID completas |
| Queries | Agregación flexible | SQL standard |
| Aprendizaje | Intermedio | Fácil |
| Elegida | Seleccionado | No |

**Justificación:**
- Flexibilidad para casos clínicos variables
- Documentos anidados para relaciones complejas
- Mejor escalabilidad horizontal
- Más alineado con JSON del frontend

**Ventajas en este proyecto:**
- Casos clínicos con estructura variable
- No requiere relaciones complejas tabla-a-tabla
- Archivos y blobs se manejan fácilmente

**Desventajas mitigadas:**
- Sin transacciones multi-documento: aceptable para esta fase
- Menos structured: compensado con validación en backend

### Decisión: Alojamiento de BD

**Adoptado:** MongoDB Server en servidor remoto compartido  
**Fecha:** Octubre 2025  
**Debatido:** Oct-30

**Alternativas consideradas:**
| Opción | Ventajas | Desventajas | Elegida |
|--------|----------|------------|---------|
| Servidor remoto compartido | 1 instancia, acceso remoto | Dependencia de servidor | Seleccionado |
| MongoDB Atlas | Cloud, enterprise | Costo, privada | No (era opción) |
| Instancia local por dev | Independencia | Datos no sincronizados, complejo | No |
| Docker container | Portable, reproducible | Datos efímeros sin volumen | Futuro |

**Decisión final:** Servidor remoto compartido en instituto

**Configuración:**
- Host: [servidor del instituto]
- Puerto: 27017 (default)
- BD: equiposynet_db
- Usuario: equiposynet_dev
- Autenticación: encriptada

---

## 5. INFRAESTRUCTURA

### Decisión: Containerización

**Adoptado:** Docker + Docker Compose  
**Fecha:** Octubre 2025  
**Debatido:** Oct-16, Oct-30

**Componentes:**
1. **Docker:** Contenedor para aplicación
2. **Docker Compose:** Orquestación local multi-contenedor

**Alternativas consideradas:**
| Herramienta | Ventajas | Desventajas | Elegida |
|-----------|----------|------------|---------|
| **Docker** | Standard, portable | Curva aprendizaje | Seleccionado |
| Kubernetes | Producción-ready | Overkill para proyecto | No |
| Vagrant | Simpler | Menos portable | No |
| Virtual Machines | Full isolation | Pesado, lento | No |

**Configuración docker-compose.yml:**
```yaml
services:
  - mongo:4.4 (volumen persistente)
  - backend (Spring Boot, puerto 8080)
  - frontend (static) [futuro]
networks:
  - app-network
```

**Razón:** Facilita despliegue y reproducibilidad

### Decisión: IDE y Herramientas

**Adoptado:** Visual Studio Code  
**Fecha:** Octubre 2025  
**Debatido:** Oct-16

**Alternativas consideradas:**
| IDE | Java/Spring | Frontend | Peso | Costo | Elegida |
|-----|-----------|----------|------|-------|---------|
| **VS Code** | Bueno (extensiones) | Excelente | Ligero | Gratis | ✓ |
| IntelliJ IDEA | Excelente | Bueno | Pesado | $$$ | No |
| NetBeans | Bueno | Aceptable | Pesado | Fratis | No |
| Eclipse | Muy bueno | Aceptable | Muy pesado | Gratis | No |

**Extensiones instaladas en VS Code:**
- Java Extension Pack
- Spring Boot Extension Pack
- Thunder Client / Postman
- ESLint / Prettier
- MongoDB Compass
- Git Graph
- Live Server

### Decisión: Build Tool

**Adoptado:** Apache Maven  
**Fecha:** Octubre 2025  
**Debatido:** Oct-16

**Alternativas Maven vs Gradle:**
| Aspecto | Maven | Gradle |
|--------|-------|--------|
| Configuración | XML (pom.xml) | Groovy (build.gradle) |
| Velocidad | Más lento | Más rápido |
| Curva aprendizaje | Media | Media-Alta |
| Comunidad | Enorme, legacy | Grande, creciente |
| Plugins | Abundantes | Abundantes |
| Adoptado | ✓ | No |

**Razón:** Maven es estándar en empresas, mejor documentación

---

## 6. COMUNICACIÓN Y VERSIONADO

### Decisión: Control de Versiones

**Adoptado:** Git + GitHub  
**Fecha:** Octubre 2025

**Estructura de ramas:**
```
main (producción)
  ↑
dev (desarrollo)
  ↑
feature/xyz (características)
feature/[nombre] (ramas de feature)
```

**Normas de commits (Enero 2026):**
- Formato: `tipo: descripción breve`
- Tipos: feat, fix, docs, style, refactor, test, chore
- Ejemplo: `feat: agregar validación de email`
- Longitud: máximo 50 caracteres

### Decisión: Comunicación del Equipo

**Adoptado:** WhatsApp + Notion  
**Fecha:** Octubre 2025  
**Debatido:** Oct-02

**Alternativas consideradas:**
| Tool | Ventajas | Desventajas | Elegida |
|------|----------|------------|---------|
| **WhatsApp** | Inmediato, conocido | No persistent | ✓ (rápido) |
| Slack | Profesional, integrable | No gratuito | No |
| Discord | Gratis, bueno para tech | No profesional | No |
| **Notion** | Documentación, flexible | Curva aprendizaje | ✓ (docs) |
| GitHub Discussions | Técnico, bien integrado | No es chat | No |

**Uso actual:**
- WhatsApp: Comunicación urgente, coordinación diaria
- Notion: Documentación persistente, planificación, requisitos
- GitHub: Issues, PRs, cambios de código

---

## 7. TESTING Y QUALITY

### Decisión: Testing API

**Adoptado:** Postman  
**Fecha:** Diciembre 2025  
**Debatido:** Dec-04

**Alternativas consideradas:**
| Tool | Ventajas | Desventajas | Elegida |
|------|----------|------------|---------|
| **Postman** | Interfaz amigable, colaborativo | Propietario | Seleccionado |
| Insomnia | Open source, simple | Menos features | No |
| curl | Command line, rápido | No GUI | No |
| SoapUI | Enterprise | Pesado | No |

**Uso:**
- Validación de endpoints CRUD
- Testing de flujos OAuth
- Documentación de API en Postman

### Decisión: Testing Unitario

**Adoptado:** JUnit 5 + Mockito (aplazado para v1.1)  
**Fecha de adopción:** Post-demo

**Razones para aplazar:**
- MVP necesita estar listo para demo
- JUnit añadiría más tiempo de desarrollo
- Validación manual suficiente por ahora
- Será crítico para producción

---

## 8. CONVENCIONES DE CÓDIGO

### Decisión: Nomenclatura y Format

**Java Backend:**
- PascalCase para clases: `CasoClinico`, `ArchivoController`
- camelCase para variables/métodos: `getDiagnosticoFinal()`, `casoId`
- UPPER_SNAKE_CASE para constantes: `DEFAULT_PAGE_SIZE`
- Packages: `com.synet.demoBack.controller`, `com.synet.demoBack.service`

**JavaScript Frontend:**
- camelCase para variables/funciones: `getCasos()`, `formData`
- PascalCase para clases: `ChatBot` (si se usa)
- kebab-case para archivos HTML: `chatbot.html`, `select-page.html`
- UPPER_SNAKE_CASE para constantes: `API_BASE_URL`

**CSS:**
- kebab-case para clases: `.chatbot-container`, `.button-primary`
- Anidación con BEM: `.block__element--modifier`

---

## 9. SEGURIDAD

### Decisión: Protección CSRF

**Adoptado:** CSRF Protection con Spring Security  
**Fecha:** Enero 2026

**Implementación:**
- CSRF token en formularios
- SameSite cookie attribute
- Token validado en peticiones POST/PUT/DELETE

### Decisión: Storage de Token JWT

**Actual:** localStorage  
**Problema:** Vulnerable a XSS attacks  
**Futuro (v1.1):** httpOnly cookie

---

## 10. DOCUMENTACIÓN

### Decisión: Herramienta de Docs

**Adoptado:** Notion + GitHub Markdown  
**Fecha:** Octubre 2025

**Estructura:**
- Notion: Requisitos, decisiones, planificación
- GitHub Markdown: README, arquitectura, guías
- Postman: Documentación de API
- Comentarios en código: Explicaciones técnicas

### Decisión: Documentación API

**Adoptado:** Postman Collection  
**Futuro:** OpenAPI/Swagger (v1.1)

---

## TIMELINE DE DECISIONES

```timeline
Sept 2025: Constitución equipo, stack inicial
  ↓
Oct 2025: Tech stack completo, MongoDB setup, Docker decision
  ↓
Nov 2025: Frontend vanilla JS, Spring Boot estructura
  ↓
Dec 2025: Endpoints REST, validaciones, Bootstrap
  ↓
Ene 2026: Git normas, rama dev, refactorización
  ↓
Feb 2026: Consolidación, Google Auth 95%, Docker Compose
  ↓
Mar 2026: Demo final, documentación, últimos ajustes
```

---

## ✅ DECISIONES EXITOSAS

1. **MongoDB remote:** Funciona bien, acceso simplificado
2. **Docker Compose:** Setup reproducible y fácil
3. **Spring Boot 2.7:** Estabilidad perfecta
4. **JavaScript vanilla inicial:** Aceleró prototipo
5. **Bootstrap 5:** Responsive rápidamente
6. **Git rama dev:** Elimina muchos conflictos

---

## ⚠️ DECISIONES A REVISAR (v2.0)

1. **localStorage para JWT:** Cambiar a httpOnly cookie
2. **Vanilla JS:** Considerar React para mayor mantenibilidad
3. **Paginación:** Implementar en endpoints GET
4. **Caching:** Agregar Redis si performance lo requiere
5. **Testing:** JUnit 5 obligatorio en v1.1

---

**Documento mantenido por:** Iván Ibarra  
**Última actualización:** 12 de Marzo de 2026
