package chapter_7;
// demonstrate some methods from  String class
public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = " The first string";
        String strOb2 = " The second string";
        String strOb3 = strOb1;
        System.out.println("string length strOb1 : " + strOb1.length());
        System.out.println(" Character at index 3 in string strOb1 : " +
                strOb1.charAt(6));
        if( strOb1.equals(strOb2))
            System.out.println("strOb1 == str0b2");
else
            System.out.println("strOb1 !== str0b2");
        if ( strOb1.equals(strOb3))
            System.out.println(" strOb1 ==  strObЗ ");
else
        System.out.println(" strOb1 !==  strObЗ ");
    }
}
