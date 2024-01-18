

public class GoogleBillboard {
	public final static String e = "27182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
	  String str;
	  for (int i = 0; i < e.length(); i++){
	    str = e.substring(i, i+10);
	    if (isPrime(Double.parseDouble(str)) == true){
	      System.out.println(str);
	      break;
	    }
	  }
	}
	

	//Finish this function
	public static boolean isPrime(double num){
	  for (int i = 2; i <= (int)(Math.sqrt(num)); i++){
	    if(num%i == 0){
	      return false;
	    }
	  }  
	  return true;
	}
}

