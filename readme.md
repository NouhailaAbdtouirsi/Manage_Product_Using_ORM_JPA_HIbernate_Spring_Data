# ORM JPA Hibernate Spring Data
<h2>Structure de projet : </h2>
<img src="Capture/capture1.png" alt="Structure du projet">
## Objectif
### Pre-requis : 
1. Installer IntelliJ Ultimate
2. Créer un projet Spring Initializer avec les dépendances JPA, H2, Spring Web et Lombock
## Etapes : 
3. Créer l'entité JPA Product ayant les attributs :
   - id de type Long
   - name de type String
   - price de type double
   - quantity de type int<br>
   
<img src="Capture/capture2.png" alt="Product">
4. Configurer l'unité de persistance dans le ficher application.properties
<img src="Capture/capture3.png" alt="application.properties">

5. Créer l'interface JPA Repository basée sur Spring data

<img src="Capture/capture4.png" alt="ProductRepository">
6. Tester quelques opérations de gestion de patients :
    - Ajouter des produits
    - Consulter tous les produits
    - Consulter un produit
    - Chercher des produits
    - Mettre à jour un produit
    - supprimer un produit
<img src="Capture/capture5.png" alt="ProductRepository">

7. Migrer de H2 Database vers MySQL
    - Ajouter la dépendance MySQL
<img src="Capture/capture7.png" alt="ProductRepository">
    - Configurer la base de données dans application.properties
<img src="Capture/capture6.png" alt="ProductRepository">
