import java.util.*;
import java.io.*;


public class cenaAmigos {
	public static void main (String[] args)  throws IOException  {
int n_recetas;
String nom_rc;
int num_ing;
boolean opcion = false;

 	Scanner sc = new Scanner(System.in);
 	System.out.println("Numeros de recetas que vas a utilizar: ");
 	n_recetas=sc.nextInt();

 	
 

 	ArrayList <Ingrediente> ingredientes = new ArrayList <Ingrediente>();

 	ArrayList <Receta> recetas = new ArrayList <Receta>();

 	for (int x=0;x<n_recetas;x++)
 	{
 		Receta rc = new Receta();
 		System.out.println("Nombre de receta: ");
 		nom_rc=sc.next();
 		rc.setNombreReceta(nom_rc);

 		System.out.println("Numero de Ingredientes: ");
 		num_ing=sc.nextInt();
 		for (int y=0;y<num_ing;y++)
 		{
 			Ingrediente ingre = new Ingrediente();
 			System.out.println("Ingrediente");
 			String ing=sc.next();
 			ingre.setNombreIngrediente(ing);


 			System.out.println("Cantidad en Gramos:");
 			int can1=sc.nextInt();
 			char enGramos;
				do{
					System.out.println("La cantidad es en gramos?(Y/N)");
					enGramos = sc.next().charAt(0);
					switch (enGramos) {
						case 'Y':
							ingre.setEnGramos(true);
							System.out.println("Dame la cantidad en gramos");
							ingre.setCantidadGramos(sc.nextInt());
							break;
						case 'N':
							ingre.setEnGramos(false);
							System.out.println("Dame la cantidad en unidades");
							ingre.setCantidadUnidad(sc.nextInt());
							break;
						default:
							System.out.println("Lo siento, inténtalo otra vez");
							break;
					}
				} while((enGramos != 'Y') && (enGramos != 'N'));

 			ingredientes.add(ingre);

 		}

 		System.out.println("Preparacion: ");
 		String pre=sc.next();
 		rc.setPreparacion(pre);
 		

 		recetas.add(rc);


 	}



 	   File archivo = new File ("/home/zubiri/examen_receta/src/recetas.txt");
		FileWriter fw = new FileWriter (archivo);

		for (int k=0; k<recetas.size(); k++) {

			fw.write(recetas.get(k).getNombreReceta() + ";");

			for (int l=0; l<ingredientes.size(); l++) {
				fw.write(ingredientes.get(l).getNombreIngrediente() + "*");
				fw.write(ingredientes.get(l).getCantidadUnidad() + "*");
				fw.write(ingredientes.get(l).getCantidadGramos() + "*");
	
				if (l == ingredientes.size() - 1) {
				fw.write(ingredientes.get(l).getEnGramos() + ";");
				}
				else {
				fw.write(ingredientes.get(l).getEnGramos() + "#");
				}

			}

			fw.write(recetas.get(k).getPreparacion() + "\n");
	
		}

    
    


		/*
		FileReader fr = new FileReader("recetas.txt");
    	BufferedReader br = new BufferedReader(fr); 
	
		 
		while((String contenido = br.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(contenido,";","#");
			StringTokenizer st2 = new StringTokenizer(contenido,"*");
			int contador_token1 = st.countTokens();
			int contador_token2 = st2.countTokens();
        	String[] array_separados = new String[contador_token1];
        	String[] array_separados2 = new String[contador_token2];
			 for (int i=0;i<contador_token1;i++)
            {
            	for (int l=0;l<contador_token2;i++)

                array_separados[i] = st.nextToken();
            }
		recetas.add(new Receta(array_separados[0],array_separados[1],array_separados[2],array_separados2[0],array_separados2[1],array_separados2[2]));
		}
	
		for(int i=0; i<recetas.size(); i++)
	     {
	            System.out.println("  nombre receta: "+recetas.get(i).getNombreReceta() +" Ingrediente: "+recetas.get(i).getApellido1()+" segundo apellido: "+ habi.get(i).getApellido2()+" direccion: "+ habi.get(i).getDireccion()
	            +" edad: "+habi.get(i).getEdad()+" dni: "+habi.get(i).getDni());
	     }
	            
	        //Vaciar el ArrayList
	    	recetas.clear();
*/


  }


 }