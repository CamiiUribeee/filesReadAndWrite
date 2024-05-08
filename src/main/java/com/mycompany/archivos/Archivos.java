
package com.mycompany.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;


public class Archivos {

    public static void main(String[] args) throws IOException {
        try{
            File file = new File("./archivo.txt"); //java va a tratar de buscar este archivo en la raiz del proyecto 
        
            if (file.createNewFile()){//apenas yo escribo esto tengo que importar
                System.out.println("Archivo creado satisfactoriamente");
                
                
            } else{
                System.out.println("El archivo ya existe");
            }
            FileReader reader= new FileReader(file, Charset.forName("UTF8")); //este segundo parametro es para cambiar la codificacion de windows
            
            //Mostrar caracter a caracter: 
            //char [] readed = new char [50];
            // reader.read(readed);
            //System.out.println (readed); //por que se comentò todo esto? al hacerlo aparece line: y lo que tenia escrito en el archivo
            
            
            System.out.println(reader.getEncoding());
            
            
            //Mostrar contenido linea a linea: 
            BufferedReader buffer = new BufferedReader(reader);  //esto me sirve para acceder linea por linea (el buffer) 
            
            String line; 
            while((line=buffer.readLine()) != null) {     //recorrer linea por linea
                System.out.println("line: " + line);
            }
        
                
                
        } catch (IOException e){
            //tratamiento adecuado 
        }
         
    }
}


//PREGUNTAS: 
// por que no me salia el archivo en la carpeta? 
