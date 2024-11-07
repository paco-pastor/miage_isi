package example;

/**
 * Classe utilitaire contenant des algorithmes pour les tableaux.
 */
public final class TabAlgos {

   /**
    * Constructeur privé pour empêcher l'instanciation
    * de cette classe utilitaire.
    */
   private TabAlgos() {
      throw new UnsupportedOperationException(
         "Cette classe ne peut pas être instanciée"
      );
   }

   /**
    * Renvoie la valeur la plus grande d'un tableau.
    *
    * @param tab le tableau d'entiers à examiner
    * @return la valeur maximale du tableau
    * @throws IllegalArgumentException si tab est null ou vide
    **/
   public static int plusGrand(final int... tab) {
      if (tab == null || tab.length == 0) {
         throw new IllegalArgumentException(
            "Veuillez fournir un tableau non vide"
         );
      }
      int max = tab[0];
      for (int value : tab) { // Remplacement par une boucle foreach
         if (value > max) {
            max = value;
         }
      }
      return max;
   }

   /**
    * Calcule la moyenne des valeurs d'un tableau.
    *
    * @param tab le tableau d'entiers dont on veut calculer la moyenne
    * @return la moyenne des valeurs du tableau
    * @throws IllegalArgumentException si tab est null ou vide
    **/
   public static double moyenne(final int... tab) {
      if (tab == null || tab.length == 0) {
         throw new IllegalArgumentException(
            "Veuillez fournir un tableau non vide"
         );
      }
      double somme = 0;
      for (int value : tab) { // Remplacement par une boucle foreach
         somme += value;
      }
      return somme / tab.length;
   }

   /**
    * Teste si 2 tableaux sont identiques
    * (avec les éléments dans le même ordre).
    *
    * @param tab1 le premier tableau à comparer
    * @param tab2 le deuxième tableau à comparer
    * @return true si les tableaux sont identiques, false sinon
    **/
   public static boolean egaux(final int[] tab1, final int... tab2) {
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
