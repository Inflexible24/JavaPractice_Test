package day11;
/*
2. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"
 */

public class Elevator {
    public static void main(String[] args) {

        int floorN =2;

        String result = "";

        String companies ="";

        switch (floorN){
            case 1:
                result="Floor 1 selected";
                companies="Lobby, Verizon, Starbucks";
                break;
            case 2:
                result="Floor 2 selected";
                companies="Cybertek, Nasa, Intelsat";
                break;
            case 3:
                result="Floor 3 selected";
                companies="Lyft, Bofa, Stake house";
                break;
            default: result= "Invalid floor";
            break;

        }

        System.out.println(result+" "+ companies);
    }
}
