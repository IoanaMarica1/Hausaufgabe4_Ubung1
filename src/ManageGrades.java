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
    //2
    public double Durchschnittswert(int[] Note){
        int cnt = 0;
        int sum = 0;
        for(int n:Note){
            cnt++;
            sum+=n;

        }
        double Durchschnittswert;
        Durchschnittswert= (double) sum /cnt;
        return Durchschnittswert;
    }
    //3
    public int[] abgerundetenNoten(int[] Note){
        int cnt = 0;
        for(int n:Note){
            cnt++;
        }
        int[] abgerundetenNoten = new int[cnt];
        int index=0;
        for(int n:Note){
            if(n<38){
                abgerundetenNoten[index]=n;
                index++;
            }
            else{
                int multiple = (n/5+1)*5;
                if(multiple-n<3){
                    abgerundetenNoten[index]=multiple;
                    index++;
                }
                else{
                    abgerundetenNoten[index]=n;
                    index++;
                }
            }
        }
        return abgerundetenNoten;
    }

}
