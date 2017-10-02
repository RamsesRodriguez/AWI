public class Main {
    public static void main(String[] args){

        int j = 10;
        for(int i = 9; i > 0; i--){
            int k = j * i;
            j = k;
            System.out.println(j);
        }
    }
}