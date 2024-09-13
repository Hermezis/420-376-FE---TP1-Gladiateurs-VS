package personnages;

/**
 *
 * @author 201633534
 */
public class mirmillion extends Personnage {

    String classe = "mirmillion";

    public mirmillion(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    @Override
    public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println("\n" + nom + "\n" + classe + "\n\tAttaque : " + valeurMaxAttaque + "\n\tDéfense : " + valeurDefense + "\n\tPoints de vie : " + pointsDeVie + "\n\tInitiative : " + initiative);
        if (pointsDeVie <= 0) {
            System.out.println("\tStatut: Mort");
        } else {
            System.out.println("\tStatut: Vivant");
        }

    }

    @Override
    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
        this.initiative = (int) (Math.random() * 31);
    }

    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);
        if (personnageCible.pointsDeVie < 1) {
            System.out.println("Bob decapite sont adversaire");
        } else {
            super.frapperPersonnage(personnageCible);
        }
    }
}
