
package beispielsuchbaum;

/**
 *
 * @author Fabian
 */
public class BeispielSuchbaum {
    private BinarySearchTree<Zahleninhalt> zahlenbaum;

    public BeispielSuchbaum() {
        zahlenbaum = new BinarySearchTree<Zahleninhalt> ();
    }

    public BinarySearchTree<Zahleninhalt> getZahlenbaum() {
        return zahlenbaum;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BeispielSuchbaum test = new BeispielSuchbaum ();
        test.fuelle();
        System.out.println(test.getZahlenbaum().getContent().getZahl());
        int x = test.groessteZahlSuchen();
        System.out.println(x);
    }
    public void fuelle(){
        for ( int i =0; i<10;i++){
            int zufall = (int) (Math.random() * 100 + 1);
            Zahleninhalt neu = new Zahleninhalt (zufall);
            zahlenbaum.insert(neu);
        }
    }
    public List<Zahleninhalt> fuegeHinzu (List<Zahleninhalt> eingabe, int zahl){
        Zahleninhalt neu = new Zahleninhalt (zahl);
        Zahleninhalt ergebnis= zahlenbaum.search(neu);
        if (ergebnis == null) {
            return eingabe;
        } else {
            eingabe.append(ergebnis);
        }
        return eingabe;
    }
    public int groessteZahlSuchen () {
        if (zahlenbaum== null || zahlenbaum.isEmpty()) return -1;
        while (!zahlenbaum.getRightTree().isEmpty()){
            zahlenbaum = zahlenbaum.getRightTree();
        }
        return zahlenbaum.getContent().getZahl();
    }
   
    
}
