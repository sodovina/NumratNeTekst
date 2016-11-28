package bsk;

import java.text.DecimalFormat;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController extends Application {
	private TextArea ta = new TextArea();
	private Button button = new Button("Ekzekuto");
	private Stringjet s = new Stringjet();
	private final TextField tf = new TextField();
	private DecimalFormat d = new DecimalFormat(",000");

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) {
		Pane box = new Pane();
		box.getChildren().addAll(button, tf, ta);
		tf.setLayoutX(10);
		tf.setLayoutY(40);
		tf.setPrefSize(285, 50);
		tf.textProperty().addListener(new ChangeListener<String>() {
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				try {
					newValue = newValue.replace(",", "");
					long temp = new Long(newValue).longValue();
					if (temp <= 999) {
						tf.setText(newValue);
					} else {
						tf.setText(d.format(new Long(newValue).longValue()));
					}
				} catch (Exception e) {
					if (!newValue.matches("\\d*")) {
						tf.setText(newValue.replaceAll("[^\\d]", ""));
					}
				}
			}
		});
		tf.setPromptText("Shkruani nje numer te plote!");
		ta.setLayoutX(10);
		ta.setLayoutY(150);
		ta.setEditable(false);
		ta.setWrapText(true);
		ta.setPrefSize(285, 150);
		ta.setVisible(false);
		ta.setPromptText("Rezultati shfaqet ketu!");
		button.setLayoutX(10);
		button.setLayoutY(350);
		button.setPrefSize(285, 50);
		button.setOnAction(e -> {
			run();
			ta.setVisible(true);
		});
		Scene scene = new Scene(box, 300, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Kthe numrat ne tekst");
		primaryStage.setResizable(false);
		primaryStage.show();
	}

	private void run() {
		if (tf.getText() != null && !tf.getText().equals("")) {
			long numri = new Long(tf.getText().replaceAll(",", "")).longValue();
			ta.setText(s.merrStringun(numri));
		} else
			ta.setText("Shkruani nje numer ne fushen e numrave!");
	}
}