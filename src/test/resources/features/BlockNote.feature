# language: fr
@BlockNote
Fonctionnalité: Ecrire dans block note
	@testok
	Scénario: Ouvrir, écrire et vérifier le fichier block note
		Étant donné que je clique sur images/icone.png
		Et que je tape tutu
		Alors cette image images/result.png représente mon résultat

	@testko
	Scénario: Erreur
		Étant donné que je tape tatata
		Alors cette image images/result.png représente mon résultat