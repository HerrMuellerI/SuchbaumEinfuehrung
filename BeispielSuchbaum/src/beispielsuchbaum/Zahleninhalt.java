
package beispielsuchbaum;

/**
 *
 * @author Fabian
 */
public class Zahleninhalt implements ComparableContent<Zahleninhalt>{
    private int zahl;

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public Zahleninhalt(int zahl) {
        this.zahl = zahl;
    }
    
    @Override
    public boolean isGreater(Zahleninhalt pContent) {
        if (this.zahl > pContent.getZahl()) {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean isEqual(Zahleninhalt pContent) {
      return ( this.zahl == pContent.getZahl());
    }

    @Override
    public boolean isLess(Zahleninhalt pContent) {
        return ( this.zahl < pContent.getZahl());
    }
   
    
}
