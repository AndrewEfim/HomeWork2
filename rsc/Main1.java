public class Main1 {
    public static void main(String[] args) {
        String Str1 = new String("Строка не сложная");
        System.out.println(Str1.length());// Выводим на экран кол-во символов
        int mid = (Str1.length()+1)/2; // Находим середину сторки
        String Strpart1 = Str1.substring(0,mid);
        String Strpart2 = Str1.substring(mid);
        
        System.out.println(Strpart1); // Первая часть строки
        System.out.println(Strpart2); // Вторая часть строки
    }   
}
