package com.company;

public class Main {


    public static String decision(int ageOfPerson, double temperOutside) {


        if (ageOfPerson > 20 && ageOfPerson < 40 && temperOutside > -20 && temperOutside < 30)
            return "Можно идти гулять1.";

        if (ageOfPerson < 20 && temperOutside > 0 && temperOutside < 28)
            return "Можно идти гулять2.";

        if (ageOfPerson > 45 && temperOutside > -10 && temperOutside < 30)
            return "Можно идти гулять3.";

        else
            return "Оставайтесь дома.";
    }

    public static void main(String[] args) {

        String vozvrat;
        vozvrat = decision(30, -15);
        System.out.println(vozvrat);

        vozvrat = decision(20, 23.5);
        System.out.println(vozvrat);

        vozvrat = decision(55, -5);
        System.out.println(vozvrat);

        vozvrat = decision(40, 35);
        System.out.println(vozvrat);

        vozvrat = decision(10, 0);
        System.out.println(vozvrat);


    }


}



