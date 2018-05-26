public class Main4 {

   
    public static void main(String[] args) {
       
     
        int rub = 2998;
        int b = rub;{
        if (rub<100){
         rub = (rub%10);
         switch (rub){
            case 1:
                 System.out.println(b + "Рубль");
                 break;
            case 2:
                 System.out.println(b + "Рубля");
                 break;
            case 3:
                 System.out.println(b + "Рубля");
                 break;
            case 4:
                 System.out.println(b + "Рубля");
                 break;
            case 5:
                 System.out.println(b + "Рублей");
                 break;
            case 6:
                 System.out.println(b + "Рублей");
                 break;
            case 7:
                 System.out.println(b + "Рублей"); 
                 break;
            case 8:
                 System.out.println(b + "Рублей");
                 break;
            case 9:
                 System.out.println(b + "Рублей");
                 break;
            case 0:
                 System.out.println(b + "Рублей"); 
                 break;
         }
        }
         else {
                if (rub%100<=20)
                  System.out.println (b + "Рублей");
                else
                    
            System.out.println (b + "Рубля");
              }
      }
    }
    
}