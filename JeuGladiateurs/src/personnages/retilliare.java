
package personnages;

import java.util.Random;

/**
 *
 * @author 201633534
 */
public class retilliare extends Personnage{

  String classe="retilliare";
  boolean filet =true;

    public retilliare(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }
    @Override
   public void afficherInfosPersonnage() {
        // TODO : Afficher les infos du personnage, tel que montré dans l'énoncé
        System.out.println("\n"+nom+"\n"+classe+"\n\tAttaque : "+valeurMaxAttaque+"\n\tDéfense : "+valeurDefense+"\n\tPoints de vie : "+pointsDeVie+"\n\tInitiative : "+initiative);
        if (pointsDeVie<=0) {
        System.out.println("\tStatut: Mort");
        }
        else {
          System.out.println("\tStatut: Vivant");    
        }
            
        }
     private int filetCalcul() {
        // TODO : Retourner la valeur de l'attaque du personnage.
        // Cette valeur est trouvée aléatoirement et doit se situer entre ZÉRO et valeurMaxAttaque.
        Random rand= new Random();
        int attraper;
        attraper=rand.nextInt(100 - 0)+1;
        return attraper;
    }
  
}
