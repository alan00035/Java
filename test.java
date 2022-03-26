import java.math.BigDecimal;
import java.math.BigInteger;

interface inter{
    String test();
}

public class test {
    public static void main(String[] args) {
        int a =3;

        System.out.println( new BigInteger(String.valueOf(a)).isProbablePrime(1));

       
        
    inter inter =()->{
        return null;
    }; 

    System.out.println(inter.test());
        
    }

    
    
}

// class myTest implements inter{

//     @Override
//     public String test() {

//         return "string";
//     }
    
// }


// public static void main(String[] args) throws IOException {
//     MyMath ob = new MyMath();
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     int T = Integer.parseInt(br.readLine());
//     PerformOperation op;
//     boolean ret = false;
//     String ans = null;
//     while (T--> 0) {
//      String s = br.readLine().trim();
//      StringTokenizer st = new StringTokenizer(s);
//      int ch = Integer.parseInt(st.nextToken());
//      int num = Integer.parseInt(st.nextToken());
//      if (ch == 1) {
//       op = ob.isOdd();
//       ret = ob.checker(op, num);
//       ans = (ret) ? "ODD" : "EVEN";
//      } else if (ch == 2) {
//       op = ob.isPrime();
//       ret = ob.checker(op, num);
//       ans = (ret) ? "PRIME" : "COMPOSITE";
//      } else if (ch == 3) {
//       op = ob.isPalindrome();
//       ret = ob.checker(op, num);
//       ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
  
//      }
//      System.out.println(ans);
//     }
//    }