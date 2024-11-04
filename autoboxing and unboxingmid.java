class Main
{ 
    public static void main(String[] args) { 
        int num = 10; 
        Integer autoboxedNum = num; // Auto-boxing 
        Integer anotherNum = 20; 
        int autounboxedNum = anotherNum; // Auto-unboxing 
        System.out.println("Auto-boxed value: " +autoboxedNum); 
        System.out.println("Auto-unboxed value: " +autounboxedNum); 
    } 
}
output:
Auto-boxed value: 10
Auto-unboxed value: 20
