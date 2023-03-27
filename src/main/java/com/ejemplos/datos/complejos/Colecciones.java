package com.ejemplos.datos.complejos;

import java.util.*;
import java.util.stream.Stream;

public class Colecciones {
	private static class CalleComp implements Comparator<Direccion>{

		@Override
		public int compare(Direccion e1, Direccion e2) {
			return e1.getCalle().compareTo(e2.getCalle());
		}
	}

	private static class NumeroComp implements Comparator<Direccion>{

		@Override
		public int compare(Direccion e1, Direccion e2) {
			if(Integer.parseInt(e1.getNumero())
					> Integer.parseInt(e2.getNumero())){
				return 1;
			} else {
				return -1;
			}
		}
	}

	/**
	 * @param listado
	 */
	public static void imprimeListado(List<String> listado){
		/*
		for(int i=0;i<listado.size();i++){
			String cadena=listado.get(i);
			System.out.println(cadena);
		}
		 */

		// For each de listados
		for (String cadena: listado) {
			System.out.println(cadena);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Objeto que es un listado de objetos
		// array List de usa para datos que caso no cambian
		List <Object> listadoDeObjetos= new ArrayList<>();
		// linked list se usa para datos cambiantes
		listadoDeObjetos = new LinkedList<>();
		// Añade un elemento al listado
		listadoDeObjetos.add(2);
		listadoDeObjetos.add("Hola Mundo");
		listadoDeObjetos.add(new Direccion());
		listadoDeObjetos.add(new Cliente());

		// imprime el primer elemento del listado
		System.out.println(listadoDeObjetos.get(0));
		Object object = listadoDeObjetos.get(0);
		if (object instanceof Integer){
			Integer entero = (Integer) object;
			System.out.println("Es un entero:  "+ entero);
		}
		// Java 12
		if (object instanceof Integer entero){
			System.out.println("Es un entero molon:  "+ entero);
		}


		System.out.println(listadoDeObjetos.get(3));
		listadoDeObjetos.remove(2);
		System.out.println(listadoDeObjetos.size());
		// Inicializamos otro objeto pero con una implementación diferente
		List<String> listado=new LinkedList<String>();
		// no puedo meter otra cosa que no sea String
		// listado.add(2);
		listado.add("Uno");
		listado.add("Dos");
		listado.add("Tres");
		// numero de elementos del listado
		System.out.println(listado.size());
		// devuelve el elemento en una posición
		System.out.println(listado.get(0));
		// devuelve el número de caracteres de la string en la primera posición
		System.out.println(listado.get(0).length());

		imprimeListado(listado);
		// quita un elemento en base a su posición
		listado.remove(1);
		imprimeListado(listado);
		System.out.println(listado.size());
		System.out.println("metiendo dos valores iguales");
		listado.add("Dos");
		listado.add("Dos");
		// borra el primer objeto que sea igual al pasado
		// quita un elemento en base a su valor
		// esa clase que manejamos en el listado debe tener implementado equals y hashcode
		listado.remove("Dos");
		System.out.println("borrando un valor");
		imprimeListado(listado);
		System.out.println("Listados los valores del array");
		listado.set(0,"modificado");
		imprimeListado(listado);
		listado.remove(0);
		imprimeListado(listado);
		System.out.println(listado.get(0));
		if(listado.isEmpty()){
			System.out.println("Listado Vacio");
		}
		listado.add("Uno");
		if(listado.contains("uno")){
			System.out.println("Contiene el objeto");
		}else{
			System.out.println("No contiene el objeto");
		}

		for(String a:listado){
			System.out.println("Cadena: "+a);
		}

		// Ordenado
		System.out.println("Ordenacion");
		System.out.println("Contenido Original");
		imprimeListado(listado);
		listado.sort( Comparator.comparing( String::toString ) );
		System.out.println("Contenido Ordenado con toString");
		imprimeListado(listado);
		// Inverso
		listado.sort( Comparator.comparing( String::valueOf ).reversed() );
		System.out.println("Contenido Ordenado con valueOf.reversed()");
		imprimeListado(listado);
		// Ordenado
		Collections.sort(listado);
		// Inverso
		Collections.sort(listado, Collections.reverseOrder());

		List<Direccion> listadoDirecciones = new ArrayList<>();
		Direccion d1 = new Direccion();
		d1.setCalle("Salamanca");
		d1.setNumero("12");
		listadoDirecciones.add(d1);
		d1 = new Direccion();
		d1.setCalle("Madrid");
		d1.setNumero("12");
		listadoDirecciones.add(d1);
		listadoDirecciones.add(new Direccion("19","Salamanca"));
		listadoDirecciones.sort(Comparator.comparing(Direccion::toString));
		System.out.println("Imprimiendo listado de direcciones");
		for (Direccion d :listadoDirecciones) {
			System.out.println(d);
		}

		listadoDirecciones = new ArrayList<>();
		// metemos un objeto en el listado
		listadoDirecciones.add(new Direccion());
		System.out.println("imprimimos el objeto insertado por pantalla");
		// Me devuelve la referencia al objeto que está dentro de listado
		Direccion primeraDireccion = listadoDirecciones.get(0);
		System.out.println(primeraDireccion);
		// si modifico el objeto referenciado, modifico el listado
		primeraDireccion.setCalle("Salamanca");
		primeraDireccion.setNumero("19");
		System.out.println("Imprimiendo valores directos o indirectos de un objeto");
		System.out.println(primeraDireccion);
		System.out.println(listadoDirecciones.get(0));


		Set<Integer> conjuntoNumeros = new HashSet<>();
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(1);
		conjuntoNumeros.add(1);
		System.out.println("HashSet: " + conjuntoNumeros);
		int count[] = {34, 22,10,60,30,22};
		Set<Integer> set = new HashSet<Integer>();
		try{
			for(int i = 0; i<6; i++){
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");
			System.out.println(sortedSet);

			System.out.println("The First element of the set is: "+
					(Integer)sortedSet.first());
			System.out.println("The last element of the set is: "+
					(Integer)sortedSet.last());
		}
		catch(Exception e){}


		Direccion direcciones[]={
				new Direccion("calle1","12"),
				new Direccion("calle2","14"),
				new Direccion("calle1","12")
		};
		Set<Direccion> conjuntoDirecciones=
		// 		new TreeSet<Direccion>(Comparator.comparing(Direccion::getCalle));
				new TreeSet<Direccion>(new CalleComp());
		conjuntoDirecciones.add(direcciones[0]);
		conjuntoDirecciones.add(direcciones[1]);
		conjuntoDirecciones.add(direcciones[2]);
		System.out.println("primera impresión set");
		for(Direccion d:conjuntoDirecciones){
			System.out.println(d);
		}
		System.out.println("segunda impresión set");
		for(Direccion d:conjuntoDirecciones){
			System.out.println(d);
		}

		// Create the sorted set
		SortedSet set2 = new TreeSet();

		// Add elements to the set
		set2.add("b");
		set2.add("c");
		set2.add("a");

		// Iterating over the elements in the set
		Iterator it = set2.iterator();
		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
		System.out.println("Ejemplos de mapas");
		Map mapa=new HashMap<Integer,String>();
		mapa.put(0,"Valor14");
		mapa.put(1,"Valor16");
		mapa.put(2,"Valor11");
		mapa.put(3,"Valor10");
		System.out.println(mapa.get(0));
		mapa.put(0,"Otro Valor");
		System.out.println(mapa.get(0));
		mapa.remove(0);
		System.out.println(mapa);
		// Mapa de asociación de Strings
		mapa=new HashMap<String,String>();
		mapa.put("nombre","Pepe");
		mapa.put("dni","789654A");
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		System.out.println(mapa.get("nombre"));
		// borramos el elemento de una determinada clave
		mapa.remove("nombre");
		System.out.println(mapa);
		System.out.println(mapa.get("nombre"));
		try {
			mapa.get("nombre").toString();
		}catch (NullPointerException e){
			System.out.println(e.getMessage());
		}
		// Mapa de String /Clase personalizada
		mapa=new HashMap<String,Cliente>();
		mapa.put("Cod1234",new Cliente("Lourdes", "37009876W"));
		Cliente client=(Cliente) mapa.get("Cod1234");
		System.out.println(client);

		// ¿Qué es esto?
		mapa=new HashMap<String,HashMap<String,Cliente>>();
		// Un mashmap que dentro como valor tiene otro hashmap
		// Inception?
		HashMap miniHashMap = new HashMap<String,Cliente> ();
		miniHashMap.put("Direccion", new Cliente("David", "07988765W"));
		mapa.put("Contacto", miniHashMap);
		miniHashMap = new HashMap<String,Cliente> ();
		miniHashMap.put("Direccion", new Cliente("Marta", "07988785W"));
		mapa.put("Fiscal", miniHashMap);
		System.out.println("HashMap de HashMaps: " + mapa);

		mapa = new HashMap<Integer, List<String>>();

		//Map m1 = new HashMap<Object,Object>();
		Map m1 = new HashMap();
		m1.put("Zara", new Cliente());
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		m1.put("Daisy2", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.print("\t" + m1);

		// Create a hash map
		TreeMap tm = new TreeMap();
		// Put elements to the map
		tm.put("Zara", 3434);
		tm.put("Mahnaz", 123);
		tm.put("Ayan", 1378);
		tm.put("Daisy", 99);
		tm.put("Qadir", -19);

		// Get a set of the entries
		Set set3 = tm.entrySet();
		// Get an iterator
		Iterator i = set3.iterator();
		// Display elements
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		// Deposit 1000 into Zara's account
		int numero = (int)tm.get("Zara");
		Double balance = Double.valueOf(numero);
		tm.put("Zara", balance + 1000);
		System.out.println("Zara's new balance: " +
				tm.get("Zara"));


		Map mimapa=new HashMap<String,Object>();
		Map valor=new HashMap<String,Object>();
		Map cliente1= new HashMap<String,Object>();
		cliente1.put("firstName","Jhon");
		cliente1.put("lastName","Doe");
		valor.put(0,cliente1);
		cliente1= new HashMap<String,Object>();
		cliente1.put("firstName","Anna");
		cliente1.put("lastName","Smith");
		cliente1.put("direccion","c/ lope de vega 14");
		valor.put(1,cliente1);
		mimapa.put("Empleados",valor);
		System.out.println(mimapa);



		//construir el listado
		List<Cliente> clientes = new ArrayList<Cliente>();
		//construir el objeto cliente
		Cliente pepe;
		pepe=new Cliente();
		pepe.setDni("8997894478A");
		pepe.setNombre("Pepe");
		//construir el objeto direccion
		Direccion dir=new Direccion();
		dir.setCalle("Arribarriaga");
		dir.setNumero("14");

		//construir el objeto del listado
		List<Direccion> direcciones2=new ArrayList<Direccion>();
		//incluir la dirección en el listado de direcciones
		direcciones2.add(dir);
		//Asociar el objeto de las direcciones al objeto cliente
		pepe.setDirecciones(direcciones2);
		//introducir en el listado el objeto cliente
		clientes.add(pepe);
		pepe.setNombre("Jose");
		pepe.getDirecciones().get(0).setCalle("Otra Calle");

		Cliente cogido=clientes.get(0);
		System.out.println(cogido.getNombre());
		List<Direccion> direccionesCogidas=cogido.getDirecciones();
		System.out.println(direccionesCogidas.get(0).getCalle());
		//del listado coges un objeto Cliente, del cliente coges la dirección
		//de la dirección coger el número
		clientes.get(0).getDirecciones().get(0).getNumero();
		for(Cliente c:clientes){
			for(Direccion direccion:c.getDirecciones()){
				if(direccion.getNumero().equals("14")){
					//coincidencia
				}
			}
		}



		List<Cliente> listadoclientes=new ArrayList<Cliente>();
		List<List<Cliente>> listadoDeListados=new ArrayList<List<Cliente>>();
		listadoDeListados.add(listadoclientes);
		listadoclientes.add(pepe);
		Cliente clientePepe=listadoDeListados.get(0).get(0);

		// Java 9
		// Creación de colecciones más sencilla
		List<Integer> list = List.of(1, 2, 3);
		Set<String> set4 = Set.of("a", "b", "c");
		Stream<String> stream = Stream.of("a", "b", "c");
		Map<String, String> map = Map.of("clave 1", "valor 1", "clave 2",  "valor 2");

		List<Integer> listCopyOf = List.copyOf(list);
		Set<String> setCopyOf = Set.copyOf(set4);
		Map<String, String> mapCopyOf = Map.copyOf(map);

		System.out.println( "Cambios de colecciones" );
		// nuevo método of
		Set<Integer> integers = Set.of(2, 6, 7, 10);
		System.out.println(integers);
		// no se puede modificar porque es inmutable
		//integers.add(12);
		//System.out.println(integers);
		// si inicializamos el objeto con los valores
		// que nos devuelve el of podría ser mutable
		List<Integer> integersList = new ArrayList<>(List.of(2, 6, 7, 10));
		System.out.println(integersList);
		integersList.add(12);
		System.out.println(integersList);

		// nuevo método toArray
		List<String> list2 = List.of("apple", "banana", "orange");
		String[] array = list2.toArray(String[]::new);
		System.out.println(Arrays.toString(array));
		// nuevo método copyOf
		List<Integer> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(2);
		List<Integer> integers2 = List.copyOf(list3);
		System.out.println(integers2);



	}

}
