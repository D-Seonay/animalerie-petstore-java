# Projet JAVA - Petstore 🐾

## Consignes

[Cliquez ici pour télécharger le PDF](tp-eval-pet-store-c2.pdf)

## Description

Ce projet est une application Spring Java pour la gestion d'une animalerie (Petstore).  
L'application permet de gérer :

- Les animaux
- Les Magazins
- Les produits  

## Technologies utilisées

- **Java** (Spring Boot)  
- **MySQL** (Base de données)  
- **Hibernate** (ORM)  
- **Maven** (Gestion de dépendances)  

## Configuration

### Prérequis

- JDK 17+  
- Maven  
- MySQL  

### Installation

1. **Cloner le projet**

```bash
git clone https://github.com/D-Seonay/animalerie-petstore-java.git
cd animalerie-petstore-java
```

2. **Configurer la base de données**

Crée une base de données MySQL :

```sql
CREATE DATABASE petstore;
```

3. **Configurer le fichier `application.properties`**

Dans le dossier `src/main/resources` :

```properties
spring.datasource.url=jdbc:mysql://127.0.0.1:8889/petshop
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=create-drop
```

## Auteur

[Mathéo DELAUNAY](https://www.linkedin.com/in/matheo-delaunay/)  
