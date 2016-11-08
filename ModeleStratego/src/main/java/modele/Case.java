package modele;

/**
 * Created by Axel on 04/11/2016.
 */
public class Case {
    private int x;
    private int y;
    private boolean caseAccessible;
    private Piece unePiece;

    /*constructeur*/
    public Case(int x, int y, boolean caseAccessible, Piece unePiece) {
        this.x = x;
        this.y = y;
        this.caseAccessible = caseAccessible;
        this.unePiece = unePiece;
    }

    public Case(int x, int y, boolean caseAccessible) {
        this.x = x;
        this.y = y;
        this.caseAccessible = caseAccessible;
        this.unePiece = null;
    }

    /*getters&setters*/
    public boolean isCaseAccessible() {
        return caseAccessible;
    }

    public void setCaseAccessible(boolean caseAccessible) {
        this.caseAccessible = caseAccessible;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piece getUnePiece() {
        return unePiece;
    }

    public void setUnePiece(Piece unePiece) {
        this.unePiece = unePiece;
    }

    /*méthode*/
    public boolean estOccupe(){
        if(this.unePiece != null)
            return true;
        else
            return false;
    }


}

