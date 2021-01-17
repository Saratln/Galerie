-- Initialisation spécifiques pour un jeu de test

INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');

INSERT INTO Exposition(id, debut, intitule, duree, organisateur) VALUES (10,'2010-12-12','L\''art brut comptemporain', organisateur = GalerieRepository.getOne(1);

INSERT INTO Tableau(id, title, support, largeur, hauteur, auteur) VALUES (100, 'New York Streets', 'huile sur toile', 15, 48, auteur = PersonneRepository.getOne(111);

INSERT INTO Artiste(id, biographie) VALUES (111, 'Peintre New Yorkais');

INSERT INTO Personne(id, nom, adresse) VALUES (110, 'Remi Bastide', 'ISIS Castres');
INSERT INTO Personne(id, nom, adresse) VALUES (111, 'Basquiat', 'Cimetière Père Lachaise');

INSERT INTO Transaction(id, venduLe, prixVente, lieuDeVente, client, oeuvre) VALUES (1000, '2010-01-01', 0.0, lieuDeVente = ExpositionRepository.getOne(10), client = PersonneRepository.getOne(110), oeuvre = TableauRepository.getOne(100);
