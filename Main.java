public class Main {

    public static void main (String[] args) {

        /*   Javadaki Matematik Operatörleri

        +  -->  Toplama Operatörü
        -  -->  Çıkarma Operatörü
        *  -->   Çarpma Operatörü
        /  -->  Bölme Operatörü
        %  -->  Kalan  Operatörü

         */

        System.out.println(3 + 4.2);
        System.out.println( 3 -5 );
        System.out.println( 7 * 5f);
        System.out.println( 10d / 4);
        System.out.println( 10 / 4.0);

        System.out.println(10 % 4);  // 10nun 4 e bölümünden kalan ı göster demek . % işareti bu anlama geliyor.


        int a = 4 ;

        a = a +2;
        System.out.println(a);

        a += 2 ;  // a = a + 2; demek. kısaltması.

        int b = 6 ;
        b = b * 3 ;
        System.out.println(b);

         b *=4 ;  // byi 4 ile çarp ve eşitle demek.  b = b*4 demek
        System.out.println(b);


        int t = 7 ;
        int y = 6;

        t +=1 ;  // t ye 1 ekle eşitle demek
        y -=1;  // y ye 1 azalt eşitle demek.

        t++;   // tye +1 ekle demek
        System.out.println(t);

        y--;  // y ye -1 çıkar
        System.out.println(y);


        int p = 7;
        System.out.println(++p);

        System.out.println( 3 + 4 * 5);  // matematikteki önceliğe göre işlem yapar. önce carma/bölme , sonra toplama cıkarma

        System.out.println( ( 3f /4) + ( 4 * 5)); // kafa karısıklıgını önlemek icin parantez kullan. parantez içleri i,şlem önceliği vardır.









    }
}
