
package builder;

public class Computador {
    private String placavideo;
    private String processador;
    private String memram;
    private Boolean hd;
    private Boolean ssd;

    private Computador(ComputadorBuilder builder) {
        this.placavideo = builder.placavideo;
        this.processador = builder.processador;
        this.memram = builder.memram;
        this.hd = builder.hd;
        this.ssd = builder.ssd;
    }

    public static class ComputadorBuilder {
        private String placavideo;
        private String processador;
        private String memram;
        private Boolean hd;
        private Boolean ssd;

        public ComputadorBuilder placavideo(String placavideo) {
            this.placavideo = placavideo;
            return this;
        }

        public ComputadorBuilder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public ComputadorBuilder memram(String memram) {
            this.memram = memram;
            return this;
        }

        public ComputadorBuilder hd(Boolean hd) {
            this.hd = hd;
            return this;
        }

        public ComputadorBuilder ssd(Boolean ssd) {
            this.ssd = ssd;
            return this;
        }

        public Computador build() {
            return new Computador(this);
        }
    }

    @Override
    public String toString() {
        return "Computador{" +
                "placavideo='" + placavideo + '\'' +
                ", processador='" + processador + '\'' +
                ", memram='" + memram + '\'' +
                ", hd=" + hd +
                ", ssd=" + ssd +
                '}';
    }
}
