package day10;

public class AgeGroups {

    public static void main(String[] args) {

        int age= 20;


        boolean valid =age >=0 && age<=150;

        String result ="";

        if (valid){

            if (age >= 55){
                result= "senior";
            }else if (age >=21){
                result= "Adult";
            }else{
                result= "Teenager";
            }
        }else{
            result= "Invalid";
        }

        System.out.println(result);
















    }
}
