# Backend Spring Boot - Equipo Synet

Este es el backend del proyecto Equipo Synet desarrollado con Spring Boot. Proporciona endpoints REST para la gestión de datos de pacientes y síntomas.

## 📋 Requisitos Previos

- **Java 17** o superior
- **Maven 3.6+** (incluido en el proyecto mediante Maven Wrapper)
- **Git** para clonar el repositorio

## 🚀 Descargar el Proyecto

```bash
git clone --depth 1 --filter=blob:none --sparse https://github.com/Ulf-v/EquipoSynet.git
cd EquipoSynet
git sparse-checkout set Backend-springboot
cd Backend-springboot
```

## 💻 Importar y Ejecutar en IntelliJ IDEA

### 1. Importar el Proyecto
1. Abre **IntelliJ IDEA**
2. Selecciona **File → Open**
3. Navega hasta la carpeta `Backend-springboot`
4. Selecciona el archivo `pom.xml` y haz clic en **Open**
5. En el diálogo que aparece, selecciona **Open as Project**
6. IntelliJ detectará automáticamente que es un proyecto Maven y descargará las dependencias

### 2. Configurar el JDK
1. Ve a **File → Project Structure → Project**
2. Asegúrate de que **SDK** esté configurado a Java 17 o superior
3. Haz clic en **Apply** y **OK**

### 3. Ejecutar la Aplicación
**Opción A - Desde el IDE:**
1. Abre el archivo `DemoBackApplication.java`
2. Haz clic derecho en el archivo
3. Selecciona **Run 'DemoBackApplication'**

**Opción B - Desde Maven:**
1. Abre la ventana de **Maven** (View → Tool Windows → Maven)
2. Expande **Lifecycle**
3. Haz doble clic en **spring-boot:run**

**Opción C - Desde Terminal integrado:**
```bash
./mvnw spring-boot:run
```

## 🌙 Importar y Ejecutar en Eclipse

### 1. Importar el Proyecto
1. Abre **Eclipse IDE**
2. Ve a **File → Import**
3. Selecciona **Maven → Existing Maven Projects**
4. Haz clic en **Next**
5. En **Root Directory**, navega hasta la carpeta `Backend-springboot`
6. Asegúrate de que el `pom.xml` esté seleccionado
7. Haz clic en **Finish**
8. Eclipse descargará automáticamente las dependencias

### 2. Configurar el JDK
1. Haz clic derecho en el proyecto
2. Selecciona **Properties**
3. Ve a **Java Build Path → Libraries**
4. Asegúrate de tener configurado **JRE System Library [JavaSE-17]** o superior
5. Si no está, haz clic en **Add Library → JRE System Library** y selecciona Java 17+

### 3. Ejecutar la Aplicación
**Opción A - Desde el IDE:**
1. Haz clic derecho en el archivo `DemoBackApplication.java`
2. Selecciona **Run As → Java Application**

**Opción B - Desde Maven:**
1. Haz clic derecho en el proyecto
2. Selecciona **Run As → Maven build...**
3. En **Goals**, escribe: `spring-boot:run`
4. Haz clic en **Run**

**Opción C - Desde Terminal:**
```bash
./mvnw spring-boot:run
```

## 🔧 Ejecutar desde Línea de Comandos

### Windows (PowerShell/CMD)
```bash
cd Backend-springboot
.\mvnw.cmd spring-boot:run
```

### Linux/Mac
```bash
cd Backend-springboot
./mvnw spring-boot:run
```

## ✅ Verificar que el Servidor está Funcionando

Una vez iniciado el servidor, deberías ver en la consola:
```
Started DemoBackApplication in X.XXX seconds
```

El servidor estará corriendo en: **http://localhost:8080**

## 🧪 Probar los Endpoints

### Endpoints Disponibles

#### 1. Obtener Pacientes
```bash
GET http://localhost:8080/api/csv/pacientes
```

**Probar con cURL:**
```bash
curl http://localhost:8080/api/csv/pacientes
```

**Probar en el navegador:**
- Abre tu navegador y visita: `http://localhost:8080/api/csv/pacientes`

#### 2. Obtener Síntomas
```bash
GET http://localhost:8080/api/csv/sintomas
```

**Probar con cURL:**
```bash
curl http://localhost:8080/api/csv/sintomas
```

**Probar en el navegador:**
- Abre tu navegador y visita: `http://localhost:8080/api/csv/sintomas`

### 🔍 Probar con Postman

1. Descarga e instala [Postman](https://www.postman.com/downloads/)
2. Crea una nueva petición **GET**
3. Ingresa la URL: `http://localhost:8080/api/csv/pacientes`
4. Haz clic en **Send**
5. Deberías ver la respuesta con los datos de los pacientes

Repite para el endpoint de síntomas.

### 🌐 Probar con el Navegador

Simplemente abre estas URLs en tu navegador:
- **Pacientes:** http://localhost:8080/api/csv/pacientes
- **Síntomas:** http://localhost:8080/api/csv/sintomas

## 📁 Estructura del Proyecto

```
Backend-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/synet/demoBack/
│   │   │   ├── controller/
│   │   │   │   └── CsvController.java      # Controlador REST
│   │   │   └── DemoBackApplication.java    # Clase principal
│   │   └── resources/
│   │       ├── data/
│   │       │   ├── pacientes.csv           # Datos de pacientes
│   │       │   └── sintomas.csv            # Datos de síntomas
│   │       └── application.properties      # Configuración
│   └── test/                                # Tests unitarios
├── pom.xml                                  # Dependencias Maven
└── mvnw / mvnw.cmd                         # Maven Wrapper
```

## 🛑 Detener el Servidor

- **En IntelliJ/Eclipse:** Haz clic en el botón rojo de Stop en la consola
- **En Terminal:** Presiona `Ctrl + C`

## ⚠️ Solución de Problemas

### El puerto 8080 ya está en uso
Si ves el error: `Port 8080 is already in use`, cambia el puerto en `application.properties`:
```properties
server.port=8081
```

### Maven no compila
Asegúrate de tener Java 17+ instalado:
```bash
java -version
```

### Dependencias no se descargan
Ejecuta:
```bash
./mvnw clean install
```

## 📝 Notas Adicionales

- Los datos se leen desde archivos CSV ubicados en `src/main/resources/data/`
- El servidor usa el puerto **8080** por defecto
- Los endpoints están bajo el prefijo `/api/csv/`
