
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krios
 */
public class GetPath {
    public String GetPath(){
    JFileChooser chooser = new JFileChooser();
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle("choosertitle");
    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
    chooser.setAcceptAllFileFilterUsed(false);
    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
        System.out.println("getSelectedFile() : " + chooser.getSelectedFile().getAbsolutePath());
    } else {
        System.out.println("No Selection ");
}
        return chooser.getSelectedFile().getAbsolutePath() ;

}
}