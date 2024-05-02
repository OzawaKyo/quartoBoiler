package quarto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {
    private JButton btnPlayerVsPlayer;
    private JButton btnPlayerVsAI;
    private JButton btnLoad;
    private JButton btnMusic;
    private JButton btnDarkMode;
    private JButton btnLanguage;
    private JButton btnManual;
    private JButton btnQuit;

    public MainMenu(ActionListener actionListener) {
        setLayout(new BorderLayout());

        // Navbar avec des icônes de fonctionnalités
        JPanel navbar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnMusic = new JButton("Music");
        btnDarkMode = new JButton("Dark Mode");
        btnLanguage = new JButton("Language");
        btnManual = new JButton("Manual");
        btnQuit = new JButton("Quit");

        navbar.add(btnMusic);
        navbar.add(btnDarkMode);
        navbar.add(btnLanguage);
        navbar.add(btnManual);
        navbar.add(btnQuit);

        // Menu avec titre et boutons
        JPanel menu = new JPanel();
        menu.setLayout(new BoxLayout(menu, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("Quarto");
        title.setFont(new Font("Serif", Font.BOLD, 24));
        menu.add(title);

        btnPlayerVsPlayer = new JButton("Player vs Player");
        btnPlayerVsAI = new JButton("Player vs AI");
        btnLoad = new JButton("Load");

        menu.add(btnPlayerVsPlayer);
        menu.add(btnPlayerVsAI);
        menu.add(btnLoad);

        add(navbar, BorderLayout.NORTH);
        add(menu, BorderLayout.CENTER);

        // Ajout des action listeners
        btnPlayerVsPlayer.addActionListener(actionListener);
        btnPlayerVsAI.addActionListener(actionListener);
        btnLoad.addActionListener(actionListener);
        btnQuit.addActionListener(actionListener);
    }

    public void addNavbarActionListener(ActionListener actionListener) {
        btnMusic.addActionListener(actionListener);
        btnDarkMode.addActionListener(actionListener);
        btnLanguage.addActionListener(actionListener);
        btnManual.addActionListener(actionListener);
    }
}
