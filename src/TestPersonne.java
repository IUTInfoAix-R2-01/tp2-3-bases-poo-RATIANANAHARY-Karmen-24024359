public class TestPersonne {
    public static void main(String[] args) {
        // Création d'un objet "Agostinelli" "Laurence"
        Personne p1 = new Personne("Agostinelli", "Laurence");

        // Affiche l'objet avec la méthode toString()
        System.out.println(p1); // Appel de toString()

        // Affichage de nom et prénom
        System.out.println("Nom : " + p1.getNom());
        System.out.println("Prénom : " + p1.getPrenom());
    }
}
