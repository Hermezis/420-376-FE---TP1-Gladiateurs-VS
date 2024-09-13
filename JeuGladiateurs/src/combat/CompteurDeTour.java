package combat;

public class CompteurDeTour {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    // TODO : Mettre vos attributs ici
    public int cptrTour;
    // </editor-fold>
    
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public CompteurDeTour() {
        // TODO : Constructeur SANS paramÃ¨tres qui initialise un compteur de tour (attribut) Ã  1
        this.cptrTour=1;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    // TODO : Le getter
    public int getCptrTour() {    
        return cptrTour;
    }

    // TODO : Le setter
    public void setCptrTour(int cptrTour) {    
        this.cptrTour = cptrTour;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="MÃ©canique de jeu">
    public void augmenteTour() {
        // TODO : IncrÃ©menter le compteur de tour
        this.cptrTour++;
    }

    public void afficheTour() {
        // TODO : Afficher le tour actuel, tel que montrÃ© dans l'Ã©noncÃ©
        System.out.println("---------------\nTOUR ACTUEL: "+cptrTour+"\n---------------");
    }
    // </editor-fold>
}
