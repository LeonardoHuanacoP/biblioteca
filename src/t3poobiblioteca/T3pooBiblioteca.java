/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3poobiblioteca;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class T3pooBiblioteca {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Pantallabiblioeca ventana = new Pantallabiblioeca();
            ventana.setVisible(true);
        });
    }
}

class Pantallabiblioeca extends JFrame {

    public Pantallabiblioeca() {
       //ventana
        setTitle("Registrar Libros");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        // Código
        JLabel labelCodigo = new JLabel("Código");
        labelCodigo.setBounds(50, 30, 50, 25);
        JTextField textCodigo = new JTextField();
        textCodigo.setBounds(100, 30, 100, 25);
        
        //  Título
        JLabel labelTitulo = new JLabel("Título");
        labelTitulo.setBounds(250, 30, 50, 25);
        JTextField textTitulo = new JTextField();
        textTitulo.setBounds(300, 30, 200, 25);
        
        // Autor
        JLabel labelAutor = new JLabel("Autor");
        labelAutor.setBounds(50, 70, 50, 25);
        JTextField textAutor = new JTextField();
        textAutor.setBounds(100, 70, 200, 25);
        
        // Cantidad
        JLabel labelCantidad = new JLabel("Cantidad");
        labelCantidad.setBounds(350, 70, 60, 25);
        JTextField textCantidad = new JTextField();
        textCantidad.setBounds(420, 70, 80, 25);
        
        // Lista 
        JList<String> listLibros = new JList<>(new DefaultListModel<>());
        JScrollPane scrollPane = new JScrollPane(listLibros);
        scrollPane.setBounds(50, 120, 500, 200);
        
        
        panel.add(labelCodigo);
        panel.add(textCodigo);
        panel.add(labelTitulo);
        panel.add(textTitulo);
        panel.add(labelAutor);
        panel.add(textAutor);
        panel.add(labelCantidad);
        panel.add(textCantidad);
        panel.add(scrollPane);
        
        
        add(panel);
    }
}