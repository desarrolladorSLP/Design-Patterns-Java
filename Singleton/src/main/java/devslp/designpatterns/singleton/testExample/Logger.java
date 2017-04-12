/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devslp.designpatterns.singleton.testExample;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author Enrique Guardiola
 */
public class Logger {
    private static Logger instance;
    private Logger(){
    }
    public static synchronized Logger getInstance(){
        if(instance == null)
            instance = new Logger();
        return instance;
    }
    public synchronized void loggerString(String str){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("logFile.txt",true), StandardCharsets.UTF_8))) {
            writer.write(str);
        } 
        catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        }  
    }
}
