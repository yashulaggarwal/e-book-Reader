package ebookReader;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * <p> Title: UserInterface Class. </p>
 * 
 * <p> Description: The Java/FX-based user interface for the ebook reader. The class works with String
 * objects and passes work to other classes to deal with all other aspects of the computation.</p>
 * 
 * <p> Copyright: Yashul and Ujjwal  � 2018 </p>
 * 
 * @author  Yashul and Ujjwal
 * 
 *  */

public class UserInterface {

	/**********************************************************************************************

	Attributes

	 **********************************************************************************************/

	/* Constants used to parameterize the graphical user interface.  We do not use a layout manager for
	   this application. Rather we manually control the location of each graphical element for exact
	   control of the look and feel. */

	// These are the application values required by the user interface
	private Label label_ebookReader = new Label("E-Book Reader");
	private Label label_Options = new Label("\u007C");
	private Button button_Login = new Button("Login");
	private Button button_Register = new Button("Register");
	private Button button_Cart = new Button("Cart");
	private Button button_Library = new Button("My Library");
	private TextField text_Search = new TextField();
	private String[] genre = { "Romance", "Science-Fiction","Action", "Adventure", "Thriller",
			"History","Biography","Comics","Drama","Horror","Mystery", "Genre"};
	private ComboBox<String> cmbox_genre = new ComboBox<String>();
	 
	public UserInterface(Pane theRoot, Stage thePrimaryStage) {
		// Label theScene with the name of the ebbok reader, centered at the top of the pane
		setupLabelUI(label_ebookReader, "Arial", 24, Reader.WINDOW_WIDTH, Pos.CENTER, 0, 5);
		
		setupLabelUI(label_Options, "Arial", 18, Reader.WINDOW_WIDTH-10, Pos.BASELINE_LEFT, 690, 70);
		
		setupButtonUI(button_Login, "Arial", 14, 30, Pos.CENTER, 630, 70);
				
		setupButtonUI(button_Cart, "Arial", 14, 70, Pos.CENTER, 810, 70);
				
		setupButtonUI(button_Library, "Arial", 14, 70, Pos.CENTER, 10, 70);
				
		setupButtonUI(button_Register, "Arial", 14, 70, Pos.CENTER, 700, 70);
				
		setupTextUI(text_Search, "Arial", 16, 260, Pos.BASELINE_LEFT, 300, 70, true);
		
		// Setting up combobox for selecting the genres 
		cmbox_genre.setLayoutX(130); cmbox_genre.setLayoutY(71);
				
		for(int i = 0; i < genre.length; i++) {
			cmbox_genre.getItems().add(genre[i]);
			}

		cmbox_genre.getSelectionModel().select(genre.length-1);;

		// Place all of the just-initialized GUI elements into the pane
		theRoot.getChildren().addAll(label_ebookReader, label_Options, button_Login, button_Register, text_Search, cmbox_genre,
				button_Library, button_Cart);
	}

	
	/**********
	 * Private local method to initialize the standard fields for a label
	 */
	private void setupLabelUI(Label l, String ff, double f, double w, Pos p, double x, double y){
		l.setFont(Font.font(ff, f));
		l.setMinWidth(w);
		l.setAlignment(p);
		l.setLayoutX(x);
		l.setLayoutY(y);		
	}

	/**********
	 * Private local method to initialize the standard fields for a text field
	 */
	private void setupTextUI(TextField t, String ff, double f, double w, Pos p, double x, double y, boolean e){
		t.setFont(Font.font(ff, f));
		t.setMinWidth(w);
		t.setMaxWidth(w);
		t.setAlignment(p);
		t.setLayoutX(x);
		t.setLayoutY(y);		
		t.setEditable(e);
	}

	/**********
	 * Private local method to initialize the standard fields for a button
	 */
	private void setupButtonUI(Button b, String ff, double f, double w, Pos p, double x, double y){
		b.setFont(Font.font(ff, f));
		b.setMinWidth(w);
		b.setAlignment(p);
		b.setLayoutX(x);
		b.setLayoutY(y);
	}
}