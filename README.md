# Template de projet pour le TP JPA 2021 UniR

1. Conception:
  
  Les classes : Fiche, FicheResquest, FicheBugs, KanbanBoard, Section, Utilisateur.
  
  Description:  un fiche peut avoir deux types ( request ou bugs ), 
   
   ### TP 2 to 4 ##########

1. Conception:
  
  * Les classes : Fiche, FicheResquest, FicheBugs, KanbanBoard, Section, Utilisateur.
  
  * Description:  
    
     . une Fiche peut avoir deux types ( request ou bugs ): Héritage
     . une Fiche doit être dans une section (en attente, en cours, ou réalisé): ManyToOne
     . KanbanBoard peut avoir plusieurs Fiches: OneToMany
     . KanbanBoard peut affceter à un ustilsateur: OneToMany

   * Les couches:
      
      . Trois couches: une pour business contient les entités, l'autre pour le Dao pour séparer le code métier code propre, et une couche de service.

2. Réalisation:

   * Nous avons créé l'entité de chaque classe.
   * Nous avons créé la classe Dao de chaque entité
   * Nous avons peuplé la base de données à partir d'une classe dans la couche de service on utilisant la methode Save des classes Dao
   * Nous avons créé des méthodes pour les requêtes dans les classes Dao
   * Nous avons utilisé ces méthodes dans la couche services

3. Problème de N+1 Select
   
   * N1select 
     . temps d'exectuion : 5920 ,  
     . requets:  5001
   * JoinFetch : 
     . temps d'exectuion : 1687
     . requets: 1
    
    JoinFetch est plus performantes par rapport N1select

### TP 5 ##########
    * Pour lancer le TP 5, nous avons ajouté dans le fichier pom.xml le package WAR et la dépendance de la Servlet.
    * Nous avons créé une couche de la Servlet
    * Nous avons inséré les resources statiques : Création du répertoire /src/amin/webapp et nous avons ajouté le fichier index.html dans ce répertoire.
    * Nous avons créé notre première Classe Servlet avec deux méthode : doGet et doPost
    * Nous avons créé un formulaire et une autre Classe Servlet UserInfo
  
