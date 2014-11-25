

public class Ingrediente {

	 private String nombreIngrediente;
	 private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos; 
	


	public void setNombreIngrediente(String nombreIngrediente)
    {
        this.nombreIngrediente=nombreIngrediente;
    }
    public void setCantidadGramos(Integer cantidadGramos)
    {
        this.cantidadGramos=cantidadGramos;
    }
    public void setCantidadUnidad(Integer cantidadUnidad)
    {
        this.cantidadUnidad=cantidadUnidad;
    }
     
    public void setEnGramos(boolean enGramos)
    {
        this.enGramos=enGramos;
    }

 	
	public String getNombreIngrediente() 
 	{	
	return nombreIngrediente;
 	}

 	public int getCantidadGramos() 
 	{	
	return cantidadGramos;
 	}
 	public int getCantidadUnidad() 
 	{	
	return cantidadUnidad;
 	}
 	public boolean getEnGramos() 
 	{	
	return enGramos;
 	}

}
