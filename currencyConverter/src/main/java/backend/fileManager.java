package backend;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class fileManager {
    static ArrayList<coin> coins = new ArrayList<coin>();
    /*
    Metodo encargado de escribir el archivo
    */
    public static void writeFile(){
        PrintWriter writer = null;
        
        try {
            
            writer = new PrintWriter(new BufferedWriter(new FileWriter("players.txt",true)));
            
            for (int i = 0; i < coins.size(); i++) {
                writer.println(coins.get(i).getName() +"-"+coins.get(i).getValue());
            }
            
            writer.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo");
        }
        
    }
    /*
    Metodo encargado de leer el archivo
    */
    public static void readfile(){
        try {


            
            BufferedReader reader = new BufferedReader(new FileReader("coins.txt"));
            String s = new String();
            String name;
            float value;
            while ((s = reader.readLine()) != null) {
                
                
                String[] data = s.split("-");
                name = data[0];
                value = Float.parseFloat(data[1]);
                coin c = new coin(value,name);
                
                coins.add(c);
                
            }
        
            
            reader.close();
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "error al leer el archivo");
        }
    }
}
