package Ex_4;

public class figure4 {
    public static void main(String[] args){
        for(int i=0; i <= 10; i++){
            for(int j = 0; (j<i) && (j <= 10-i); j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
