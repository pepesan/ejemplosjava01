package com.ejemplos.datos;

import java.util.Arrays;

public class EjemplosArrays {

	/**
	 * @param
	 */
	public int sumaarray(int a[]){
		int i;
		int r=0;
		for(i=0;i<a.length;i++){
			r+=a[i];
		}
		return r;
		
	}
	public int[]devuelvearray(int a[]){
		return a;
	}
	
	public int recorrearray(int a[]){
		int s=0;
		for(int ele: a){
			s+=ele;
			System.out.println(ele);
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_int = new int [100] ;
		int i;
		for (i=0;i<array_int.length;i++){
		//for (i=0;i<100;i++){
			array_int[i]=0;
			System.out.println(array_int[i]);
		}

		for (i=0;i<100;i++){
			array_int[i]=i;
			System.out.println(array_int[i]);
		}
		int[]nums={1,2,3,4};
		for (i=0;i<4;i++){
			System.out.println(nums[i]);
		}
		EjemplosArrays obja=new EjemplosArrays();
		i=obja.sumaarray(nums);
		System.out.println(i);
		int [][] doblearray= new int [2][3];
		i=0;
		int j;
		for(j=0;j<doblearray.length;j++){
			int f;
			f=doblearray[j].length;
			for(int k=0;k<f;k++){
				doblearray[j][k]=i;
				System.out.println(doblearray[j][k]);
				i++;
			}
		}
		//For each (doble y anidado)
		for (int[] fila: doblearray){
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

		int valores[]=new int[23];
		Arrays.fill(valores,-1);//Todo el array vale -1
		Arrays.fill(valores,5,8,-1);//Del elemento 5 al 7 valdrán

		int uno[]={1,1,2};
		int dos[]=new int [10];
		Arrays.fill(dos,0);
		System.arraycopy(uno, 0, dos, 0, uno.length);
		for (i=0;i<10;i++){
			System.out.print(dos[i]+" ");
		} //Sale 1120000000
	}

}
