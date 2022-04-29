
public class appleAndOrange {
    public static void main(String[] args) {
        
        int start = 7;
        int end =11;
        int a =5;
        int b=15;

        int mApple = 3;
        int nOrange=2;
        int[] apple ={-2,2,1};
        int[] orange ={6,-6};

        int Adistance =0;
        int countA =0;
        int countO=0;
        for (int i: apple){
            Adistance = i+ a;
            if(Adistance>=start && Adistance<=end)
                countA++;

        }

        for(int i: orange){
            Adistance = i+b;
            if(Adistance>=7 && Adistance<=11)
            countO++;
        }

        System.out.println(countA +  "  " + countO);

        }
    
}
