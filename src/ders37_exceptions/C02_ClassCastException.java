package ders37_exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {

         short sayi1=23;
         int sayi2=sayi1;

         Short sayi3=24;
         // Integer sayi4=sayi3; Integer ve Short arasinda parent-child iliskisi olmadigindan
                                 //birbirine atama yapamazsiniz

            // aralarinda parent-child iliskisi olan class'lardan olusan objeler icin
        //auto-widening veya explicit -noarrowing mumkunudr

        Object obj=sayi3;
        System.out.println("Short'dan obje'ye cast edince : "+ obj);

        Integer sayi5= (Integer) obj;
        System.out.println("short datayi obje uzerinden Integer'a cevirince :"+sayi5);
        //Exception in thread "main" java.lang.ClassCastException: class java.lang.Short cannot be cast to class java.lang.Integer (java.lang.Short and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at ders37_exceptions.C02_ClassCastException.main(C02_ClassCastException.java:17)


    }
}
