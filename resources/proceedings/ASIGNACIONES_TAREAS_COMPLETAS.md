# Registro de Asignaciones de Tareas y Progreso - EquipoSynet

**Período:** Septiembre 2025 - Marzo 2026  
**Última actualización:** 12 de Marzo de 2026

---

## REUNIÓN 1: 29/09/2025 - Acta de Constitución

### Decisiones principales
- Equipo de 8 miembros constituido formalmente
- Stack: Spring Boot + HTML/CSS/JS + MongoDB + Docker
- Herramientas: Notion, WhatsApp, GitHub
- Reuniones: Jueves alternos, quincenales

### Asignaciones (Implícitas en acta)
| Tarea | Fecha | Estado |
|-------|-------|--------|
| Liderazgo general y coordinación | Ongoing | Completado |
| Leadership técnico backend | Ongoing | Completado |
| Leadership técnico frontend | Ongoing | Completado |

---

## REUNIÓN 2: 02/10/2025 - Planificación Inicial

### Decisiones principales
- Notion como herramienta de documentación central
- WhatsApp para comunicación rápida
- GitHub como versionado obligatorio
- Stack: Pendiente definición completa

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Crear espacio en Notion | 02/10/2025 | Completado |
| Crear repositorio GitHub | 02/10/2025 | Completado |
| Documentar requisitos completos | 10/10/2025 | Completado |
| Crear wiki de tecnologías en Notion | 10/10/2025 | Completado |
| Definir arquitectura preliminar | 10/10/2025 | Completado |
| Estabelecer .gitignore inicial | 02/10/2025 | Completado |

---

## REUNIÓN 3: 16/10/2025 - Stack Tecnológico

### Decisiones principales
- IDE: Visual Studio Code (confirmado)
- Frontend: HTML/CSS/JavaScript vanilla
- Backend: Java + Spring Boot 2.7+
- BD: MongoDB Server en servidor remoto
- Build: Maven (pom.xml)
- Testing: Postman
- Infrastructure: Docker + Docker Compose

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Instalar VS Code + extensiones | 20/10/2025 | Completado |
| Instalar Java 11 JDK | 20/10/2025 | Completado |
| Instalar Maven | 20/10/2025 | Completado |
| Instalar MongoDB Compass | 20/10/2025 | Completado |
| Instalar Docker Desktop | 20/10/2025 | Completado |
| Crear estructura inicial SpringBoot | 18/10/2025 | Completado |
| Documentar stack en Notion | 20/10/2025 | Completado |
| Crear .gitignore para proyecto | 16/10/2025 | Completado |

---

## REUNIÓN 4: 30/10/2025 - Infraestructura MongoDB

### Decisiones principales
- MongoDB Server instalado en servidor remoto
- Acceso remoto configurado para equipo dev
- MongoDB Compass como herramienta de gestión
- Datos de prueba iniciales cargados
- Backups manuales semanales

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Documentar procedimiento de conexión en Notion | 31/10/2025 | Completado |
| Validar conectividad de cada miembro | 30/10/2025 | Completado |
| Crear usuario DB con permisos correctos | 29/10/2025 | Completado |
| Cargar datos iniciales de prueba | 30/10/2025 | Completado |
| Crear índices en colecciones | 02/11/2025 | Completado |
| Documentar schema esperado en Notion | 05/11/2025 | Completado |
| Establecer procedimiento de backups | 05/11/2025 | Completado |
| Capacitar equipo en MongoDB Compass | 05/11/2025 | Pendiente |

---

## REUNIÓN 5: 13/11/2025 - Primeros Avances

### Decisiones principales
- Crear estructura modular desde inicio
- Frontend vanilla JS (sin React)
- Puertos estándar: 8080 (backend), 3000 (frontend)
- Documentar arquitectura en Notion

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Resolver CORS completamente | 15/11/2025 | Completado |
| Crear controladores de ejemplo | 18/11/2025 | Completado |
| Validar conexión end-to-end | 17/11/2025 | Completado |
| Documentar estructura en Notion | 16/11/2025 | Completado |
| Crear rama 'develop' en GitHub | 13/11/2025 | Completado |

**Logros:**
- ✓ Estructura base backend com.synet.demoBack
- ✓ Frontend básico HTML/CSS/JS
- ✓ Conexión "hola mundo" exitosa
- ✓ CORS resolto en SecurityConfig
- ✓ DemoBackApplication y LoginController creados

---

## REUNIÓN 6: 04/12/2025 - Revisión y Reestructuración

### Decisiones principales
- Rehacer frontend con estructura modular
- Endpoints definitivos antes de Google Auth
- Estandarizar rutas a patrón RESTful: /api/v1/
- Usar Postman para testing
- Crear archivo example.env

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Rehacer frontend con estructura modular | 20/12/2025 | Completado |
| Reestructurar endpoints (CRUD completo) | 18/12/2025 | Completado |
| Implementar ArchivoRepository con MongoDB | 18/12/2025 | Completado |
| Crear documentación OpenAPI/Swagger | 20/12/2025 | Pendiente |
| Registrar app en Google Cloud Console | 10/12/2025 | Completado |
| Investigar flujo OAuth 2.0 | 15/12/2025 | Completado |
| Crear archivo example.env | 06/12/2025 | Completado |

**Logros:**
- ✓ Endpoints CRUD completados
- ✓ CasoClinico model con campos completos
- ✓ ArchivoService y ArchivoRepository implementados
- ✓ Validaciones en formularios
- ✓ Bootstrap 5 integrado

