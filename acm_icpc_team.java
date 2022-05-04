
import java.util.Arrays;
import java.util.List;

public class acm_icpc_team{
        public static void main(String[] args) {
            // String[] s={"10101","11100","11010","00101"};
            String[] s={"10101","11110","00010"};
            List<String> topic = Arrays.asList(s);

           int maxTeam =0; int maxSkill=0;
            for(int m =0; m < topic.size(); m++){
                for (int n=m+1; n<topic.size(); n++){
                    String skill1 = topic.get(m);
                    String skill2 = topic.get(n);
                    int total =0; 
                    for(int j=0; j<topic.get(0).length(); j++){
                        Character c1 = skill1.charAt(j);
                        Character c2 = skill2.charAt(j);
                        if(c1.equals('1') || c2.equals('1'))
                            total++;
                     }
                     maxTeam +=(maxSkill == total) ? 1:0;

                     if(total > maxSkill){
                         maxTeam =1;
                         maxSkill = total;
                     }
                }
            }


            System.out.println(maxSkill +" "+maxTeam);
        }
    }

// https://www.hackerrank.com/challenges/acm-icpc-team/problem?isFullScreen=true     


    // 2) runtime

    // public static void main(String[] args) {
    //     // String[] s={"10101","11100","11010","00101"};
    //     String[] s={"10101","11110","00010"};
    //     List<String> topic = Arrays.asList(s);

    //     List<Integer> topicInInt = new ArrayList<>();
    //     List<Integer> count = new ArrayList<>();
    //     List<Integer> last = new ArrayList<>();

    //     for(String str: topic){
    //         topicInInt.add(Integer.parseInt(str));
    //     }

    //     int length =0; int max =0;
    //     for(int j=0; j< topicInInt.size(); j++){
    //         for(int k=1 ; k!=j && k< topicInInt.size(); k++){
    //               length= checkTopic(topicInInt.get(j)+topicInInt.get(k));
    //                 count.add(length);
    //                 // System.out.println(length);
    //                 }
                    
    //             }
                
    //     Collections.sort(count, Comparator.reverseOrder());
    //     int c=0;
    //     for(int i : count)
    //         if(i == count.get(0))
    //             c++;
        
    //     last.add(count.get(0)); last.add(c);
    //     System.out.println(last);
    // }

    // private static int checkTopic(int topic){
         
    //     // int topic =120080310;

    //     String str = String.valueOf(topic);

    //     int count =0;
    //     for(char c: str.toCharArray()){
    //         if(c != '0')
    //             count ++;
    //     }

    //     return count;



    // }
// }