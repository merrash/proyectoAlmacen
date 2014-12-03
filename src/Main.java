import java.util.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws IOException {
       
        try {

			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
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
				int entero = Integer.parseInt(campos2[2]);
				direccion.setNumeroPabellon(entero);
				entero = Integer.parseInt(campos2[3]);
				direccion.setCodigoPostal(entero);
				direccion.setLocalidad(campos2[4]);
				direccion.setProvincia(campos2[5]);
				char [] arr = (campos2[5]).toCharArray();
				

				distribuidor.setDireccion(direccion);

				distri = campos[2];
				campos2 = distri.split(",");
				contacto.setNombre(campos2[0]);
				contacto.setApellido(campos2[1]);
				entero = Integer.parseInt(campos2[3]);
				contacto.setTelefono(entero);
				contacto.setEmail(campos2[2]);

				distribuidor.setContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();
			}

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

    }
}