import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws IOException {
       
        System.out.println("\nElige una de las siguientes opciones:");
		System.out.println("================================================");
		System.out.println("Leer y mostrar distribuidores desde archivo....1");
		System.out.println("Crear y mostrar lechugas.......................2");
		System.out.println("Crear y mostrar manzanas.......................3");
		System.out.println("Crear y mostrar tipos de leche.................4");
		System.out.println("Leer y mostrar clientes desde archivo..........5");
		System.out.println("Salir..........................................0");
		System.out.println("================================================");
		
		Scanner sc = new Scanner(System.in);
		//crear arraylist distribuidores
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		int elec = sc.nextInt();
		while(elec!=0){
			switch(elec){
				case 1: //distribuidores
			
		
        
        			try {
			
						FileInputStream fis = new FileInputStream("distribuidores.txt");
						InputStreamReader isr = new InputStreamReader(fis, "UTF8");
						BufferedReader br = new BufferedReader(isr);
			
						String linea = br.readLine();
						String [] campos = null;
			
						while(linea != null) {
							Distribuidor distribuidor = new Distribuidor();
							Direccion direccion = new Direccion();
							Contacto contacto = new Contacto();
							campos = linea.split("#");
							String distri = campos[0];
							String [] campos2 = distri.split(",");
							distribuidor.setNombre(campos2[0]);
							distribuidor.setCif(campos2[1]);
							
							distri = campos[1];
							campos2 = distri.split(",");
							direccion.setNombreCalle(campos2[0]);
							int entero = Integer.parseInt(campos2[1]);
							direccion.setNumeroPabellon(entero);
							entero = Integer.parseInt(campos2[2]);
							direccion.setCodigoPostal(entero);
							direccion.setLocalidad(campos2[3]);
							direccion.setProvincia(campos2[4]);
						
							
			
							distribuidor.setDireccion(direccion);
			
							distri = campos[2];
							campos2 = distri.split(",");
							contacto.setNombre(campos2[0]);
							contacto.setApellido(campos2[1]);
							entero = Integer.parseInt(campos2[2]);
							contacto.setTelefono(entero);
							contacto.setEmail(campos2[3]);
			
							distribuidor.setContacto(contacto);
			
							distribuidores.add(distribuidor);
							linea = br.readLine();
						}
						//mostrar distribuidores
						for(int i=0; i < distribuidores.size(); i++) {
							Direccion direc = new Direccion();
							Contacto contact = new Contacto();
							System.out.println("\nProveedor nº: " + (i + 1));
							System.out.println("*************************************************");
							System.out.println("Nombre: " + (distribuidores.get(i).getNombre()));
							System.out.println("Cif: " + (distribuidores.get(i).getCif()));
							direc = distribuidores.get(i).getDireccion();
							System.out.println("Direccion: ");
							System.out.println("\tCalle: " + direc.getNombreCalle());
							System.out.println("\tNumero: " + direc.getNumeroPabellon());
							System.out.println("\tCP: " + direc.getCodigoPostal());
							System.out.println("\tLocalidad: " + direc.getLocalidad());
							System.out.println("\tProvincia: " + direc.getProvincia());
							contact = distribuidores.get(i).getContacto();
							System.out.println("Contacto: ");
							System.out.println("\tNombre: " + contact.getNombre());
							System.out.println("\tApellido: " + contact.getApellido());
							System.out.println("\tEmail: " + contact.getTelefono());
							System.out.println("\tTelefono: " + contact.getEmail());
							System.out.println("*************************************************");
						}

			
					}catch(Exception ioe) {
						System.out.println("Error: "+ioe);
					}
				break;
				
				case 2: //lechugas
		
					ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
					System.out.println("\nCuantas lechugas son?: ");
					int opcion = sc.nextInt();
					
					for (int l = 0; l < opcion; l++ ) {
						Lechuga lechuga = new Lechuga();
						System.out.println("\nTipo de lechuga: ");
						lechuga.setTipoLechuga(sc.next());
						System.out.println("\nProcedencia: ");
						lechuga.setProcedencia(sc.next());
						System.out.println("\nColor: ");
						lechuga.setColor(sc.next());
						System.out.println("\nPrecio/Unidad: ");
						lechuga.setEurosUnidad(sc.nextDouble());
						System.out.println("\nNombre del distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for (int d = 0; d < distribuidores.size(); d++) {
							if ((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								lechuga.setDistribuidor(distribuidores.get(d));
							} 
						} 
						lechugas.add(lechuga);
			
					} 
					//leer lechugas
					System.out.println("\nLechugas elegidas: \n");
		
					for (int p = 0; p < lechugas.size(); p++) {
						System.out.println("Lechuga nº" + (p + 1));
						System.out.println("----------------------------------------------------");
						System.out.println("Tipo de lechuga: "+(lechugas.get(p).getTipoLechuga()));
						System.out.println("Prcedencia: "+(lechugas.get(p).getProcedencia()));
						System.out.println("Color: "+(lechugas.get(p).getColor()));
						System.out.println("€/Kg: "+(lechugas.get(p).getEurosUnidad()));
						Distribuidor distribuidor = lechugas.get(p).getDistribuidor();
						System.out.println("Distribuidor: ");
						System.out.println("\tNombre: "+distribuidor.getNombre());
						System.out.println("\tCIF: "+distribuidor.getCif());
						System.out.println("\tContacto: ");
						System.out.println("\ttNombre: "+(distribuidor.getContacto()).getNombre());
						System.out.println("\ttApellido: "+(distribuidor.getContacto()).getApellido());
						System.out.println("\ttE-mail: "+(distribuidor.getContacto()).getEmail());
						System.out.println("\ttTelefono: "+(distribuidor.getContacto()).getTelefono());
						System.out.println("\tDirección: ");
						System.out.println("\ttCalle: "+(distribuidor.getDireccion()).getNombreCalle());
						System.out.println("\ttNumero: "+(distribuidor.getDireccion()).getNumeroPabellon());
						System.out.println("\tCodigo Postal: "+(distribuidor.getDireccion()).getCodigoPostal());
						System.out.println("\ttLocalidad: "+(distribuidor.getDireccion()).getLocalidad());
						System.out.println("\tProvincia: "+(distribuidor.getDireccion()).getProvincia());
						System.out.println("----------------------------------------------------");
					}
				break;
				
				case 3://manzanas
					
					ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
					System.out.println("\nCuantas Manzanas quieres añadir a la lista?: ");
					opcion = sc.nextInt();
					
					for (int o = 0; o < opcion; o++) {
						Manzana manzana = new Manzana();
						System.out.println("\nTipo de Manzana: ");
						manzana.setTipoManzana(sc.next());
						System.out.println("\nProcedencia: ");
						manzana.setProcedencia(sc.next());
						System.out.println("\nColor: ");
						manzana.setColor(sc.next());
						System.out.println("\nPrecio/kg: ");
						manzana.setEurosKilo(sc.nextDouble());
						System.out.println("\nNombre del Distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for (int d = 0; d <distribuidores.size(); d++) {
							if ((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								manzana.setDistribuidor(distribuidores.get(d));
							}
						}
						manzanas.add(manzana);
					} 
					//leer manzanas
					System.out.println("\nManzanas elegidas: \n");
					
					for (int m = 0; m < manzanas.size(); m++) {
						System.out.println("Manzana nº" + (m + 1));
						System.out.println("----------------------------------------------------");
						System.out.println("Tipo de Manzana: "+(manzanas.get(m).getTipoManzana()));
						System.out.println("Prcedencia: "+(manzanas.get(m).getProcedencia()));
						System.out.println("Color: "+(manzanas.get(m).getColor()));
						System.out.println("€/Kg: "+(manzanas.get(m).getEurosKilo()));
						Distribuidor distribuidor = manzanas.get(m).getDistribuidor();
						System.out.println("Distribuidor: ");
						System.out.println("\tNombre: "+distribuidor.getNombre());
						System.out.println("\tCIF: "+distribuidor.getCif());
						System.out.println("\tContacto: ");
						System.out.println("\ttNombre: "+(distribuidor.getContacto()).getNombre());
						System.out.println("\ttApellido: "+(distribuidor.getContacto()).getApellido());
						System.out.println("\ttE-mail: "+(distribuidor.getContacto()).getEmail());
						System.out.println("\tTelefono: "+(distribuidor.getContacto()).getTelefono());
						System.out.println("\tDirección: ");
						System.out.println("\tCalle: "+(distribuidor.getDireccion()).getNombreCalle());
						System.out.println("\tNumero: "+(distribuidor.getDireccion()).getNumeroPabellon());
						System.out.println("\tCodigo Postal: "+(distribuidor.getDireccion()).getCodigoPostal());
						System.out.println("\tLocalidad: "+(distribuidor.getDireccion()).getLocalidad());
						System.out.println("\tProvincia: "+(distribuidor.getDireccion()).getProvincia());
						System.out.println("----------------------------------------------------");
					} 
				break;
				
				case 4://leches
					
					ArrayList<Leche> leches = new ArrayList<Leche>();
					System.out.println("\nCuantas Leches quieres añadir a la lista?: ");
					opcion = sc.nextInt();
					
					for (int o = 0; o < opcion; o++) {
						Leche leche = new Leche();
						System.out.println("\nTipo de leche: ");
						leche.setTipo(sc.next());
						System.out.println("\nProcedencia: ");
						leche.setProcedencia(sc.next());
						System.out.println("\nPrecio/litro: ");
						leche.setEurosLitro(sc.nextDouble());
						System.out.println("\nNombre del Distribuidor: ");
						Distribuidor distribuidor = new Distribuidor();
						distribuidor.setNombre(sc.next());
						for (int d = 0; d <distribuidores.size(); d++) {
							if ((distribuidores.get(d).getNombre()).equalsIgnoreCase(distribuidor.getNombre())) {
								leche.setDistribuidor(distribuidores.get(d));
							}
						}
						leches.add(leche);
					} 
					//leer leches
					System.out.println("\nLas leches insertadas: ");
					
					for (int l = 0; l < leches.size(); l++) {
						System.out.println("Leche nº" + (l + 1));
						System.out.println("----------------------------------------------------");
						System.out.println("Tipo de Leche: "+(leches.get(l).getTipo()));
						System.out.println("Prcedencia: "+(leches.get(l).getProcedencia()));
						System.out.println("€/Litro: "+(leches.get(l).getEurosLitro()));
						Distribuidor distribuidor = leches.get(l).getDistribuidor();
						System.out.println("Distribuidor: ");
						System.out.println("\tNombre: "+distribuidor.getNombre());
						System.out.println("\tCIF: "+distribuidor.getCif());
						System.out.println("\tContacto: ");
						System.out.println("\tNombre: "+(distribuidor.getContacto()).getNombre());
						System.out.println("\tApellido: "+(distribuidor.getContacto()).getApellido());
						System.out.println("\tE-mail: "+(distribuidor.getContacto()).getEmail());
						System.out.println("\tTelefono: "+(distribuidor.getContacto()).getTelefono());
						System.out.println("\tDirección: ");
						System.out.println("\tCalle: "+(distribuidor.getDireccion()).getNombreCalle());
						System.out.println("\tNumero: "+(distribuidor.getDireccion()).getNumeroPabellon());
						System.out.println("\tCodigo Postal: "+(distribuidor.getDireccion()).getCodigoPostal());
						System.out.println("\tLocalidad: "+(distribuidor.getDireccion()).getLocalidad());
						System.out.println("\tProvincia: "+(distribuidor.getDireccion()).getProvincia());
						System.out.println("----------------------------------------------------");
					} 
				break;
				default:
					System.out.println("\nNo existe esta opción!");
				break;
				
				case 5: //clientes
					ArrayList<Cliente> clientes = new ArrayList<Cliente>();
					try {
					
						FileInputStream fis = new FileInputStream("clientes.txt");
						InputStreamReader isr = new InputStreamReader(fis, "UTF8");
						BufferedReader br = new BufferedReader(isr);
						String linea = br.readLine();
						while(linea!=null){
							String[] bloques = linea.split("#");//dividir lineas en bloques entre "#"
							String bloque1 = bloques[0];//definir nombres de los bloques
							String bloque2 = bloques[1];
							
							
							
							//dividir los bloques en campos
							//BLOQUE1 (nombre,apellido,dni)
							String[] campo = bloque1.split(","); //bloques[0].split
							String nomcl = campo[0];
							Cliente cliente = new Cliente();
							cliente.setNombre(nomcl);
							String ap = campo[1];
							cliente.setApellidos(ap);
							String ni = campo[2];
							cliente.setDni(ni);
							Direccion direccion = new Direccion();
							campo = bloque2.split(",");
							String nomcalle = campo[0];
							direccion.setNombreCalle(nomcalle);
							int entero = Integer.parseInt(campo[1]);
							direccion.setNumeroPabellon(entero);
							entero = Integer.parseInt(campo[2]);
							direccion.setCodigoPostal(entero);
							String loc = campo[3];
							direccion.setLocalidad(loc);
							String prov = campo[4];
							direccion.setProvincia(prov);
						}
						
						for(int c=0; c < clientes.size(); c++) {
								Direccion direc = new Direccion();
								Cliente cliente = new Cliente();
								System.out.println("\nCliente nº: " + (c + 1));
								System.out.println("============================================");
								System.out.println("Nombre: " + (clientes.get(c).getNombre()));
								System.out.println("Apellidos: " + (clientes.get(c).getApellidos()));
								System.out.println("DNI: " + (clientes.get(c).getDni()));
								direc = clientes.get(c).getDireccion();
								System.out.println("Direccion: ");
								System.out.println("\tCalle: " + direc.getNombreCalle());
								System.out.println("\tNumero: " + direc.getNumeroPabellon());
								System.out.println("\tCodigo postal: " + direc.getCodigoPostal());
								System.out.println("\tLocalidad: " + direc.getLocalidad());
								System.out.println("\tProvincia: " + direc.getProvincia());
								System.out.println("============================================");
							}
					}catch(Exception io) {
						System.out.println("Error: "+io);
					}
				break;
			
			case 6: //leer clientes 2 y meterlo en arraylist cesta
				
				ArrayList<Cliente> clientes2 = new ArrayList<Cliente>();
					try {
					
						FileInputStream fis = new FileInputStream("clientes.txt");
						InputStreamReader isr = new InputStreamReader(fis, "UTF8");
						BufferedReader br = new BufferedReader(isr);
						String linea = br.readLine();
						while(linea!=null){
							String[] bloques = linea.split("#");//dividir lineas en bloques entre "#"
							String bloque1 = bloques[0];//definir nombres de los bloques
							String bloque2 = bloques[1];
						
							
							//dividir los bloques en campos
							//BLOQUE1 (nombre,apellido,dni,num Socio y descuento)
							String[] campo = bloque1.split(","); //bloques[0].split
							String nomcl = campo[0];
							Cliente cliente = new Cliente();
							cliente.setNombre(nomcl);
							String ap = campo[1];
							cliente.setApellidos(ap);
							String ni = campo[2];
							cliente.setDni(ni);
							int entero = Integer.parseInt(campo[3]);
							cliente.setNumeroSocio(entero);
							entero = Integer.parseInt(campo[4]);
							cliente.setDescuento(entero);
							Direccion direccion = new Direccion();
							//dividir bloque 2 direccion (calle, numero, CP, localidad, provincia)
							campo = bloque2.split(",");
							String nomcalle = campo[0];
							direccion.setNombreCalle(nomcalle);
							entero = Integer.parseInt(campo[1]);
							direccion.setNumeroPabellon(entero);
							entero = Integer.parseInt(campo[2]);
							direccion.setCodigoPostal(entero);
							String loc = campo[3];
							direccion.setLocalidad(loc);
							String prov = campo[4];
							direccion.setProvincia(prov);
						}
						
						
					}catch(Exception io) {
						System.out.println("Error: "+io);
						}
				break;	
		
			}	
		}			

    }
}