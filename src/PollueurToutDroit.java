
class PollueurToutDroit extends RobotPollueur
{

   int colDepart;

   public void parcourir()
   {
      int i,
          nbL=this.monMonde.nbL;

      for(i=0;i<nbL;i++)
      {
         vaEn(i,colDepart);
         polluer();
      }
   }

}