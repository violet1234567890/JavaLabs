import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manul manul1 = new Manul("low");
        Manul manul2 = new Manul("jim");
        Manul manul3 = new Manul("cknjfdb");
        Lynx ly1 = new Lynx("LA");
        Lynx ly2 = new Lynx("LB");
        Lynx ly3 = new Lynx("LC");
        Lynx ly4 = new Lynx("LD");
        ArrayList<Chordates> chors = new ArrayList<>();
        chors.add(manul1);
        chors.add(ly1);
        ArrayList<Manul> manuls = new ArrayList<>();
        manuls.add(manul1);
        manuls.add(manul2);
        manuls.add(manul3);
        CommonHedgehog heg1 = new CommonHedgehog("CH1");
        CommonHedgehog heg2 = new CommonHedgehog("CH2");
        CommonHedgehog heg3 = new CommonHedgehog("CH3");
        ArrayList<Feline> felines = new ArrayList<>();
        felines.add(manul1);
        felines.add(ly1);
        ArrayList<Predatory> preds = new ArrayList<>();
        preds.add(ly2);
        preds.add(ly4);
        preds.add(manul1);
        preds.add(manul2);
        ArrayList<Insectivores> insectivores = new ArrayList<>();
        insectivores.add(heg1);
        insectivores.add(heg2);
        ArrayList<Mammals> mamms = new ArrayList<>();
        mamms.add(manul1);
        mamms.add(heg2);
        try {
            //Segregation.segregate(manuls, chors, mamms, preds);
            Segregation.segregate(preds, insectivores, mamms, felines);
        } catch (Exception e) {
            System.err.println(e.getMessage());;
        }
        System.out.println("CONTENTS OF MAMMALS LIST");
        for (Mammals c : mamms) {
            System.out.println(c.getName());
        }
        System.out.println("CONTENTS OF FELINES LIST");
        for (Feline c : felines) {
            System.out.println(c.getName());
        }
    }
}