package pokemon;
public class WaterType extends Monster {
  public WaterType(String n, int maxHealth, int baseValues) {
    super(n, "water", "fire", "grass", maxHealth, baseValues);
    atk *= 0.7;
    def *= 1.3;
  }
  @Override
    public void special(){
        def += 2;
        hp -= maxHP*0.10;
        System.out.println(name + " used its special increasing its defence by 2 and reducing its health to " + hp);
    }
}