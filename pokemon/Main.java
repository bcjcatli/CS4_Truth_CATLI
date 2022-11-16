package pokemon;
public class Main {

    public static void main(String[] args) {
        WaterType pen = new WaterType("Pen", 35, 25);
        FireType wafi = new FireType("Wafi", 30, 30);
        GrassType potato = new GrassType("Potato", 40, 20);
        
        //grass vs fire
        System.out.println("Potato (Grass) vs Wafi (Fire)");
        boolean done = false;
        while (!done) {
            potato.attack(wafi);
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
            wafi.attack(potato);
            if (potato.getHP() <=0 || wafi.getHP() <=0) {
                done = true;
                break;
            }
            potato.restoreHealth();
            wafi.restoreHealth();
            potato.special();
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
            wafi.special();
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
        }
        
        pen.revive();
        potato.revive();
        wafi.revive();
        //fire vs water
        done = false;
        System.out.println("");
        System.out.println("Wafi (Fire) vs Pen (Water)");
        while (!done) {
            wafi.attack(pen);
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
            pen.attack(wafi);
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
            wafi.restoreHealth();
            pen.restoreHealth();
            wafi.special();
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
            pen.special();
            if (wafi.getHP() <=0 || pen.getHP() <=0) {
                done = true;
                break;
            }
    }
        pen.revive();
        potato.revive();
        wafi.revive();
        //water vs grass
        done = false;
        System.out.println("");
        System.out.println("Pen (Water) vs Potato (Grass)");
        while (!done) {
            pen.attack(potato);
            if (pen.getHP() <=0 || potato.getHP() <=0) {
                done = true;
                break;
            }
            potato.attack(pen);
            if (pen.getHP() <=0 || potato.getHP() <=0) {
                done = true;
                break;
            }
            pen.restoreHealth();
            potato.restoreHealth();
            pen.special();
            if (pen.getHP() <=0 || potato.getHP() <=0) {
                done = true;
                break;
            }
            potato.special();
            if (pen.getHP() <=0 || potato.getHP() <=0) {
                done = true;
                break;
            }
    }
    }
}
