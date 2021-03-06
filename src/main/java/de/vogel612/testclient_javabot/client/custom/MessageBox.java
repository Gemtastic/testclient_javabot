package de.vogel612.testclient_javabot.client.custom;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

import com.gmail.inverseconduit.datatype.ChatMessage;

public class MessageBox extends HBox {
	
	private Text name;
	private Label message;
	
	public MessageBox(ChatMessage chatMessage) {
		init();
		name.setText(chatMessage.getUsername());
		message = new Label(chatMessage.getMessage());
		setLayout();
		getChildren().addAll(name, message);
	}
	
	private void init() {
		name = new Text();
	}
	
	private void setLayout() {
		message.setWrapText(true);
		getStyleClass().add("userInput");
		name.getStyleClass().add("fancytext");
		minHeight(50);
		setAlignment(Pos.CENTER_LEFT);
	}
	
}

