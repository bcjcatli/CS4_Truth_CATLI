class Main {
  public static void main(String[] args) {
    //names of the characters
    String name_1 = "Juan de la Cruise";
    String name_2 = "Pepe Cater Pillar";
    String name_3 = "Rico Astlito";

    //their current money
    int money_1 = 2000;
    int money_2 = 2500;
    int money_3 = 3500;

    //their grade
    double grade_1 = 95.3;
    double grade_2 = 84.4;
    double grade_3 = 99.69;

    //Juan
    System.out.println(name_1);
    System.out.println(money_1);
    System.out.println(grade_1);

    System.out.println();

    //Pepe
    System.out.println(name_2);
    System.out.println(money_2);
    System.out.println(grade_2);

    System.out.println();

    //Rico
    System.out.println(name_3);
    System.out.println(money_3);
    System.out.println(grade_3);

    System.out.println();
    
    //outputs
    System.out.println("Total money: " + (money_1+money_2+ money_3));
    System.out.println("Average grade: " + ((grade_1+grade_2+grade_3)/3));
    System.out.println("Characters Juan and Pepe have the same grade: " + (grade_1 == grade_2));
    
    
  }
}