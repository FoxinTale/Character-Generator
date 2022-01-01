import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Generate {
    public static String[] getColour(){
        int colourNum = ThreadLocalRandom.current().nextInt(Lists.colourNamesLength);
        String colourName = Lists.colourNames.get(colourNum);
        String colourCode = Lists.coloursMap.get(colourName);
        return new String[]{colourName, colourCode};
    }

    public static String getName(){
        StringBuilder name = new StringBuilder();
        name.append(getNamePart());
        name.append(" ");
        if(GUI.genMiddleName){
            name.append(getNamePart());
            name.append(" ");
        }
        name.append(getSurname());
        return name.toString();
    }

    public static String getNamePart(){
        int num = ThreadLocalRandom.current().nextInt(101);
        if(num <= 50){
            return getMaleName();
        } else {
            return getFemaleName();
        }
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

    public static String getNaturalHair(){
        int num = ThreadLocalRandom.current().nextInt(Lists.hairColoursLength);
        return Lists.hairColours.get(num);
    }

    public static String[] getHairColour(){
        int r = ThreadLocalRandom.current().nextInt(255);
        int g = ThreadLocalRandom.current().nextInt(255);
        int b = ThreadLocalRandom.current().nextInt(255);

        String colourHex = String.format("#%02x%02x%02x", r, g, b);
        String[] hairColourArray= new String[4];

        hairColourArray[0] = Integer.toString(r);
        hairColourArray[1] = Integer.toString(g);
        hairColourArray[2] = Integer.toString(b);
        hairColourArray[3] = colourHex;

        return hairColourArray;
    }

    public static String getPosTraits(String option){
        int amount = Integer.parseInt(option);
        String[] traits = new String[amount];

        for(int i =0; i < amount; i++){
            traits[i] = getPosTrait();
        }
        return Arrays.toString(traits).replace('[', ' ').replace(']', ' ').strip();
    }

    public static String getNegTraits(String option){
        int amount = Integer.parseInt(option);
        String[] traits = new String[amount];

        for(int i =0; i < amount; i++){
            traits[i] = getNegTrait();
        }
        return Arrays.toString(traits).replace('[', ' ').replace(']', ' ').strip();
    }

    public static String getPosTrait(){
        int num = ThreadLocalRandom.current().nextInt(Lists.posTraitsLength);
        return Lists.posTraits[num];
    }
    public static String getNegTrait(){
        int num = ThreadLocalRandom.current().nextInt(Lists.negTraitsLength);
        return Lists.negTraits[num];
    }

}
