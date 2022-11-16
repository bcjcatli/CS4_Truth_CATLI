package pokemon;
public class FireType extends Monster {
  public FireType(String n, int maxHealth, int baseValues) {
    super(n, "fire", "grass", "water", maxHealth, baseValues);
    atk *= 1.3;
    def *= 0.7;
  }
  @Override
    public void special(){
        atk += 2;
        hp -= maxHP*0.10;
        System.out.println(name + " used its special increasing its damage by 2 and reducing its health to " + hp);
    }
}