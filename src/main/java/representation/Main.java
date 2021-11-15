package representation;

public class Main {

    public static void main(String[] args) {
        ZoneGeographique occitanie = new ZoneGeographique(1, "Occitanie");
        occitanie.setIndemniteRepas(200.00f);

        Representant r = new Representant(36, "Bastide", "Rémi", occitanie);

        r.setSalaireFixe(667f);


        r.enregistrerCA(0, 10000.00f);

        float salaire = 3 * r.salaireMensuel(0, 0.1f);

        // printf, voir :
        // http://alvinalexander.com/programming/printf-format-cheat-sheet
        System.out.printf("Le représentant %s a gagné %.2f € pour le mois n° %d %n", r, salaire, 0);

    }

}

// Attention attention grosse modif' en cours la
// Pas ouf la modif

