package lab1;
import java.util.ArrayList;


public class FractionsArray {
    protected ArrayList<Fraction> arrays;

    public FractionsArray(){
        arrays = new ArrayList<>();
    }
    public FractionsArray(int size){
        arrays = new ArrayList<>(size);
    }
    public FractionsArray(Fraction... a){
        arrays = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            arrays.add(a[i]);
        }
    }
    public void add(Fraction a){
        arrays.add(a);
    }
    public void remove(int index){
        if(index < arrays.size()) {
            arrays.remove(index);
        }
    }
    public Fraction get(int index){
        if(index < arrays.size()){
            return arrays.get(index);
        }
        return null;
    }
}