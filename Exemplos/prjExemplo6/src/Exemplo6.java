
/**
 *
 * @author André
 */
public class Exemplo6 {
    public static void main(String args[]){
        int tabNum [];
        int cont;
        
        tabNum = new int[3];
        
        tabNum[0]=34;
        tabNum[1]=18;
        tabNum[2]=27;
        
        for (cont=0;cont < 3;cont++){
            System.out.print("Conteudo de tabNum[" + cont +"]= ");
            System.out.println(tabNum[cont]);
        }
    }
}
