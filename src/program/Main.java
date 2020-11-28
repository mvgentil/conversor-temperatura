package program;

import entities.ConversorController;
import entities.ConversorModel;
import entities.ConversorView;

public class Main {

	public static void main(String[] args) {
		
		ConversorView view = new ConversorView();
		ConversorModel model = new ConversorModel();
		
	    ConversorController controller = new ConversorController(model, view);
	    

	}

}
