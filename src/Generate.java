import java.util.concurrent.ThreadLocalRandom;

public class Generate {
    public static String[] getColour(){
        int colourNum = ThreadLocalRandom.current().nextInt(Lists.colourNamesLength);
        String colourName = Lists.colourNames.get(colourNum);
        String colourCode = Lists.coloursMap.get(colourName);
        return new String[]{colourName, colourCode};
    }

    public static String getName(int value){
        /*
        If the input value is less than 50, favour male names, but female names are still possible. The lower the value the higher chance of male names.
        If the input value is more than 50, favour female names, but male names are still possible.
        If it is exactly 50, then flip a virtual coin, basically.
         */
        String name = "";
        int num;
        if(value < 50){
            if(value == 0){
                System.out.println(getMaleName());
            } else {
                int newValue = value *  2;
                //System.out.println(newValue);
                num = ThreadLocalRandom.current().nextInt(0, 50);
                System.out.println("Generated Number: " + num + " || " + "Value: " + value);
                if(num <= value){
                    System.out.println("Male name here");
                    //name = getMaleName();
                } else {
                    System.out.println("Female name here");
                    //name = getFemaleName();
                }
            }
        } else if( value == 50){
            num = ThreadLocalRandom.current().nextInt(0, 100);
            if(num < 50){

            } else{

            }
        } else {
            //
        }

        return name;
    }

    public static String getFemaleName(){
        int nameNum = ThreadLocalRandom.current().nextInt(Lists.femNamesLength);
        return Lists.femaleNames[nameNum];
    }

    public static String getMaleName(){
        int nameNum = ThreadLocalRandom.current().nextInt(Lists.maleNamesLength);
        return Lists.maleNames[nameNum];
    }

    public static String getSurname(){
        int nameNum = ThreadLocalRandom.current().nextInt(Lists.surnamesLength);
        return Lists.surnames[nameNum];
    }

    public static String getGender(){
        int num = ThreadLocalRandom.current().nextInt(Lists.gendersLength);
        return Lists.genders.get(num);
    }

    public static String getSexuality(){
        int num = ThreadLocalRandom.current().nextInt(Lists.sexualitiesLength);
        return Lists.sexualities.get(num);
    }
}
