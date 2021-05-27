package edu.uiz.fsa.protege.SQLfplugin.menu;
import java.awt.GridLayout;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.protege.editor.owl.ui.action.ProtegeOWLAction;

public class DatabaseConnectionMenu extends ProtegeOWLAction {

	public void initialise() throws Exception {
	}

	public void dispose() throws Exception {
	}

	public void actionPerformed(ActionEvent arg0) {
		/*
		StringBuilder message = new StringBuilder("Yet another example menu item.\n");
		message.append("The active ontology has ");
		message.append(getOWLModelManager().getActiveOntology().getObjectPropertiesInSignature().size());
		message.append(" object properties.");
		JOptionPane.showMessageDialog(getOWLWorkspace(), message.toString());*/
		//Fenetre f=new Fenetre();
    String[] items = {"localhost"};
    JComboBox database = new JComboBox(items);
    //JTextField database = new JTextField("localhost");
    final JTextField SID = new JTextField("orcl");
    final JTextField Port = new JTextField("1521");
    JCheckBox  JDBCURLenable= new JCheckBox("Enable");
    final JTextField JDBCURL = new JTextField("jdbc:oracle:thin:@localhost:1521:orcl");
    JDBCURL.setEditable(false);
    JDBCURLenable.addActionListener(new ActionListener() {

           // @Override
            public void actionPerformed(ActionEvent e) {
                SID.setEditable(false);
                Port.setEditable(false);
                JDBCURL.setEditable(true);
            }
        });
    JTextField UserName = new JTextField("");
    JTextField Password = new JPasswordField(10);

    JPanel panel = new JPanel(new GridLayout(0, 1));
    panel.add(database);
    panel.add(new JLabel("SID:"));
    panel.add(SID);
    panel.add(new JLabel("Port:"));
    panel.add(Port);
    panel.add(new JLabel("JDBC Url:"));
    panel.add(JDBCURLenable);
    panel.add(JDBCURL);
    panel.add(new JLabel("User Name:"));
    panel.add(UserName);
    panel.add(new JLabel("Password:"));
    panel.add(Password);

   int result = JOptionPane.showConfirmDialog(null, panel, "Connect to Oracle",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        System.out.println(database.getSelectedItem()
            + " " + UserName.getText()
            + " " + Password.getText());
    } else {
        System.out.println("Cancelled");
    }
    
	}
}
