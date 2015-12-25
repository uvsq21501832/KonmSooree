package edu.ip.konmsooree;

public class Sooree {
	public static String destination;
	public static String kooser(String destination){
		String sooré;
		Character tableauOrdreAlphabetique[][]={{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'},
													{'1','2','3','4','5','6','7','8','9','1','2','3','4','5','6','7','8','9','1','2','3','4','5','6','7','8'}};
		//transformation de la premiere lettre de destination en majuscule
		char[] char_table = destination.toCharArray();
		char_table[0]=Character.toUpperCase(char_table[0]);
		String param1 = new String(char_table);
		
		//recuperation de la longueur de destination
		int param2=destination.length();
		
		//recuperation de la lettre de milieu de destination
		Character param3=destination.charAt(param2/2);
		
		//conversion de param3 en entier (son ordre alphabetique appliqué a la preuve de multiplication)
		Character param4='0';
		int i=0,j=0;
		/*for(;i<26;i++){
			if(tableauOrdreAlphabetique[i][0]==param3) param4=tableauOrdreAlphabetique[0][i];
		}*/
		
		while (i < 2)
		{
		  j = 0;
		  while(j < 26)
		  {
		    
			  if(tableauOrdreAlphabetique[i][j]==param3)
				  param4=tableauOrdreAlphabetique[1][j];
		    j++;
		  }
		  //System.out.println("");
		  i++;
		}
		
		
		sooré=param1+""+param2+""+param4;
		return sooré;
	}

}
