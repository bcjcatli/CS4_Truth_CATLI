package ex4TruthCatli;
public class Singer {
    private String name, fave, petName, petColor;
    private int numOfPerf;
    private double earnings;
    private static int totalPerformances;
    
    public Singer(String n, int perf, double e, String f, String pN, String pC){
        name = n;
        numOfPerf = perf;
        earnings  = e;
        fave = f;
        petName = pN;
        petColor = pC;
        totalPerformances += numOfPerf;
    }
    public void changeFavSong(String newFave) {
        fave = newFave;
    }
    //displays all variables
    public void introduce() {
        System.out.printf("Singer %s has performed a %d total of times, and has %f money. Their favorite song is %s and their pet is a %s %s. %n ", name, numOfPerf, earnings, fave, petName, petColor);
    }
    public void performForAudience(int n) {
        System.out.printf("%s has performed for %d people%n", name, n);
        numOfPerf++;
        totalPerformances++;
        earnings += n*100;
    }
    public void incPerfNum() {
        numOfPerf++;
    }
    public void incEarn(int n) {
        double money = n*100;
        earnings += money/2;
    }
    public String name() {
        return name;
    }
    public void performForAudience(Singer a, int n) {
        String otherName = a.name();
        System.out.printf("%s and %s has performed for %d people%n", name, otherName, n);
        numOfPerf++;
        a.incPerfNum();
        totalPerformances += 2;
        incEarn(n);
        a.incEarn(n);
    }
    //changes pet name and color
    public void changePet(String n, String m) {
        System.out.printf("%s has changed their pet to a %s %s%n", name, n, m);
        petName = n;
        petColor = m;
    }
//    public void totalPerfIncr() {
//        totalPerformances++;
//    }
    public void totalPerfCount() {
        System.out.printf("Total number of performances: %d%n", totalPerformances);
    }
}
    

