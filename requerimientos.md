#Especificación de Requerimientos de Software (SRS)

**Nombre del Proyecto:** primarIA  
**Versión:** 1.0  
**Fecha:** 06-11-2025  
**Autores:** Equipo Synet  
**Organización:** IES Ribera del Tajo  

---

## 1. Introducción

### 1.1 Propósito
El propósito de este documento es definir los **requerimientos** del sistema **primarIA**, una aplicación que permite a médicos ingresar descripciones de síntomas mediante un chatbot inteligente.  
El sistema cotejará estos síntomas con una **base de datos de casos clínicos generados por IA**, proponiendo posibles diagnósticos y ofreciendo herramientas de validación y revisión médica.  

Este documento servirá como referencia para:
- El **equipo de desarrollo**, para implementar las funcionalidades requeridas.  
- El **equipo médico**, para validar los comportamientos del sistema.  
- Los **evaluadores de calidad y cumplimiento**, para verificar la conformidad con los requerimientos.  

---

### 1.2 Alcance
**primarIA** es una aplicación web destinada a profesionales de la salud.  
Su propósito principal es:
1. Permitir que un médico introduzca síntomas clínicos a través de un chatbot.  
2. Procesar la información y sugerir un posible diagnóstico basándose en casos clínicos previamente verificados.  
3. Permitir que médicos acreditados inicien sesión para **validar y auditar casos clínicos** almacenados en la base de datos, garantizando su autenticidad y calidad médica.  

---

### 1.3 Definiciones, acrónimos y abreviaturas

| Término | Definición |
|----------|------------|
| **SRS** | Especificación de Requerimientos de Software (*Software Requirements Specification*) |
| **IA** | Inteligencia Artificial |
| **Chatbot** | Sistema de conversación automatizado basado en procesamiento del lenguaje natural |
| **Caso clínico** | Registro de síntomas, diagnóstico y tratamiento asociado a un paciente |
| **Médico acreditado** | Profesional validado que puede revisar y calificar casos clínicos |
| **Diagnóstico sugerido** | Resultado propuesto por el sistema, basado en similitud con casos previos |

---

### 1.4 Referencias
- IEEE Std 830-1998 — *IEEE Recommended Practice for Software Requirements Specifications*  
- ISO/IEC/IEEE 29148:2018 — *Systems and Software Engineering — Life Cycle Processes — Requirements Engineering*  
- Lineamientos éticos de la OMS sobre IA en salud (2023)  

---

