# Synet

### *Sistema de Gestión Hospitalaria*  

![ESTADO](https://img.shields.io/badge/ESTADO-EN%20DESARROLLO-blue)
![VERSION](https://img.shields.io/badge/VERSION-1.0-blue)


---

## 🛠️ Tecnologías utilizadas

![React](https://img.shields.io/badge/React-18.2%2B-61DAFB?style=for-the-badge&logo=react&logoColor=white)
![BootStrap](https://img.shields.io/badge/BootStrap-3.9%2B-3776AB?style=for-the-badge&logo=Bootstrap&logoColor=white)
![Java](https://img.shields.io/badge/Java-3.9%2B-3776AB?style=for-the-badge&logo=Java&logoColor=white)
![SpringBoot](https://img.shields.io/badge/Flask-2.0%2B-000000?style=for-the-badge&logo=flask&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-5.0%2B-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-13%2B-336791?style=for-the-badge&logo=Docker&logoColor=white)

---

## ¿Qué es Synet?

Synet es una plataforma concebida para optimizar y actualizar los procesos de gestión hospitalaria. Se trata de una aplicación web que facilita a los profesionales médicos la administración de la información de los casos clínicos, la verificación de los historiales clínicos y su almacenamiento para consultas futuras.

---

## Funciones de Synet

- 🟣 **Gestionar datos de pacientes:** permite consultar la información clínica, actualizar registros y localizar historiales de manera ágil.  
- 🟠 **Acceso seguro:** incorpora autenticación mediante JWT y un sistema de permisos basado en roles.  
- 🟢 **Historial médico:** ofrece un registro integral del paciente, incluyendo información clínica y tratamientos recibidos.  
- 🔵 **Responsive:** garantiza un funcionamiento óptimo en ordenadores, tabletas y dispositivos móviles. 

---

## 🏗️ Arquitectura del Sistema

Synet ha sido desarrollado siguiendo una arquitectura clásica de tres capas, seleccionada por su eficacia y claridad estructural. El sistema incorpora un frontend construido con React, un backend implementado en Spring Boot y un entorno de almacenamiento basado en MongoDB para la gestión de los datos.

```mermaid
graph TB
    subgraph Client["🖥️ CAPA DE PRESENTACIÓN"]
        UI[React + Tailwind CSS<br/>Puerto 3000]
    end
    
    subgraph API["⚙️ CAPA DE APLICACIÓN"]
        Flask[Flask API<br/>Puerto 5000]
        WS[WebSocket Server<br/>Socket.IO]
        
    Services[Servicios:<br/>Users, Patients<br/>Records]
    end
    
    subgraph Database["💾 CAPA DE DATOS"]
        PG[(PostgreSQL<br/>Usuarios, Pacientes<br/>Historiales)]
        
    MDB[(MongoDB<br/>Almacenamiento<br/>NoSQL)]
    end
    
    UI -->|HTTPS/REST| Flask
    UI -->|WebSocket| WS
    
    Flask --> Services
    WS --> Services
    
    Services --> PG
    Services --> MDB
    
    style Client fill:#61dafb,stroke:#333,stroke-width:3px,color:#000
    style API fill:#3c873a,stroke:#333,stroke-width:3px,color:#fff
    style Database fill:#336791,stroke:#333,stroke-width:3px,color:#fff
```

---

## ⚙️ Instalación y ejecución

### 1. Clonar el repositorio
```bash

Proyecto-Sirena/
│
├── frontend/        # Código del cliente (HTML, CSS, JS, frameworks)
│   ├── public/
│   ├── src/
│   └── package.json
# EquipoSynet

Repositorio educativo que contiene tres componentes principales: un proyecto Java clásico de pruebas, un microservicio Spring Boot y un frontend estático. Este README ofrece instrucciones claras para ejecutar y contribuir al proyecto, tanto en local como opcionalmente con Docker.



