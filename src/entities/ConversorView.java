package entities;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorView extends JFrame{

	private static final long serialVersionUID = 1L;

	private JLabel statusLabel;

	public ConversorView() {
		initView();
	}
	
	private void initView() {
		
		setTitle("Conversor de temperatura");
		setSize(800,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		String temperaturas[] = {"Celsius", "Kelvin", "Farenheit"};
		
		JPanel root = new JPanel();
		
		root.setLayout(null);
		
		root.setBackground(Color.decode("#FFFFFF"));
		
		//inicia aqui
		
		ImageIcon logoImg = new ImageIcon("assets/img/logoConversor.png");
		
		JLabel logoImgLabel = new JLabel(logoImg);
		logoImgLabel.setBounds(100, 100, 128, 128);
		
		JLabel conversorDeTemperatura = new JLabel("Conversor de temperaturas");
		conversorDeTemperatura.setBounds(305, 100, 300, 30);
		
		
		//Campo da temperatura inicial
		JLabel temperaturaInicialLabel = new JLabel("Temperatura Inicial");
		temperaturaInicialLabel.setBounds(250, 284, 180, 20);
		
		JTextField temperaturaInicialTextField = new JTextField(50);
		temperaturaInicialTextField.setBounds(250, 304, 120, 30);
		
		
		JComboBox listaTemperaturasInicial = new JComboBox(temperaturas);
		listaTemperaturasInicial.setBounds(250, 334, 120, 60);
		
		//Fim
		
		JLabel simboloIgual = new JLabel("=");
		simboloIgual.setBounds(380, 310, 10, 10);
	
		//Campo da temperatura convertida
		JLabel temperaturaConvertidaLabel = new JLabel("Temperatura Convertida");
		temperaturaConvertidaLabel.setBounds(400, 284, 180, 20);
		
		JTextField temperaturaConvertidaTextField = new JTextField(50);
		temperaturaConvertidaTextField.setBounds(400, 304, 120, 30);
		
	    //public void setResultado(double resultado){
	    //	temperaturaConvertidaTextField.setText(String.format("%.8f",resultado));
	    //}
		
		JComboBox listaTemperaturasConvertida = new JComboBox(temperaturas);
		listaTemperaturasConvertida.setBounds(400, 334, 120, 60);
		//Fim
		
		int indexInicial = listaTemperaturasInicial.getSelectedIndex();
		int indexConvertida = listaTemperaturasConvertida.getSelectedIndex();
		

		//Botao converter
        JButton converterTemperaturaButton = new JButton("CONVERTER");
        converterTemperaturaButton.setBounds(304, 199, 192, 50);
        // Adiciona um listener no botao
        // para capturar o click
        converterTemperaturaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
                temperaturaConvertidaTextField.setText("");

            }
        });
        //Fim
        
        statusLabel = new JLabel("");
        statusLabel.setBounds(450, 560, 300, 30);
		
		//adicionar elementos no jpanel
		
		root.add(logoImgLabel);
		root.add(conversorDeTemperatura);
		root.add(temperaturaInicialLabel);
		root.add(converterTemperaturaButton);
		root.add(simboloIgual);
		root.add(temperaturaInicialTextField);
		root.add(temperaturaConvertidaLabel);
		root.add(temperaturaConvertidaTextField);
		root.add(listaTemperaturasInicial);
		root.add(listaTemperaturasConvertida);
		
		root.add(statusLabel);
		
		setContentPane(root);
		
		setVisible(true);
	}

}

