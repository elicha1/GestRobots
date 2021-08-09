class Monde
{

   int nbL=10, nbC=10;
   boolean [][] mat= new boolean[nbL][nbC];

   Monde()
   {
      int i,j;

      for(i=0;i<nbL;i++)
         for(j=0;j<nbC;j++)            
            mat[i][j]=false;
   }

	public String toString()
        {
           StringBuffer sb = new  StringBuffer();
	   sb.append("\n");
	
           for (int i=0;i<nbL;i++)
	   {
	      for (int j=0;j<nbC;j++)
	      {
                 sb.append(" ");
  
                 if(mat[i][j])
	         {
                    sb.append("X");

                 } else
                 {
                    sb.append(".");
                 }
                 
	      }

              sb.append("\n");
           }

           return sb.toString(); 
       }

   public void pollue(int i, int j)
   {
       mat[i][j]=true;
   }
  
   public void nettoie(int i, int j)
   {
       mat[i][j]=false;
   }
  
   public boolean estSale(int i,int j)
   {
      return mat[i][j];
   }

   public void affiche()
   {
      System.out.println(this);
   }



}
