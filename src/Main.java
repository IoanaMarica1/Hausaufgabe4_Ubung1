public class Main{
    public static void main(String[] args) {
        ManageGrades mg = new ManageGrades();
        int[] note = {22,87,98,30,24,57,39};
        int[] nichtAusreichender = mg.nichtAusreichenderNote(note);
        for(int n:nichtAusreichender){
            System.out.print(n + ",");
        }
        System.out.println();
    }
}
