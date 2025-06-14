import java.util.ArrayList; 
public class DataSet {

    private ArrayList<Double> data = new ArrayList<>();
    
    public DataSet(ArrayList<Double> d) {
        data = d;
        for (int i = 0; i < data.size() - 1; i++) {
            int indexOfMin = i;
            for(int j = i + 1; j < data.size(); j++) {
                if(data.get(j) < data.get(indexOfMin)) {
                   indexOfMin = j;
                }
            }
            double temp = data.get(i);
            data.set(i, data.get(indexOfMin));
            data.set(indexOfMin, temp);  
        }        
    }

    public double getMedian() {
        double median;
        if (data.size() % 2 == 0) {
            double mid1 = data.get(data.size()/2 - 1);
            double mid2 = data.get(data.size()/2);
            median = (mid1 + mid2)/2;
            return median;

        }
        median = data.get(data.size() / 2);
        return median;
    }

    public double getMode() {
        int count = 0;
        int maxCount = 0;
        double mode = 0;
        for (int i = 0; i < data.size(); i++) {
            count = 0;
            for(int j = 0; j < data.size(); j++) {
                if(data.get(j) == data.get(i)) {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count; 
                    mode = data.get(j);
                }
            }
            if (maxCount < 2) {
                return 0.0;
            }
        }
        return mode;
    }
}

