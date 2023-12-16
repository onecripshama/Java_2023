package ru.mirea.lab16;

public class ex5 {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }

    public String getDetails(String key) { //определение условия ошибки
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key;
    }

    public void printMessageSafe(String key) {
        String message = getDetailsSafe(key);
        System.out.println( message );
    }

    public String getDetailsSafe(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }
        catch (NullPointerException e){
            key = "default";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ex5 ex = new ex5();

        ex.printMessageSafe("Key");
        ex.printMessageSafe(null);

        ex.printMessage("Key");
        ex.printMessage(null);
    }
}
//Причиной ошибки, может является, например неправильное
//значение для параметра. Может было бы лучше, если бы метод вызывал
//getDetails() и там решалась бы эта проблема.
