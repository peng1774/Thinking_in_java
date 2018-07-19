public class Test{
    public static void main(String[] args){
           //
           Test.Bean1 bean1 = new Test().new Bean1();
           bean1.I++;
           //
           Bean2 bean2 = new Test.Bean2();
           bean2.J++;
           //
           Bean.Bean3 bean3 = new Bean().new Bean3();
           bean3.k++;
    }
    class Bean1{
           public int I = 0;
    }
 
    static class Bean2{
           public int J = 0;
    }
}
 
class Bean{
    class Bean3{
           public int k = 0;
    }
}