/* attempting to learn object formation in java */

class Pokemon{
    String name;
    int level;
}
public class pokemonClass{
    public static void main(String[] args){
        Pokemon pik = new Pokemon();
        pik.name = "Pikachu";
        pik.level=01;
        System.out.println(pik.name + " ATTACK!");

        Pokemon pik2 = new Pokemon();
        pik.name = "Togepi";
        System.out.println("CUTIE " + pik.name);
    }
}