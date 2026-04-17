import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {
    ArrayList<Integer> data = new ArrayList<>(); 
    public RandomizedSet() {
        
        
    }
    
    public boolean insert(int val) {
        if (data.contains(val)) return false;
        return data.add(val);
    }
    
    public boolean remove(int val) {
        return data.remove((Integer) val);

    }
    
    public int getRandom() {
        Random rand = new Random();
        if(data.size() == 0) return 0;
        return data.get(rand.nextInt(data.size()));
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println("Res : " + obj.insert(1));
        System.out.println("Res : " + obj.remove(2));
        System.out.println("Res : " + obj.insert(2));
        System.out.println("Res : " + obj.getRandom());
        System.out.println("Res : " + obj.remove(1));
        System.out.println("Res : " + obj.insert(2));
        System.out.println("Res : " + obj.getRandom());
    }
}


/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */