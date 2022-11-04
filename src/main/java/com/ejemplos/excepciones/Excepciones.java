package com.ejemplos.excepciones;

class Limites extends Exception {}
class demasiadoCalor extends Limites {}
class demasiadoFrio extends Limites {}
class demasiadoRapido extends Limites {}
class demasiadoCansado extends Limites {}
   
public class Excepciones {
	public static void main(String[] args) {
		int a = 4;
		int b = 0;


		try {
			int c = a/b;
		}catch (Exception e){
			System.out.println("Primera excepción");
			System.out.println(e.getLocalizedMessage());
			if (e.getLocalizedMessage().equals("/ by zero")){
				System.out.println("por favor , introduzca un número en b que no sea cero");
			}
		}



		int valor;
		int x;
		try {
			int j= 0;
			if(j>0){
				ChungaException e = new ChungaException();
				throw e;
			}
			System.out.println("fuera del IF");
			Integer i=null;
			// i.toString();
		    /*
			for( x=0,valor = 100; x < 100; x ++ ){
				valor /= x;
			}
			*/
		    Exception e = new Exception();
		    throw e;

		}
		catch( ArithmeticException e ) {
		    System.out.println( "Matemáticas locas!" );
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		    }
		catch (NullPointerException e){
			System.out.println( "Null Pinter Exception" );
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
			ChungaException e2 = new ChungaException();
			try {
				throw e2;
			} catch (ChungaException ex) {
				ex.printStackTrace();
			}
		}
		catch (ChungaException e){
			System.out.println( "Null Pinter Exception" );
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		catch( Exception e ) {
		    System.out.println( "Se ha producido un error" );
			e.printStackTrace();
			System.out.println(e.getLocalizedMessage());
		}
		int temp=30;
		int dormir=7;
		try {
			if( temp > 40 )
		    	throw( new demasiadoCalor() );
		if( dormir < 8 )
			throw( new demasiadoCansado() );
		} catch( Limites lim ) {
			if( lim instanceof demasiadoCalor ){
				System.out.println( "Capturada excesivo calor!" );
		            return;
			}
			if( lim instanceof demasiadoCansado ) {
				System.out.println( "Capturada excesivo cansancio!" );
				return;
			}
		} finally{
			System.out.println( "En la clausula finally" );
		}
	}
}
