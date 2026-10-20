
package builder;

public class Main {

    public static void main(String[] args) {
        ComputadorGamer gamer = new ComputadorGamer();
        ComputadorNormal normal = new ComputadorNormal();

        Computador computadorGamer = gamer.criar();
        Computador computadorNormal = normal.criar();

        System.out.println("=== Computador Gamer ===");
        System.out.println(computadorGamer);

        System.out.println("\n=== Computador Normal ===");
        System.out.println(computadorNormal);
    }
}
