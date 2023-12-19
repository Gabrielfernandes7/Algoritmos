import java.util.Scanner;

public class tarefa1042 {    
    
    private static int[] ordernarValores(int[] meuArray) {
        for(int i = 0; i < meuArray.length - 1; i++) {
            if (meuArray[i] > meuArray[i + 1]) {
                int temp = meuArray[i];
                meuArray[i] = meuArray[i + 1];
                meuArray[i + 1] = temp;
            }
        }
        return meuArray;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
    }
}
