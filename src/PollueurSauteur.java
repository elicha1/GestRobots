class PollueurSauteur extends RobotPollueur
{
   int colDepart;
   int deltax;

   public void parcourir()
   {
      int i,j,nbL=this.monMonde.nbL;

      i=0;		
     /* j=colDepart;		*/
      while (i!=nbL)
      {  
         if(i%2==0)
            j=colDepart%nbL;
         else j=(colDepart+deltax)%nbL;

         vaEn(i,j);
 	 polluer();
         i++;
      }
   }	


}