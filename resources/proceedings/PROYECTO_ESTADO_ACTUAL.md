# Estado Actual del Proyecto - EquipoSynet (primarIA)
**Fecha:** Marzo 12, 2026  
**Versión:** 1.0  
**Estado General:** EN DESARROLLO - 85% completado

---

## Resumen Ejecutivo

**EquipoSynet** es un proyecto educativo que implementa una plataforma web para gestión de casos clínicos médicos con validación por profesionales acreditados. El sistema consta de un backend REST API en Spring Boot, un frontend responsive en HTML/CSS/JavaScript, y una base de datos MongoDB en servidor remoto.

El proyecto ha avanzado significativamente desde su constitución en septiembre de 2025, completando la mayoría de los módulos principales. La demo interna está programada para marzo de 2026.

---

## Lo realizado por fase

### Fase 1: Constitución y Planificación (Septiembre - Octubre 2025)
[COMPLETADO]
- Acta de constitución firmada por 8 miembros del equipo
- Stack tecnológico definido: Spring Boot + HTML/CSS/JS + MongoDB
- Herramientas de trabajo seleccionadas: Notion, WhatsApp, GitHub
- Estructura organizativa establecida
- Reuniones quincenales programadas (jueves alternos)

**Tecnologías seleccionadas:**
- Frontend: HTML5, CSS3, JavaScript ES6+ (vanilla, sin frameworks inicialmente)
- Backend: Java 11+, Spring Boot 2.7+, Spring Security 5+
- Base de datos: MongoDB Server 5.0+ en servidor remoto
- Infraestructura: Docker, Docker Compose
- IDE: Visual Studio Code para todo el equipo
- Herramientas: Maven (build), MongoDB Compass (gestión BD), Postman (testing)

### Fase 2: Preparación de Infraestructura (Octubre 2025)
[COMPLETADO]
- MongoDB Server instalado y configurado en servidor remoto
- Usuario equiposynet_dev creado con permisos R/W
- MongoDB Compass instalado en todas las máquinas del equipo
- Conexión remota validada desde todos los miembros
- Datos de prueba iniciales cargados (~100 casos clínicos)
- Índices creados para optimizar búsquedas
- Procedimiento de backups documentado

**Problemas resueltos:**
- Firewall de Álvaro Molina bloqueaba acceso → solucionado
- Conflicto de puertos en máquina de Melisa → resuelta con MongoDB remoto
- String de conexión confuso → documentado y compartido

### Fase 3: Desarrollo de Backend (Noviembre - Febrero 2026)
[Completado]
- Estructura modular implementada: com.synet.demoBack
- Controladores REST creados:
  - ArchivoController: CRUD de archivos
  - LoginController: Gestión de autenticación
- Servicios implementados:
  - CasoClinocoService: Lógica de negocio para casos
  - ArchivoService: Gestión de archivos
- Repositorios funcionales:
  - ArchivoRepository: extends CrudRepository
  - CrudRepository para casos clínicos
- SecurityConfig refactorizado:
  - CORS habilitado correctamente
  - OAuth 2.0 parcialmente implementado
  - Validación de CSRF configurada

**Modelo de datos CasoClinico:**
- id, edad, sexo, antecedentes_medicos, antecedentes_quirurgicos
- habitos, situacion_basal, medicacion_actual, antecedentes_familiares
- motivo, sintomas, exploracion_general, signos
- resultados_pruebas, razonamiento_clinico, diagnostico_final
- tratamiento_farmacologico, tratamiento_no_farmacologico
- factores_sociales, alergias, referencias_bibliograficas
- categoria, keywords, codigo_cie_10, dificultad
- chunk_id, chunk

### Fase 4: Desarrollo de Frontend (Noviembre - Febrero 2026)
[Completado]
- Estructura HTML modular implementada
- Bootstrap 5 integrado completamente
- Páginas desarrolladas:
  - index.nginx-debian.html: Landing page
  - chatbot.html: Interfaz de chatbot para entrada de síntomas
  - select_page.html: Página de filtros y búsqueda
  - validacion_Medicos.html: Panel de validación para médicos acreditados
  
