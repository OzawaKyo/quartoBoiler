package quarto;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Utilisation de SwingUtilities.invokeLater pour assurer que l'interface est
        // créée sur le fil d'événements
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame(); // Crée et affiche la fenêtre principale
            }
        });
    }
}
