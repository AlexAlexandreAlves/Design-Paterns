import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null);
        
        Logistica transporte = LogisticaFactory.getTransporte(1);
        transporte.alterar(texto);

       
    }
}
