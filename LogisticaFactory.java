public class LogisticaFactory {
    public static Logistica getTransporte(int i) {
        if (i == 1) {
            return new Caminhao();

        } else if (i == 2) {
            return new Navio();
        } else {
            return null;
        }
    }

}
