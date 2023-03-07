
package backend;

import java.util.ArrayList;

/**
 *
 * @author leiner
 */
public class coin {
    private ArrayList<coin> changes = new ArrayList<coin>();
    private float value;
    private String name;

    public coin(float value, String name) {
        this.value = value;
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addchanges(coin newChange){
        changes.add(newChange);
    }
    public float findChanges(String name){
        float change = 0;
        for (int i =0;changes.size()>i;i++){
            if (changes.get(i).name == name){
                return change;
            }
        }
        return change;
    }
    
    
    
}
