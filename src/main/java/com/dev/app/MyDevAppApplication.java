package com.dev.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.net.URI;

import static javax.swing.BorderFactory.createEmptyBorder;

@SpringBootApplication
public class MyDevAppApplication extends JFrame {

	private static void GUI() throws Exception{
		String url = "http://localhost:8089/";
		JFrame frame = new JFrame("my-dev-app");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Spring boot app is started...");

		JLabel urlLabel = new JLabel("URL : "+url);

		panel.setBorder(createEmptyBorder(100,100,50,100));
		panel.setLayout(new GridLayout(0,1));
		panel.add(label);
		panel.add(urlLabel);

		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("OUR GUI");
		frame.pack();
		frame.setVisible(true);


		Desktop desktop = java.awt.Desktop.getDesktop();
		URI oURL = new URI(url);
		desktop.browse(oURL);
	}

	public static void main(String[] args) throws Exception {
		GUI();
		SpringApplication.run(MyDevAppApplication.class, args);
	}

}
