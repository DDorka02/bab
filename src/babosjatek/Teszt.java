
package babosjatek;

public class Teszt {

        public static void assertek() {
        int[] sor1 = {};
        assert rendezettE(Rendezesek.Geplep(sor1)):"Üresen nem működik"; 
        
        int[] sor2 = {3,6,9,12,15,18};
        assert rendezettE(Rendezesek.Geplep(sor2)):"G"; 
        
        int[] sor3 = {1,2,4,5,7,8,10,11,13,14,16,17,19,20};
        assert rendezettE(Rendezesek.Geplep(sor3)):"J";
        }
    
    public static boolean rendezettE(int[] sor) {
        return false;
        
        
    }
    
    }
    

