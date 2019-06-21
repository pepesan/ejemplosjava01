package com.ejemplos.datos.complejos;

import java.util.*;
import java.util.stream.Stream;

public class Colecciones {

	/**
	 * @param listado
	 */
	public static void imprimeListado(List<String> listado){
		for(int i=0;i<listado.size();i++){
			String cadena=listado.get(i);
			System.out.println(cadena);
		}
		/*
		For each de listados
		for (String cadena: listado) {
			System.out.println(cadena);
		}

		 */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listado=new LinkedList<String>();
		listado.add("Uno");
		listado.add("Dos");
		listado.add("Tres");
		imprimeListado(listado);
		listado.remove(2);
		imprimeListado(listado);
		listado.remove("Dos");
		imprimeListado(listado);
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
		Set<Direccion> conjuntoDirecciones=new TreeSet<Direccion>(Comparator.comparing(Direccion::getCalle));
		conjuntoDirecciones.add(direcciones[0]);
		conjuntoDirecciones.add(direcciones[1]);
		conjuntoDirecciones.add(direcciones[2]);
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
		Map mapa=new HashMap<Integer,String>();
		mapa.put(0,"Valor14");
		mapa.put(1,"Valor16");
		mapa.put(2,"Valor11");
		mapa.put(3,"Valor10");
		System.out.println(mapa.get(0));
		mapa.remove(0);
		System.out.println(mapa);
		mapa=new HashMap<String,String>();
		mapa.put("nombre","Pepe");
		mapa.put("dni","789654A");
		System.out.println(mapa.get("nombre"));
		mapa.remove("Pepe");

		mapa=new HashMap<String,Cliente>();
		mapa.put("Cod1234",new Cliente());
		Cliente client=(Cliente) mapa.get("Cod1234");



		mapa=new HashMap<String,HashMap<String,Cliente>>();



		//Map m1 = new HashMap<Object,Object>();
		Map m1 = new HashMap();
		m1.put("Zara", "8");
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
		tm.put("Zara", new Double(3434.34));
		tm.put("Mahnaz", new Double(123.22));
		tm.put("Ayan", new Double(1378.00));
		tm.put("Daisy", new Double(99.22));
		tm.put("Qadir", new Double(-19.08));

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
		double balance = ((Double)tm.get("Zara")).doubleValue();
		tm.put("Zara", new Double(balance + 1000));
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

		/*

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
		List<Direccion> direcciones=new ArrayList<Direccion>();
		//incluir la dirección en el listado de direcciones
		direcciones.add(dir);
		//Asociar el objeto de las direcciones al objeto cliente
		pepe.setDirecciones(direcciones);
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
		*/

		// Java 9
		// Creación de colecciones más sencilla
		List<Integer> list = List.of(1, 2, 3);
		Set<String> set4 = Set.of("a", "b", "c");
		Stream<String> stream = Stream.of("a", "b", "c");
		Map<String, String> map = Map.of("clave 1", "valor 1", "clave 2",  "valor 2");

		List<Integer> listCopyOf = List.copyOf(list);
		Set<String> setCopyOf = Set.copyOf(set4);
		Map<String, String> mapCopyOf = Map.copyOf(map);


}

}
