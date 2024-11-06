package example;
/**
 * Ma class d'exemple.
 */
public class Exemple {
    /**
     * Attribut t.
     */
    private final String t;
    /**
     * Attribut v.
     */
    private int v;

    /**
     * Constructeur.
     * @param tValue
     */
    public Exemple(final String tValue) {
        this.t = tValue;
    }

    /**
     * @return la valeur de v
     */
    public int getV() {
        return this.v;
    }

    /**
     * @param newV
     */
    public void setV(final int newV) {
        this.v = newV;
    }

    /**
     * @return t si v est positif
     */
    public final String getT() {
        if (this.v > 0) {
            return this.t;
        }
        return null;
    }
}
