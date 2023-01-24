package com.ejemplos.ficheros;

import java.io.*;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Ficheros {
	public static void lanzaCodigoJava11() throws IOException {
		System.out.println( "Ejemplos de NIO  en Java 11!!" );

			// escritura
			Path path = Files.writeString(
					Files.createTempFile("test", ".txt"), "test file content");
			System.out.println(path);
			String s = Files.readString(path);
			System.out.println(s);
			// lectura
			Charset latinCharset = Charset.forName("ISO-8859-3");
			path = Files.writeString(
					Files.createTempFile("test", ".txt"), "test filum", latinCharset);
			System.out.println(path);
			s = Files.readString(path, latinCharset);
			System.out.println(s);
			// presencia
			path = Path.of("C:", "temp", "test.txt");
			System.out.println(path);
			boolean exists = Files.exists(path);
			System.out.println(exists);
			// presencia por URL
			URI uri = URI.create("file:///C:/temp/test.txt");
			System.out.println(uri);
			path = Path.of(uri);
			System.out.println(path);
			System.out.println(Files.exists(path));

	}

	/**
	 * @param args
	 */
	public static void main(String[] args){
		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		try{
			File file = new File("./md5sum.txt");
			if(file.createNewFile()) {
				System.out.println("Success!");
			}else{
				System.out.println
						("Error, file already exists.");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println(ioe.getMessage());
		}
		BufferedWriter out=null;
		try {
			FileWriter fileWriter = new FileWriter("./md5sum.txt");
			out = new BufferedWriter(fileWriter);
			out.write("aString");
			out.close();
			System.out.println
					("File created successfully");
		}catch (IOException e) {
			System.out.println("Fallo al escribir el fichero");
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Ejecutado en ambos casos try completo o catch");
		}
		  try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("./md5sum.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null) {
				 System.out.println(linea);
			 }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
         }
	  }
	      File file = new File ("./md5sum.txt");
	      try {
	    	  // A partir del objeto File creamos el fichero f�sicamente
	    	  if (file.createNewFile())
	    	    System.out.println("El fichero se ha creado correctamente");
	    	  else
	    	    System.out.println("No ha podido ser creado el fichero");
	    	} catch (IOException ioe) {
	    	  ioe.printStackTrace();
	    	}
	      FileWriter fichero = null;
	      PrintWriter pw = null;
	      try
	      {
	          fichero = new FileWriter("./md5sum.txt");
	          pw = new PrintWriter(fichero);
	          for (int i = 0; i < 10; i++){
	        	  
	              pw.println("Linea " + i);
	              System.out.println("Escrito: "+"Linea "+i);
	          }

	      } catch (Exception e) {
	          e.printStackTrace();
	      } finally {
	         try {
	         // Nuevamente aprovechamos el finally para 
	         // asegurarnos que se cierra el fichero.
	         if (null != fichero)
	            fichero.close();
	         } catch (Exception e2) {
	            e2.printStackTrace();
	         }
	      }
	      File ficherin=new File("./md5sum.txt");
	      try {
			Scanner f=new Scanner(ficherin);
			f.useDelimiter("\n");
			while(f.hasNext()){
				System.out.print(f.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lanzaCodigoJava11();
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.out.println(ioe.getMessage());
		}catch (Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println("Fin de ejecución");

	}

}
