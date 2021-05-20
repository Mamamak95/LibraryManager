package library;



public class Encryption {
    public static String encryption(String name){
        Crypto crypto=new Encrypt();
        String data=name;
        String enc= new String(crypto.encrypt(data.getBytes()));
        return enc;

    }
}
