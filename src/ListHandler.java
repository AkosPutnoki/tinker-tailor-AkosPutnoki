import java.util.ArrayList;
import java.util.List;

public class ListHandler {
    public List<Integer> listGenerator(int length){
        List<Integer> original = new ArrayList<>();
        for (int i=1; i <= length; i++) {
            original.add(i);
        }
        return original;
    }

    public List<Integer> eliminator(int syllables, List<Integer> original){
        List<Integer> result = new ArrayList<>();

        while (original.size() > 0){
            int length = original.size();
            int removable =  syllables % length - 1;
            if (removable < 0){
                result.add(original.get(length - 1));
                original = reOrganize(length, original);
            } else {
                result.add(original.get(removable));
                original = reOrganize(removable, length, original);
            }
        }
        return result;
    }

    public List<Integer> reOrganize(int removable, int size, List<Integer> original) {
        List<Integer> temp = new ArrayList<>();
        for (int i = removable + 1; i < size; i++) {
            temp.add(original.get(i));
        }
        for (int i = 0; i < removable; i++) {
            temp.add(original.get(i));
        }

        return temp;
    }

    public List<Integer> reOrganize(int size, List<Integer> original){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < size - 1; i++){
            temp.add(original.get(i));
        }
        return temp;
    }
}
