package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyController {
	private boolean isNumber;
	@FXML
	private TextField numA;
	@FXML
	private TextField numB;
	@FXML
	private Button borrar;
	@FXML
	private Button suma;
	@FXML
	private Button resta;
	@FXML
	private Button multi;

	@FXML
	private TextField result;
	@FXML
	private Label aviso;

	@FXML
	public void initialize() {
		// TODO(don't really need to do anything here).
	}

	// When user click on myButtonthis method will be called.
	public void borrar(ActionEvent event) {
		result.setText("");
		numA.setText("");
		numB.setText("");
		aviso.setText("");
	}

	public void suma(ActionEvent event) {
		if (numA.getText().isEmpty() || numB.getText().isEmpty()) {
			aviso.setText("Revisa si has indicado los 2 números.");
		} else {
			double res = Double.parseDouble(numA.getText()) + Double.parseDouble(numB.getText());
			result.setText(Double.toString(res));
			aviso.setText("");
		}

	}

	public void resta(ActionEvent event) {
		if (numA.getText().isEmpty() || numB.getText().isEmpty()) {
			aviso.setText("Revisa si has indicado los 2 números.");
		} else {
			double res = Double.parseDouble(numA.getText()) - Double.parseDouble(numB.getText());
			result.setText(Double.toString(res));
			aviso.setText("");
		}
	}

	public void multi(ActionEvent event) {

		if (numA.getText().isEmpty() || numB.getText().isEmpty()) {
			aviso.setText("Revisa si has indicado los 2 números.");
		}

		else {
			double res = Double.parseDouble(numA.getText()) * Double.parseDouble(numB.getText());
			result.setText(Double.toString(res));
			aviso.setText("");
		}
	}
}
