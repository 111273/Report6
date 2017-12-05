package jp.ac.uryukyu.ie.e175747;

public class Main {
    public static void main(String[] args){
        String str ="3．14";
        try{

            double value = Double.parseDouble(str);

        }catch(Exception e){

            System.out.println("NullPointerExceptionが報告されました");
            System.out.println(e.getMessage());

        }
    }
}