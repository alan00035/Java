interface inter{
    String test();
}

public class test {
    public static void main(String[] args) {
        int a =10;

    inter inter =()->{
        return null;
    }; 

    System.out.println(inter.test());
        
    }

    
    
}

class myTest implements inter{

    @Override
    public String test() {

        return "string";
    }
    
}
