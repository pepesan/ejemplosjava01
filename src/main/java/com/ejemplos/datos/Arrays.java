package com.ejemplos.datos;


public class Arrays {

	/**
	 * @param
	 */
	public int sumaArray(int a[]){
		int i;
		int r=0;
		for(i=0;i<a.length;i++){
			r+=a[i];
		}
		return r;
		
	}
	public int[] devuelveArray(int a[]){
		return a;
	}
	
	public int recorreArray(int a[]){
		int s=0;
		for(int ele: a){
			s+=ele;
			System.out.println(ele);
		}
		return s;
	}
	public static void main(String[] args) throws InterruptedException {
		// Inicialización de un array
		System.out.println("Array sencillo");
		// tipo [] nombre = new tipo [numelementos];
		int[] miArray = new int [2];

		miArray[0] = 1;
		miArray[1] = 2;
		System.out.println(miArray[0]);
		System.out.println(miArray[1]);

		int miArray2[]= new int[2];

		// Declarar un array de manera explícita
		System.out.println("Array explícito");
		int[] miArray3 = {1,2,3};
		System.out.println(miArray3[0]);
		System.out.println(miArray3[1]);
		System.out.println(miArray3[2]);

		System.out.println("Recorrer arrays");
		int numElemento = 10;
		int[] arrayInt = new int [numElemento] ;
		int i;
		System.out.println("Recorrer e inicializar arrays: for");
		for (i=0;i<numElemento;i++){
			arrayInt[i]=i;
			System.out.println(arrayInt[i]);
		}
		System.out.println("Recorrer e inicializar arrays a 0: for con length");
		for (i=0;i<arrayInt.length;i++){
		//for (i=0;i<10;i++){
			arrayInt[i]=0;
			System.out.println(arrayInt[i]);
		}

		System.out.println("Recorrer arrays: for");
		int[]nums={1,2,3,4};
		for (i=0;i<4;i++){
			System.out.println(nums[i]);
		}

		// Arrays multidimensionales
		System.out.println("Arrays Multidimensionales");
		int[][] arrayDoble = new int[2][3];
		// nombre[indicep][indicep']
		arrayDoble[0][0] = 1;
		System.out.println(arrayDoble[0][0]);
		System.out.println("Recorrer Arrays Multidimensionales");
		for (i=0; i<arrayDoble.length;i++){
			for (var j= 0; j<arrayDoble[i].length; j++){
				System.out.println("["+i+"]["+j+"]: "+arrayDoble[i][j]);
			}
		}
		System.out.println("Fin primer ejemplo Arrays Multidimensionales");
		// Array multidimensional no simétrico
		System.out.println("Array multidimensional sin una definida");
		int[][] notas=new int[5][];//Hay 5 arrays de enteros
		notas[0]=new int[2]; //El primer array es de 100 enteros
		notas[1]=new int[3]; //El segundo de 230
		notas[2]=new int[4];
		notas[3]=new int[5];
		notas[4]=new int[6];
		System.out.println("Recorrer un Array multidimensional no homogéneo en dimensiones");
		for (i=0; i<notas.length;i++){
			for (var j= 0; j<notas[i].length; j++){
				System.out.println("["+i+"]["+j+"]: "+notas[i][j]);
			}
		}
		System.out.println("Fin segundo ejemplo Arrays Multidimensionales");

		// array de caracteres
		System.out.println("Array de caracteres");
		char [] caracteres = new char [10];
		caracteres[0]= 'H';
		System.out.println(caracteres[0]);

		// array de caracteres de dos dimenciones
		System.out.println("Array de caracteres Bi");
		char [][] caracteresDoble = new char [10][];
		for (i = 0; i<10; i++){
			caracteresDoble[0] = new char[5];
			caracteresDoble[0][0] = '3';
			caracteresDoble[0][1] = '7';
			caracteresDoble[0][2] = '0';
			caracteresDoble[0][3] = '0';
			caracteresDoble[0][4] = '1';
		}
		System.out.println(caracteresDoble);

		// Array de cadenas
		System.out.println("Array de cadenas");
		String [] misCadenas = new String[2];
		misCadenas[0] = "Araba";
		misCadenas[1] = "Bizkaia";
		System.out.println(misCadenas[0]);
		System.out.println(misCadenas[1]);

		// Clase Arrays
		System.out.println("Clase Arrays");
		int[] valores=new int[4];
		java.util.Arrays.fill(valores,-1);//Todas la posiciciones del array valen -1
		System.out.println("Array Rellenado con Array.fill: " + valores);
		System.out.println(valores[0]);
		System.out.println("Array cambiado: " + valores);

		// fromIndex (inclusive)
		// toIndex (exclusive)
		//Del elemento 1 al 2 valdrán
		java.util.Arrays.fill(valores,1,3,-1);

		// int[] nums;
		nums= new int[]{1, 2, 3, 4};
		Arrays obja=new Arrays();
		i=obja.sumaArray(nums);
		System.out.println("sumaArray: "+ i);
		int [][] dobleArray= new int [2][3];
		i=0;
		int j;
		for(j=0;j<dobleArray.length;j++){
			int f;
			f=dobleArray[j].length;
			for(int k=0;k<f;k++){
				dobleArray[j][k]=i;
				System.out.println(dobleArray[j][k]);
				i++;
			}
		}

		//For each de una dimensión
		System.out.println("Foreach 1-3");
		nums = new int[]{1,2,3};
		// for(i=0;i<nums.length;i++){
		// 	int valorPosicion = nums[i];
		// }
		// For Each
		for (int valor: nums) {
			System.out.println("Foreach: "+ valor);
		}
		// buscar un valor en el array
		var valorEncontrado = false;
		for (int valor: nums) {
			if (valor == 2){
				valorEncontrado = true;
			}
		}
		System.out.println("ValorEncontrado: " + valorEncontrado);
		// Búsqueda con for e índice
		valorEncontrado = false;
		for (i=0; i<nums.length;i++) {
			if (nums[i] == 2){
				valorEncontrado = true;
				break;
			}
		}
		System.out.println("ValorEncontrado: " + valorEncontrado);
		System.out.println("posicion del array del valor entrado: " + i);
		// int[2][3] dobleArray
		//For each (doble y anidado)
		System.out.println("Foreach doble");
		for (int[] fila: dobleArray){
			for (int celda: fila){
				System.out.println(celda);
				if (celda==7){
					//se sale del for de dentro
					// del for de celdas
					break;
				}
			}
		}
		
		int [][] da= new int[2][];
		System.out.println("Matriz: "+da.length);
		da[0]=new int[4];
		System.out.println("Matriz: "+da[0].length);
		for(i=0;i<4;i++){
			da[0][i]=i;
		}
		da[1]=new int [5];
		System.out.println("Matriz: "+da[1].length);
		for(i=0;i<5;i++){
			da[1][i]=i;
		}
		for (int[] ele: da){
			for (int celda: ele){
				System.out.println(celda);
			}
		}
		System.out.println("ordenacion");
		int[] x={4,5,2,3,7,8,2,3,9,5};
		java.util.Arrays.sort(x);//Estará ordenado
		for (int k : x){
			System.out.println(k);
		}
		// fromIndex (inclusive) toIndex (exclusive)
		java.util.Arrays.sort(x,2,5);//Ordena del 2º al 4º elemento


		int arrayRellenable[]=new int[23];
		java.util.Arrays.fill(arrayRellenable,-1);//Todo el array vale -1

		java.util.Arrays.fill(arrayRellenable,5,8,-1);//Del elemento 5 al 7 valdrán

		int uno[]={1,1,2};
		int dos[]=new int [10];
		java.util.Arrays.fill(dos,0);
		System.arraycopy(uno, 0, dos, 0, uno.length);
		for (i=0;i<10;i++){
			System.out.print(dos[i]+" ");
		} //Sale 1120000000
		// Manejo de excepciones de Índice de Arrays
		System.out.println();
		nums = new int[]{1,2,3};
		var indice = 3;
		if (indice<nums.length -1){
			System.out.println(nums[3]);
		}else{
			System.out.println("ups ha petado algo ");
		}
		try {
			System.out.println(nums[3]);
		}catch (Exception miExcepcion){
			System.out.println("ups ha petado algo ");
			System.out.println(miExcepcion.getClass().getName());
			System.out.println(miExcepcion.getMessage());
			miExcepcion.printStackTrace();
		}
		Thread.sleep(100);
		System.out.println("Fin de Ejemplo");
	}

}
