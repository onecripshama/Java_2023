package ru.mirea.lab16;
import java.util.Scanner;

public class ex7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ex7 gg = new ex7();
        try {
            gg.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
// Причиной полученной ошибки является выражение throw е.
//Пояснение. В данном случае метод printDetails () решил, что он не может
//иметь дело с исключением и проходит все дерево его вызовов. Поскольку
//метод getKey() не имеет блока try-catch для обработки исключений, то Java
//становится перед выбором, что в таком случае делать.