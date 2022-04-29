
public class numberLineJumps {
    public static void main(String[] args) {
        int x1 =43;
        int v1=2;
        int x2 =70;
        int v2=2;

       if(v2>v1 | v2==v1){
        System.out.println("NO");
       }
       else{
          if (Math.abs(x1-x2)%(v1-v2) == 0){
              System.out.println("YES");
          }
          else
            System.out.println("NO");
       }
    }
    
}
