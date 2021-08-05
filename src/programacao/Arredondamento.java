package programacao;

public class Arredondamento {
    
    public static void main(String[] args) {
        
        double valor = 9.78127012;
        System.out.println("Inteiro mais próximo: " + Math.round(valor));
        System.out.println("Inteiro do número: " + Math.floor(valor));
        System.out.println("Valor arredondado: " + (double) Math.round(valor * 100) / 100);
        
    }
        
        public static double arredondarValor(double valor){
            
        return (double) Math.round(valor * 100) / 100;
            
        }
        
    
}
