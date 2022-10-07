public class Pizza {
    public double calcDiff (double smDiam, double bgDiam){
        double smArea = Math.PI * (smDiam/2)* (smDiam/2);
        double smCalories = smArea*40;

        double bgArea = Math.PI *(bgDiam/2) * (bgDiam/2);
        double bgCalories = bgArea*40;

        return bgCalories-smCalories;
    }
}
