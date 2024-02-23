package babosjatek;

public class Rendezesek {

    public static int[] Geplep(int[] sorozat) {
        for (int i = sorozat.length-1; i>0; i++){
                if(sorozat[i]> sorozat[i+1]){
                    i++;
                }
            }
         return sorozat;
        }
       
    } 

