public class Kata01 {

    public static String partsLeft(boolean CPU, boolean motherboard, boolean ram,
                                   boolean GPU, boolean hardDrive, boolean powerSupply,
                                   boolean desktopCase, boolean lights) {


        if(CPU && motherboard && ram && GPU && hardDrive && powerSupply && desktopCase && lights){
            return "Your PC is ready to build!";
        }
        if(!CPU && !motherboard && !ram && !GPU && !hardDrive && !powerSupply && !desktopCase && !lights){
            return "No items bought!";
        }

        StringBuffer sb = new StringBuffer();
        if(!CPU){
            sb.append("CPU, ");
        }
        if(!motherboard){
            sb.append("motherboard, ");
        }
        if(!ram){
            sb.append("ram, ");
        }
        if(!GPU){
            sb.append("GPU, ");
        }
        if(!hardDrive){
            sb.append("hardDrive, ");
        }
        if(!powerSupply){
            sb.append("powerSupply, ");
        }
        if(!desktopCase){
            sb.append("desktopCase, ");
        }
        if(!lights){
            sb.append("lights, ");
        }
        String trim = sb.toString().trim();
        String substring = trim.substring(0, trim.length() - 1);
        String s = substring + ".";
        return s;
    }
}
