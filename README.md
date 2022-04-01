# Template de projet pour le TP JPA 2021 UniR

1. Conception:
  
  les classes : Fiche, FicheResquest, FicheBugs, KanbanBoard, Section, Utilisateur.
  
  description:  un fiche peut avoir deux types ( request ou bugs ), 
   
   ### TP 2 to 4 ##########

1. Conception:
  
  * les classes : Fiche, FicheResquest, FicheBugs, KanbanBoard, Section, Utilisateur.
  
  * description:  
    
     . un fiche peut avoir deux types ( request ou bugs ): Heritage
     . un fiche doit etre dans une section(en attente, en cours, ou réalisé): ManyToOne
     . KanbanBoard peut avoir plusieurs fiches: OneToMany
     . KanbanBoard peut affceter à un ustilsateur: OneToMany

   * les couches:
      
      . trois couches: une pour business contient les entities, l'autre pour le Dao pour séparer le code métier code propres, et une choucge de service.

2. Realisation:

   * nous avons cré l'entité de chaque classe.
   * nous avons cré la classe Dao de chaque entité
   * nous avons peuplé la base données à partir une classe dans la couche de service on utilisant la methode save des classes Dao
   * nous avons cré des methodes pour les requetes dans les classes Dao
   * nous avons utilisé ces methodes dans la couche services

3. problème de N+1 Select
   
   * N1select 
     . temps d'exectuion : 5920 ,  
     . requets:  5001
   * JoinFetch : 
     . temps d'exectuion : 1687
     . requets: 1
    
    JoinFetch est plus performantes par rapport N1select
