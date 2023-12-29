# OrderCraft - Gestion des Commandes d'ArtWood

OrderCraft est une application de gestion des commandes développée par ArtWood. L'objectif principal de ce projet est de migrer l'application existante basée sur Java EE vers une architecture plus moderne utilisant Spring Core MVC avec Thymeleaf.

## Fonctionnalités

1. **Ajout de Commandes :**
   Les utilisateurs peuvent ajouter de nouvelles commandes en spécifiant les détails tels que le client, les articles commandés, et la date de la commande.

2. **Visualisation des Commandes en Cours :**
   Une interface conviviale basée sur Spring Core MVC et Thymeleaf permet aux utilisateurs de voir l'état d'avancement des commandes en cours, y compris les détails spécifiques de chaque commande.

3. **Marquer les Commandes comme Complètes :**
   Les utilisateurs ont la possibilité de marquer les commandes comme complètes une fois qu'elles ont été traitées, facilitant le suivi des commandes encore en attente.

4. **Gestion des Clients :**
   Un module de gestion des clients permet aux utilisateurs de créer, afficher et mettre à jour les informations clients pour une gestion centralisée.

5. **Suivi des Stocks :**
   Intégration d'une fonctionnalité de suivi des stocks pour s'assurer que les articles nécessaires sont disponibles pour satisfaire les commandes.

6. **Rapports d'Analyse des Ventes :**
   Un module de génération de rapports offre aux utilisateurs la possibilité d'analyser les tendances de vente, les préférences des clients, et les performances des articles. Intégration d'une bibliothèque de reporting, telle que JasperReports ou Apache POI, pour la génération des rapports d'analyse des ventes.

## Stack Technique

- **Langage de Programmation :** Java
- **Frontend :** Thymeleaf pour les vues dynamiques
- **Backend :** Spring Core (IOC, DI), Spring MVC, Hibernate, Spring Data JPA
- **Gestion de Dépendances :** Apache Maven
- **Base de Données :** MySQL
- **Serveur d'Application :** Apache Tomcat
- **Gestion des Tâches :** [Remplacez par l'outil de votre choix]
- **Système de Gestion de Version :** Git et Github
- **Logging :** SLF4J (Simple Logging Facade for Java) pour la gestion des journaux

## Installation

1. Clonez le projet depuis GitHub :
   ```bash
   git clone https://github.com/votre-utilisateur/OrderCraft.git
