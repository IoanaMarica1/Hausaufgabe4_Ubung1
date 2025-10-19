public class ManageGrades {
    //1
    public int[] nichtAusreichenderNote(int[] Note){
        int cnt = 0;
        for(int n:Note){
            if(n<40)
                cnt++;
        }
        int[] nichtAusreichender = new int[cnt];
        int index=0;
        for(int n:Note){
            if(n<40) {
                nichtAusreichender[index]=n;
                index++;
            }
        }
        return nichtAusreichender;
    }


}
