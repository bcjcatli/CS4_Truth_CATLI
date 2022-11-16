package pokemon;
public class GrassType extends Monster {
  public GrassType(String n, int maxHealth, int baseValues) {
    super(n, "grass", "water", "firerass", maxHealth, baseValues);
  }
  @Override
    public void restoreHealth(){
        hp += maxHP*0.20;
        System.out.println(name + " used rest and healed back up to " + hp);
    }
    public void special(){
        hp += maxHP*0.20;
        System.out.println(name + " used its special and increased its health to " + hp);
    }
}
