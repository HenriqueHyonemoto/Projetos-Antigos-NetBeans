/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author Rick
 */
public class ex05 {
    public static void main(String[] args) {
 
	Properties prop = new Properties();
	Set props;
        String str;
 
	//Definir o valor das propriedades
	prop.setProperty("DataBase ", "db1");
	prop.setProperty("User ", "nome");
	prop.setProperty("Password ", "senha");
 
	//Definir chave
	props = prop.keySet(); 
 
	//Mostrar propriedades
        Iterator iterator = props.iterator();
        while(iterator.hasNext()) {
          str = (String) iterator.next();
          System.out.println("Propriedade: " + str + "\nValor da propriedade: " + prop.getProperty(str));
       }
 
  }
}
