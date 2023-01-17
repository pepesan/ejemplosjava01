package com.ejemplos.datos;

import java.util.Arrays;

public class EjemplosArrays {

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray = new int [2];

		miArray[0] = 1;
		miArray[1] = 2;
		System.out.println(miArray[0]);
		System.out.println(miArray[1]);

		int miArray2[]= new int[2];

		int[] miArray3 = {1,2,3};
		System.out.println(miArray3[0]);
		System.out.println(miArray3[1]);
		System.out.println(miArray3[2]);

		int[] arrayInt = new int [100] ;
		int i;
		for (i=0;i<arrayInt.length;i++){
		//for (i=0;i<100;i++){
			arrayInt[i]=0;
			System.out.println(arrayInt[i]);
		}

		for (i=0;i<100;i++){
			arrayInt[i]=i;
			System.out.println(arrayInt[i]);
		}
		int[]nums={1,2,3,4};
		for (i=0;i<4;i++){
			System.out.println(nums[i]);
		}

		// Arrays multidimensionales
		System.out.println("Arrays Multidimensionales");
		int[][] arrayDoble = new int[2][3];
		arrayDoble[0][0] = 1;
		System.out.println(arrayDoble[0][0]);
		for (i=0; i<arrayDoble.length;i++){
			for (var j= 0; j<arrayDoble[i].length; j++){
				System.out.println("["+i+"]["+j+"]: "+arrayDoble[i][j]);
			}
		}
		System.out.println("Fin primer ejemplo Arrays Multidimensionales");
		// Array multidimensional no simétrico
		int notas[][]=new int[5][];//Hay 5 arrays de enteros
		notas[0]=new int[2]; //El primer array es de 100 enteros
		notas[1]=new int[3]; //El segundo de 230
		notas[2]=new int[4];
		notas[3]=new int[5];
		notas[4]=new int[6];
		for (i=0; i<notas.length;i++){
			for (var j= 0; j<notas[i].length; j++){
				System.out.println("["+i+"]["+j+"]: "+notas[i][j]);
			}
		}
		System.out.println("Fin segundo ejemplo Arrays Multidimensionales");

		// Clase Arrays
		int valores[]=new int[4];
		Arrays.fill(valores,-1);//Todo el array vale -1
		System.out.println("Array Rellenado con Array.fill: " + valores);
		System.out.println(valores[0]);

		// fromIndex (inclusive)
		// toIndex (exclusive)
		//Del elemento 1 al 2 valdrán
		Arrays.fill(valores,1,3,-1);

		// int[] nums;
		nums= new int[]{1, 2, 3, 4};
		EjemplosArrays obja=new EjemplosArrays();
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
			i++;
		}
		System.out.println("ValorEncontrado: " + valorEncontrado);
		System.out.println("posicion del array del valor entrado: " + i);
		// int[2][3] dobleArray
		//For each (doble y anidado)
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

		int x[]={4,5,2,3,7,8,2,3,9,5};
		Arrays.sort(x);//Estará ordenado
		Arrays.sort(x,2,5);//Ordena del 2º al 4º elemento
		System.out.println(x);

		int arrayRellenable[]=new int[23];
		Arrays.fill(arrayRellenable,-1);//Todo el array vale -1

		Arrays.fill(arrayRellenable,5,8,-1);//Del elemento 5 al 7 valdrán

		int uno[]={1,1,2};
		int dos[]=new int [10];
		Arrays.fill(dos,0);
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
		}catch (Exception e){
			System.out.println("ups ha petado algo ");
		}

	}

}
