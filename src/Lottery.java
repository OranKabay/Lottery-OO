import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lottery {

    static ArrayList<Piece> bigSeq = new ArrayList<Piece>();
    static ArrayList<Piece> lowSeq = new ArrayList<Piece>();

    static List<Integer> bigSeqVals = new ArrayList<Integer>();
    static List<Integer> lowSeqVals = new ArrayList<Integer>();

    static Set<Integer> bigSet;
    static Set<Integer> lowSet;

    public static void main(String[] args) throws Exception {

        for (int k = 0; k < 210; k++) {

            generateNum();

            bigSet = new HashSet<Integer>(bigSeqVals);
            lowSet = new HashSet<Integer>(lowSeqVals);

            if (bigSet.size() == bigSeqVals.size() 
            && lowSet.size() == lowSeqVals.size()) {

                Collections.sort(bigSeqVals);
                Collections.sort(lowSeqVals);
                System.out.println(bigSeqVals + " / " + lowSeqVals);
            } 
            else {
                Collections.sort(bigSeqVals);
                Collections.sort(lowSeqVals);
                System.out.println("DUPLICATE FOUND: " + bigSeqVals + " / " + lowSeqVals);
            }

            deinitialise();
        }

    }

    public static void generateNum() {

        for(int i = 0; i < 5; i++) {
            bigSeq.add(new Piece(50));
        }
        
        for(int j = 0; j < 2; j++) {
            lowSeq.add(new Piece(12));
        };

        for (Piece bigs : bigSeq) {
            bigSeqVals.add(bigs.get_val());
        }

        for (Piece lows : lowSeq) {
            lowSeqVals.add(lows.get_val());
        }

    }

    public static void deinitialise(){
        bigSeq.clear();
        bigSeqVals.clear();
        bigSet.clear();
        lowSeq.clear();
        lowSeqVals.clear();
        lowSet.clear();
    }
}