### 1.5 Visión general del documento
Este documento describe el contexto general del sistema ([**Sección 2**](#2-descripción-general-del-sistema)), sus requisitos funcionales y no funcionales([**Sección 3**](#3-requerimientos-específicos)), y el proceso de verificación y validación ([**Sección 4**](#4-verificación-y-validación)).

---

## 2. Descripción general del sistema

### 2.1 Perspectiva del producto
El sistema **primarIA** se integra con una base de datos central de casos clínicos verificados.  
Consta de tres módulos principales:
1. **Chatbot Médico:** interfaz de conversación con IA para el ingreso de síntomas.  
2. **Motor de Diagnóstico:** módulo que compara síntomas con la base de datos y devuelve posibles diagnósticos.  
3. **Panel de Validación Médica:** acceso restringido para médicos acreditados, que evalúan y validan los casos guardados.

---

### 2.2 Funciones del producto
- **Chatbot conversacional:** recibe descripciones de síntomas.  
- **Búsqueda y análisis clínico:** coteja la información con casos similares.  
- **Sugerencia de diagnóstico:** presenta un diagnóstico probable y grado de confianza.  
- **Registro de casos:** guarda las consultas como nuevos casos clínicos.  
- **Login y gestión de usuarios médicos:** permite que médicos acreditados inicien sesión.  
- **Revisión y validación:** los médicos revisan casos y califican su autenticidad y calidad.  

---

### 2.3 Características de los usuarios

| Tipo de usuario | Descripción | Permisos |
|------------------|-------------|----------|
| **Médico general** | Utiliza el chatbot para consultar diagnósticos | Crear y consultar casos |
| **Médico acreditado** | Revisa y valida casos clínicos | Revisar, aprobar o rechazar casos |
| **Administrador** | Gestiona usuarios y configuraciones | Control total del sistema |

---

### 2.4 Restricciones
- Cumplimiento de normativas de **protección de datos médicos (GDPR / LOPDGDD)**.  
- Interfaz compatible con navegadores modernos (Chrome, Edge, Firefox).  
- Base de datos alojada en un entorno seguro con cifrado AES-256.  
- El sistema debe operar en idioma español.  

---

### 2.5 Suposiciones y dependencias
- Se dispone de una base de datos inicial de casos clínicos verificados.  
- Los usuarios médicos estarán registrados y autenticados mediante un sistema de validación.  
- La precisión del diagnóstico dependerá de la calidad y volumen de los casos almacenados.  

---

## 3. Requerimientos específicos

### 3.1 Requerimientos funcionales

| ID | Requerimiento | Descripción | Prioridad |
|----|----------------|-------------|------------|
| RF-01 | Interacción con chatbot | El sistema debe permitir al médico ingresar síntomas de manera comoda y sencilla. | Alta |
| RF-02 | Procesamiento de síntomas | El sistema debe interpretar texto médico y extraer entidades relevantes (síntomas, duración, severidad). | Alta |
| RF-03 | Sugerencia de diagnóstico | El sistema debe ofrecer posibles diagnósticos basados en coincidencias con casos previos. | Alta |
| RF-04 | Registro automático de consulta | Cada conversación debe almacenarse como un caso clínico. | Media |
| RF-05 | Login seguro | El sistema debe permitir acceso a médicos acreditados mediante autenticación segura. | Alta |
| RF-06 | Revisión de casos clínicos | Los médicos acreditados deben poder revisar, aprobar o rechazar casos clínicos. | Alta |
| RF-07 | Asignación de casos aleatoria | El sistema debe distribuir los casos clínicos de forma equilibrada entre revisores. | Media |
| RF-08 | Gestión de usuarios | El administrador debe poder crear, editar o eliminar usuarios médicos. | Media |
| RF-09 | Historial y auditoría | El sistema debe registrar todas las acciones (consultas, revisiones, aprobaciones). | Alta |

---

### 3.2 Requerimientos de interfaz
- **Interfaz de usuario (UI):**  
  - Chat con diseño tipo mensajería.  
  - Panel de control para médicos acreditados con tabla de casos y filtros.  
- **Interfaz de software:**  
  - API RESTful para conexión con la base de datos y el motor de IA.  
- **Interfaz de hardware:**  
  - Requiere únicamente un dispositivo con navegador y conexión a Internet.  

---

### 3.3 Requerimientos de desempeño
- Tiempo máximo de respuesta del chatbot: **< 3 segundos** por interacción.  
- Disponibilidad del sistema: **≥ 99.5% mensual**.  
- Capacidad: manejo simultáneo de **al menos 500 usuarios concurrentes**.  

---

### 3.4 Requerimientos de seguridad
- Autenticación y autorización basadas en roles (RBAC).  
- Encriptación de datos en tránsito (TLS 1.3) y en reposo (AES-256).  
- Eliminación segura de datos personales conforme a GDPR.  
- Registro de auditorías de accesos y acciones de usuarios.  

---

### 3.5 Requerimientos de calidad
- **Usabilidad:** interfaz intuitiva, validada con pruebas de usabilidad médica.  
- **Mantenibilidad:** código modular, documentado y versionado en GitHub.  
- **Portabilidad:** compatible con Windows, Linux y macOS.  
- **Escalabilidad:** arquitectura cloud-native.  

---

### 3.6 Requerimientos de IA/ML
- El modelo de IA debe estar entrenado con datos clínicos anonimizados.  
- Debe incluir mecanismos de explicabilidad (mostrar razones del diagnóstico).  

---

## 4. Verificación y validación
- **Pruebas unitarias:** 90% de cobertura mínima del código.  
- **Pruebas funcionales:** Validación de flujo completo desde chatbot hasta registro de caso.  
- **Pruebas de seguridad:** Test de penetración y revisión de cumplimiento GDPR.  
- **Pruebas de precisión:** Comparación de diagnósticos sugeridos vs diagnósticos reales (>80% de concordancia esperada).  
- **Revisión médica:** Aprobación por médicos acreditados antes de liberar a producción.  

---

## 5. Apéndices

### 5.1 Glosario de términos médicos
*(Se completará en base a los casos clínicos del sistema.)*

---

### 5.2 Historial de revisiones

| Versión | Fecha | Autor | Descripción |
|----------|--------|--------|-------------|
| 1.0 | 06-11-2025 | Equipo Synet | Versión inicial del documento SRS |

---
