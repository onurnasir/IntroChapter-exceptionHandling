public class Main {

    public static void main(String[] args) {

      try {
          int [] sayilar= new int[] {1,2,3};
          System.out.println(sayilar[4]);
      } /*catch (Exception exception) { //Eğer try bloğunda hata varsa catch bloğuna geçerek devam eder.
          System.out.println("Hata oluştu.");
          System.out.println(exception);
      }*/ //Alttaki blokla aynı yapıdır.
      catch (StringIndexOutOfBoundsException exception) { //Eğer try bloğunda hata varsa catch bloğuna geçerek devam eder.
          System.out.println("Hata oluştu.");
          System.out.println(exception);
      }
      /*catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
      }*/
      catch (Exception exception) { //Exception bloğunun dışında catch kullanılmasının nedeni son kullanıcı gerçek hayat ugulamalarında hatanın türüne göre programsal olarak yönlendirebilmemizi sağlamaktadır.
          System.out.println("Loglandı:"+exception); //Bu diğer catch bloklarındaki hata dışında bir hata olursa bunu yap manasında.
        //Üst bloğu pasif yada comment'lediğimizde tüm sınıfların base yani temeli exception olduğundan hangi tür exception gelirse gelsin onu yakalayabilir.
      }
      finally {
          System.out.println("Ben her türlü çalışırım"); //Finally hata olsun olmasın her durumda çalışmaktadır.
         //Bu bloğu günlü hatta örneğin serverda data çekemedik farz edelim bu blok her türlü çalışacağından yazacağımız komut ile programı yönetmeye devam edip hatayı da yönetebiliriz.
      }


    }
}