- Scripts JavaScript modularizados:
  - burger.js: Menú hamburguesa responsive
  - chatbot.js: Lógica de chatbot (captura de síntomas, búsqueda)
  - validation.js: Validación de formularios en cliente
  
- Estilos CSS organizados:
  - chatbot.css: Estilos específicos de chatbot
  - style.css: Estilos generales y responsive
  
- Características implementadas:
  - [Completado] Formularios con validación en cliente
  - [Completado] Mensajes de error/éxito visuales
  - [Completado] Diseño responsive (mobile, tablet, desktop)
  - [Completado] Comunicación AJAX con backend vía fetch API
  - [Completado] Indicadores visuales de carga
  - [Completado] Navegación entre páginas

**Problemas resueltos:**
- CORS bloqueaba peticiones iniciales → habilitado en SecurityConfig
- Rutas mal configuradas en fetch → ajustadas con paths relativos
- CSS conflictivo al renombrar carpetas → refactorizado

### Fase 5: Integración e Iteraciones (Diciembre 2025 - Febrero 2026)
[Completado parcialmente]
- [Sí] Backend y frontend conectados exitosamente
- [Sí] Endpoints CRUD validados en Postman
- [Sí] Comunicación API funcionando correctamente
- [Sí] Base de datos estable y accesible
- [Sí] Docker Compose configurado y funcional
- [Sí] .gitignore y .env.example documentados
- [Parcial] Google OAuth 2.0: 95% completada
  - Token JWT se genera y almacena correctamente
  - Pero redirect post-login tiene problemas
  - Faltan validación de refresh token y logout completo

---

## Tecnologías en uso

### Frontend
```
HTML5 + CSS3 + JavaScript ES6+
├── Bootstrap 5 (estilos y componentes)
├── Fetch API (comunicación con backend)
└── Vanilla JS (sin frameworks React/Vue)
```

### Backend
```
Java 11+ + Spring Boot 2.7+
├── Spring Web (MVC, REST controllers)
├── Spring Data MongoDB (acceso a base de datos)
├── Spring Security 5+ (autenticación, CORS, CSRF)
├── Spring Boot OAuth 2.0 Client (Google Auth)
└── Maven (gestor de dependencias y build)
```

### Base de datos
```
MongoDB Server 5.0+
├── Base de datos: equiposynet_db
├── Colecciones: casos, usuarios, archivos
├── Índices: diagnóstico_final, edad, categoria+dificultad
└── Usuario: equiposynet_dev (R/W permisos)
```

### Infraestructura y Herramientas
```
Docker + Docker Compose
├── Contenedor mongo:4.4
├── Contenedor backend (Spring Boot)
├── Volumen para datos persistentes
└── Red app-network para comunicación

IDE y Editores
├── Visual Studio Code
├── Extended con plugins Java, Spring Boot, Git
└── MongoDB Compass (gestión de BD)

Testing y Documentación
├── Postman (testing API)
├── Notion (documentación y planificación)
├── GitHub (control de versiones)
└── Markdown (archivos de documentación)
```

## Estado de features

### Implementadas y Funcionales
- [Sí] Estructura modular frontend/backend separada
- [Sí] Endpoints REST CRUD completos para casos
- [Sí] Formularios con validación en cliente y servidor
- [Sí] Integración HTML/CSS/JS con Spring Boot API exitosa
- [Sí] MongoDB conectado y operacional
- [Sí] Docker Compose funcional
- [Sí] Documentación de API en Postman
- [Sí] Gestión de Git con rama dev/main/features
- [Sí] Normas de commits y pull requests establecidas
- [Sí] Bootstrap 5 integrado para responsive design
- [Sí] Validaciones de formularios en frontend

### En Progreso
- [Parcial] Google OAuth 2.0: 95% (callback problem)
- [Parcial] Documentación OpenAPI/Swagger (pendiente para v1.1)
- [Parcial] Paginación de resultados (v2)
- [Parcial] Tests unitarios (pendiente para v1.1)

