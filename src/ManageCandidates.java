import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ManageCandidates {
    Map<Integer, Candidates> list = new TreeMap();
    Set<Integer> keyList = list.keySet();

    public void addNew(int identificationNumber, Candidates candidates) {
        list.put(identificationNumber, candidates);
    }

    public void displayAll() {
        for (Integer key : keyList) {
            Candidates candidates = list.get(key);
            if (candidates instanceof BlockA) {
                BlockA blockA = (BlockA) candidates;
                System.out.println(blockA.toString());
            }
            if (candidates instanceof BlockB) {
                BlockB blockB = (BlockB) candidates;
                System.out.println(blockB.toString());
            }
            if (candidates instanceof BlockC){
                BlockC blockC= (BlockC) candidates;
                System.out.println(blockC.toString());
            }
        }
    }
    public void testIdentificationNumber(Integer identificationNumber){
        for (Integer k :keyList) {
            if (identificationNumber==list.get(k).getIdentificationNumber()){
                System.out.println(list.get(k));
                return;
            }
        }
    }
}
