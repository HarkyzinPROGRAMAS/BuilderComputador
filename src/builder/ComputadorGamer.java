
package builder;

public class ComputadorGamer {

    public Computador criar() {
        return new Computador.ComputadorBuilder()
                .placavideo("RTX 4070")
                .processador("AMD Ryzen 7")
                .memram("32 GB")
                .hd(false)
                .ssd(true)
                .build();
    }
}
