import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class LocalDateClass {
    private ArrayList<LocalDate> obj = new ArrayList<>();

    public void insereData(LocalDate data){
        obj.add(data);
    }

    public LocalDate dataMaisProxima(LocalDate data){
        long shortestDiff = Math.abs(DAYS.between(data, this.obj.get(0)));
        LocalDate closestDate = this.obj.get(0);
        for(int i = 0; i < obj.size(); i++) {
            LocalDate dataX = this.obj.get(i);
            long daysBetween = Math.abs(DAYS.between(data, dataX));
            if(daysBetween < shortestDiff) {
                closestDate = dataX;
                shortestDiff = daysBetween;
            }
        }
        return closestDate;
    }

    

}