### No Implementadas
- [Pendiente] Validación de refresh tokens
- [Pendiente] Logout completo y sesión terminada
- [Pendiente] Panel de validación médica funcional
- [Pendiente] Búsqueda avanzada/filtros complejos
- [Pendiente] Exportación de casos (PDF/Excel)
- [Pendiente] CI/CD con GitHub Actions
- [Pendiente] HTTPS/SSL en producción
- [Pendiente] Reglas de autorización por roles (por implementar en v1.1)

## Riesgos y mitigaciones

| Riesgo | Probabilidad | Impacto | Mitigación |
|--------|-------------|---------|-----------|
| Google OAuth no se completa a tiempo | Media | Alto | Jorge está enfocado, deadline ajustado a 05/03 |
| Conflictos Git frecuentes | Baja | Medio | Rama dev obligatoria, PRs requeridos |
| MongoDB cae durante demo | Baja | Alto | Soporte IT contactado, backups diarios |
| Performance sin paginación | Media | Bajo | Aceptable para ~100 registros de prueba |
| Token JWT vulnerable a XSS | Media | Medio | Se considera guardar en httpOnly cookie (futuro) |
| Incompatibilidad Docker en alguna máquina | Baja | Medio | Testing en todas las máquinas, documentación clara |

---

## Próximos hitos

### Antes de Demo (Marzo 10, 2026)
- [ ] Completar Google OAuth (refresh token, logout)
- [ ] Testing completo en Docker del sistema integrado
- [ ] Documentación de usuario final
- [ ] Guión y slides para presentación
- [ ] Validación de datos de demo
- [ ] Testing en navegadores (Chrome, Firefox, Edge)

### v1.1 (Después de demo)
- [ ] OpenAPI/Swagger documentation
- [ ] Paginación de resultados
- [ ] Tests unitarios con JUnit 5 + Mockito
- [ ] Validación de refresh tokens
- [ ] Roles y permisos por usuario
- [ ] Performance optimization con índices MongoDB

### v2.0 (Futuro)
- [ ] Búsqueda avanzada con filtros complejos
- [ ] Exportación de casos (PDF, Excel)
- [ ] Dashboard de estadísticas
- [ ] Chat en tiempo real (WebSocket)
- [ ] Notificaciones por email
- [ ] CI/CD con GitHub Actions
- [ ] HTTPS/SSL en producción

---

## 7️⃣ CÓMO EJECUTAR EL PROYECTO

### Setup Local
```bash
# 1. Clonar repositorio
git clone https://github.com/EquipoSynet/[repo]
cd EquipoSynet

# 2. Configurar variables de entorno
cp .env.example .env
# Editar .env con credenciales de MongoDB y Google OAuth

# 3. Instalar dependencias backend
cd Backend-springboot
mvn install

# 4. Ejecutar con Docker Compose
cd ..
docker-compose up -d

# 5. Frontend en desarrollo
# Servir frontend/src con Live Server de VS Code
# O ejecutar en http://localhost:3000
```

### Conectar a MongoDB
```
MongoDB URI: mongodb://[usuario]:[pass]@[servidor]:27017/equiposynet_db
MongoDB Compass: File → Connect → Paste URI anterior
```

## 🎯 CONCLUSIÓN

El proyecto EquipoSynet ha avanzado significativamente y se encuentra en un **estado avanzado de desarrollo**. El backend REST API está completo y funcional, el frontend es responsive y está integrado correctamente con la base de datos. 

El único pendiente importante es la **finalización de Google OAuth 2.0** (estimado para 05/03/2026), que está al 95% completado. Una vez se resuelva esto, el sistema estará listo para demostración interna.

**Target:** Demo interna funcional para **10 de marzo de 2026**.

---

**Documento última actualización:** 12 de Marzo de 2026  
**Responsable de mantenimiento:** Iván Ibarra  
**Próxima revisión:** 26 de Marzo de 2026
