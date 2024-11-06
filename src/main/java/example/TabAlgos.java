package example;

public final class TabAlgos {
   /**
    * Renvoie la valeur la plus grande d'un tableau.
    * 
    * @throw IllegalArgumentException si tab et null ou vide.
    **/
   public static int plusGrand(final int[] tab) {
      if (tab == null || tab.length == 0) {
         throw new IllegalArgumentException("Veuillez fournir un tableau non vide");
      }
      int max = tab[0];
      for (int i = 0; i < tab.length; i++) {
         if (tab[i] > max) {
            max = tab[i];
         }
      }
      return max;
   }

   /**
    * Calcul la moyenne des valeurs d'un tableau.
    * 
    * @throw IllegalArgumentException si tab et null ou vide.
    **/
   public static double moyenne(final int[] tab) {
      if (tab == null || tab.length == 0) {
         throw new IllegalArgumentException("Veuillez fournir un tableau non vide");
      }
      double somme = 0;
      for (int i = 0; i < tab.length; i++) {
         somme += tab[i];
      }
      return somme / tab.length;
   }

   /**
    * Teste si 2 tableaux sont identiques (avec les elements dans le meme ordre)
    **/
   public static boolean egaux(final int[] tab1, final int[] tab2) {
      if (tab1.length != tab2.length) {
         return false;
      }
      for (int i = 0; i < tab1.length; i++) {
         if (tab1[i] != tab2[i]) {
            return false;
         }
      }
      return true;
   }
}