# 📚 **PROYECTO ALURA - LITERATURA**

## **Acerca del Proyecto**
Este desarrollo cumple con los requisitos del Challenge 2 de Alura, enfocado en el consumo de la API GutenDex para acceder a una amplia colección de datos relacionados con libros. El proyecto abarca:

- Manejo de datos en formato JSON obtenidos desde la API y su integración en la aplicación.  
- Mapeo de entidades para estructurar el modelo de datos.  
- Implementación de JPA para la creación, gestión y persistencia de una base de datos.  
- Registro y consulta de información en la base de datos.  
- Funcionalidades como listar libros almacenados, obtener información sobre autores y más.

---

## **Funciones Principales**
- **Consumo de la API GutenDex:**  
  Conexión a la API para extraer y procesar datos sobre libros.  

- **Operaciones de consulta :**  
  Gestión consultar registros de libros en la base de datos.  

- **Manejo y transformación de datos:**  
  Conversión de datos desde JSON a objetos Java y su almacenamiento en formato requerido.  

- **Gestión de datos con JPA:**  
  Uso de JPA para interactuar con la base de datos y garantizar la persistencia de datos.  

---

## **Menú del Proyecto**
![image](https://github.com/user-attachments/assets/82590250-5801-46b3-bf86-eeaabc594f0c)

### 📌 **1. Obtener información de la API GutenDex**  
Interfaz para visualizar y gestionar los datos obtenidos de la API.  
![image](https://github.com/user-attachments/assets/0dd8ed68-5fb5-43ae-8fe5-e1505fd1fd0a)


### 📌 **2. Consultar información de los libros almacenados en la base de datos**  
Lista y detalla los libros previamente registrados.  
![image](https://github.com/user-attachments/assets/b2ddb402-9ddc-46f9-8ba8-e12dab853fbd)


### 📌 **3. Consultar información de los autores registrados en la base de datos**  
Proporciona datos sobre autores y sus obras asociadas.  
![image](https://github.com/user-attachments/assets/af71ac2a-9df8-4a75-9f88-b2686de187d5)


### 📌 **4. Consultar autores vivos en un año específico**  
Permite buscar autores que estaban vivos en un año dado.  
![image](https://github.com/user-attachments/assets/c5193397-9550-49a3-8149-01d8cdfa68bb)


### 📌 **5. Consultar libros según el idioma**  
Filtro para listar libros basados en su idioma.  
![image](https://github.com/user-attachments/assets/40d691c0-8766-414f-a5d9-6538d04dc1bc)

---

### **Entorno de desarrollo:**
- **IDE Recomendado:** IntelliJ IDEA.  
- **Gestor de dependencias:** Maven.

### **Dependencias:**
- **Spring Boot (3.4.1):** Framework para la lógica y consumo de la API.  
- **Spring Data JPA:** Para la interacción con la base de datos.  
- **PostgreSQL Driver:** Controlador para conectar con la base de datos PostgreSQL.

## 🛠️ **Tecnologías Usadas**

| Tecnología        | Versión | Descripción                                               |
|--------------------|---------|-----------------------------------------------------------|
| **Spring Boot**    | 3.4.1   | Framework para desarrollar la lógica del proyecto y consumir la API GutenDex. |
| **Spring Data JPA**| -       | Herramienta para gestionar la persistencia de datos y simplificar el acceso a la base de datos. |
| **PostgreSQL**     | -       | Base de datos relacional utilizada para almacenar los datos de libros y autores. |
| **Maven**          | -       | Herramienta para gestionar dependencias y construir el proyecto de manera eficiente. |
| **IntelliJ IDEA**  | -       | IDE recomendado para el desarrollo y ejecución del proyecto. |
| **Java**           | 17      | Lenguaje de programación utilizado para el desarrollo de la lógica y las funcionalidades del sistema. |


