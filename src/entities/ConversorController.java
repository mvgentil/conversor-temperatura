package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorController {
	
	private ConversorView view;
	private ConversorModel model;
	
	
	public ConversorController (ConversorModel model, ConversorView view) {
		this.model = model;
		this.view = view;
		
		
	}
	
    public static void converter(){
    	//logica vai aqui
    }

    public void exibirTela(){
        view.setVisible(true);
    }

    private class ConverterListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            converter();
        }
    }

}
