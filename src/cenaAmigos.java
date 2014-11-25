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

 	Receta rc = new Receta("",,"");
 	Ingrediente ingre = new Ingrediente("",,,);

 	ArrayList <Ingrediente> ingredientes = new ArrayList <Ingrediente>();

 	ArrayList <Receta> recetas = new ArrayList <Receta>();

 	for (int x=0;x<n_recetas;x++)
 	{
 		System.out.println("Nombre de receta: ");
 		nom_rc=sc.next();

 		System.out.println("Numero de Ingredientes: ");
 		num_ing=sc.nextInt();
 		for (int y=0;y<num_ing;y++)
 		{
 			System.out.println("Ingrediente");
 			String ing=sc.next();


 			System.out.println("Cantidad en Gramos:");
 			int can1=sc.nextInt();
 			if (can1!= null || 0)
 			{
 				opcion=true
 			}
 			
 			
 			System.out.println("Cantidad en Unidades: ");
 			int can2=sc.nextInt();


 			


 			ingrediente.add(new Ingrediente(ing,can1,can2,opcion)

 		}

 		System.out.println("Preparacion: ");
 		String pre=sc.next();
 		

 		recetas.add(new Receta(nom_rc,ingrediente,pre))


 	}



 	    String ruta = "recetas.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();


    }
    


		
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
            	for (int l=0;l<ontador_token2;i++)

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



  }


 }