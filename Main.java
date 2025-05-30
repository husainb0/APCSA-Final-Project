import java.util.ArrayList; 
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Double> test = new ArrayList<>();
        test.add(5.0);
        test.add(3.0);
        test.add(13.0);
        test.add(12.0);
        test.add(9.0);
        test.add(4.0);
        DataSet d = new DataSet(test); 
        System.out.println(test);
        System.out.println(d.getMedian());

    }
}

