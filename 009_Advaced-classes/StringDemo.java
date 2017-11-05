class StringDemo {
    public static void main(String[] args) {
        String strObj1 = "First string";
        String strObj2 = "Second string";
        String strObj3 = strObj1 + " and " + strObj2;

        System.out.println(strObj1);
        System.out.println(strObj2);
        System.out.println(strObj3);

        System.out.println("Length of str1 = " + strObj1.length());
        System.out.println("Symbol at index 3 on the second string = " + strObj2.charAt(3));

        if(strObj1.equals(strObj2))
            System.out.println("Str1 == Str2");
        else
            System.out.println("Str1 != Str2");

        if(strObj2.equals(strObj3))
            System.out.println("Str2 == Str3");
        else
            System.out.println("Str2 != Str3");
    }
}
