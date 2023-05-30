package chapter_4;
//demonstrate the use of bitwise logical operations
public class BitLogic {
    public static void main(String[] args) {
        String [] binary  = {"0 0 0 0 ", "0 0 0 1", "0 0 1 0", "0 0 1 1" ,"0 1 0 0" ,"0 1 0 1", "0 1 1 0", "0 1 1 1" ,
                    "1 0 0 0", "1 0 0 1", "1 0 1 0", "1 0 1 1", "1 1 0 0", "1 1 0 1", "1 1 1 0" ,"1 1 1 1"};

            int a = 3; // О + 2 + 1 , or  0011 in binary representation
            int b =  6; // 4 + 2 + О , or 0110 in binary representation
            int c =  a | b;
            int d = a & b;
            int e = a ^ b;
            int f = ( ~a & b ) | ( a & ~b );
            int g = ~a & 0x0f ;
            System.out.println( " а = " + binary [a]);
            System.out.println( " Ь = " + binary [b]);
            System.out.println( " a | b " + binary [c]);
            System.out.println( " а&b " + binary [d] );
            System.out.println( " а&b " + binary [e]);
            System.out.println( " ~a&b l a& ~b = " + binary [f]);
            System.out.println( " ~а = " + binary [g]);
    }
}
