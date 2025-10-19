public class Main{
    public static void main(String[] args) {
        ManageGrades mg = new ManageGrades();
        int[] note = {29, 37, 38, 41, 84, 67};
        boolean hasInvalid = false;
        for (int n : note) {
            if (n < 0 || n > 100) {
                System.out.println("Ungültiger Wert: " + n);
                hasInvalid = true;
            }
        }
        if (hasInvalid) {
            return;
        }
        //1
        int[] nichtAusreichender = mg.nichtAusreichenderNote(note);
        System.out.print("Nicht Ausreichender Note: ");
        for(int n:nichtAusreichender){
            System.out.print(n + " ");
        }
        System.out.println();
        //2
        double Durchschnittswert = mg.Durchschnittswert(note);
        System.out.println("Durchschnittswert: " + Durchschnittswert);
        //3
        int[] abgerundetenNoten = mg.abgerundetenNoten(note);
        System.out.print("Abgerundeten Noten: ");
        for(int n:abgerundetenNoten){
            System.out.print(n + " ");
        }
        System.out.println();
        //4
        int max = mg.maximalAbgerundeteNote(note);
        System.out.println("MaximalAbgerundeteNote: " + max);
    }

}