---

## REUNIÓN 7: 11/12/2025 - Google Auth y Refactorización

### Decisiones principales
- Completar login antes de enero
- Documentar endpoints en Notion
- Implementar validación JWT
- Usar .env para variables sensibles

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Finalizar callback URL de Google Auth | 30/01/2026 | Pendiente |
| Documentar endpoints en Notion | 10/01/2026 | Pendiente |
| Crear SecurityConfig con validación JWT | 15/12/2025 | Completado |
| Implementar refresh token | 20/12/2025 | Pendiente |
| Crear comentarios en código | 20/12/2025 | Pendiente |
| Validar seguridad Auth | 30/12/2025 | Pendiente |

**Logros:**
- ✓ Endpoints CRUD validados en Postman
- ✓ MongoDB conectado y funcional
- ✓ Google OAuth 95% completado
- ✓ SecurityConfig refactorizado
- ✓ Datos de prueba en colección

---

## REUNIÓN 8: 08/01/2026 - Post-Vacaciones y Normas Git

### Decisiones principales
- Rama 'dev' como rama principal de desarrollo
- Flujo: feature/ → dev → main
- Pull requests obligatorios
- Normas de commits: descriptivos, tipo: descripción
- Mejorar documentación Git en Notion

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Crear rama dev en GitHub | 08/01/2026 | Completado |
| Revisar y limpiar CSS | 10/01/2026 | Completado |
| Crear guía de Git en Notion | 12/01/2026 | Completado |
| Agregar comentarios en JS | 15/01/2026 | Pendiente |
| Refactorizar SecurityConfig | 15/01/2026 | Pendiente |
| Investigar Bootstrap/Tailwind | 10/01/2026 | Completado |
| Completar Google Auth callback | 15/01/2026 | Pendiente |

---

## REUNIÓN 9: 05/02/2026 - Consolidación de Avances

### Decisiones principales
- Refactorizar backend antes del 15 de febrero
- Mejorar UI con Bootstrap
- Documentación clara de variables de entorno
- Mantener .env en .gitignore

### Asignaciones

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Refactorizar controladores completo | 15/02/2026 | Completado |
| Mejorar UI con Bootstrap | 20/02/2026 | Completado |
| Finalizar Google Auth callback | 28/02/2026 | Pendiente |
| Documentar endpoints formato | 20/02/2026 | Pendiente |
| Crear docker-compose funcional | 12/02/2026 | Completado |
| Validación de formularios JS | 18/02/2026 | Completado |
| Pruebas en localhost:3000 | 20/02/2026 | Pendiente |

**Logros:**
- ✓ Backend completamente funcional
- ✓ Todos endpoints CRUD testeados
- ✓ Frontend responsive en Bootstrap 5
- ✓ Docker Compose funcional
- ✓ CORS y validaciones funcionando

---

## REUNIÓN 10: 19/02/2026 - Preparación Demo Final

### Decisiones principales
- Sistema satisface requisitos mínimos de SRS
- Priorizar completación Google Auth
- Documentación suficiente para mantenimiento
- Focus en quality de demo

### Asignaciones (Para antes de Demo 10/03/2026)

| Tarea | Fecha límite | Estado |
|-------|---------|--------|
| Finalizar Google Auth completamente | 05/03/2026 | Pendiente |
| Preparar datos de demo | 28/02/2026 | Pendiente |
| Crear guión de demo | 28/02/2026 | Pendiente |
| Pruebas completas en Docker | 02/03/2026 | Pendiente |
| Documentación final del proyecto | 05/03/2026 | Pendiente |
| Testing de casos de uso principales | 28/02/2026 | Pendiente |
| Validación de seguridad básica | 02/03/2026 | Pendiente |
| Preparar slides/presentación | 10/03/2026 | Pendiente |

---

## RESUMEN DE ASIGNACIONES

### Tareas completadas vs pendientes
- [Completadas] ~95 tareas
- [En progreso] ~15 tareas (Google Auth, documentación)
- [No iniciadas] 0 (todas asignadas)

### Críticos para de Demo (10/03/2026)
| Tarea | Riesgo |
|-------|--------|
| Google Auth - Completar | ALTO |
| Documentación final | Medio |
| Testing en Docker | Medio |
| Guíón de demo | Bajo |

---

## NOTAS DE SEGUIMIENTO

### Issues Frecuentes Resueltos
1. **CORS:** Resuelto en SecurityConfig (Oct-Nov)
2. **Puertos ocupados:** Documentado (Oct-Nov)
3. **Git conflicts:** Rama dev implementada (Ene)
4. **Variables de entorno:** .env.example creado (Dic)
5. **MongoDB conexión:** Procedimiento documentado (Oct)

### Lecciones aprendidas
1. Documentación en Notion es crítica para sincronización
2. Rama dev evita muchos conflictos
3. Pull requests obligatorios mejoran calidad
4. MongoDB remoto funciona bien a pesar de latencia
5. Docker Compose simplifica mucho el setup

### Próximas mejoras (Post-Demo)
- OpenAPI/Swagger documentation
- Tests unitarios con JUnit 5
- Paginación de resultados
- CI/CD con GitHub Actions
- Roles y permisos por usuario

---

**Documento mantenido por:** Iván Ibarra  
**Última actualización:** 12 de Marzo de 2026  
**Próxima revisión:** Después de demo (marzo 10)
