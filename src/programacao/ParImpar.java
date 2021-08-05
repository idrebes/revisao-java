package programacao;

public class ParImpar {
    
    public static void main(String[] args) {
        
        int array [] = {2,5,8,6,7,10,55,88,137};
        int par;
        int impar;
        
        for(int i = 0; i < array.length; i++){
            if(Par(array[i])){
                System.out.println(array[i] + " - PAR");
            }
            if(!Par(i)){
                System.out.println(i + " - IMPAR");
            }
        }
        
    }
    
    private static boolean Par(int numero){
        
        return (numero % 2 == 0);
        
    }
    
}
