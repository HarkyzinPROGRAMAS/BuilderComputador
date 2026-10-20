
package builder;

public class ComputadorNormal {

    public Computador criar() {
        return new Computador.ComputadorBuilder()
                .placavideo("Gráficos integrados")
                .processador("Intel Core i3")
                .memram("8 GB")
                .hd(true)
                .ssd(false)
                .build();
    }
}
