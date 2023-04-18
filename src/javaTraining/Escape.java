package javaTraining;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Escape implements KeyListener {
    
	private JTextArea textArea = new JTextArea();

    public static void main(String[] args) {
        new Escape().start();
    }

    private void start() {
        JFrame frame = new JFrame();
        frame.add(textArea);
        frame.pack();
        frame.setVisible(true);
        textArea.addKeyListener(this);

        System.out.println("Digite um texto (pressione ESC para sair):");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == KeyEvent.VK_ESCAPE) {
            System.out.println("\nLeitura de texto interrompida!");
            System.out.println("Texto digitado:\n" + textArea.getText());
            System.exit(0);
        }
    }

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

}