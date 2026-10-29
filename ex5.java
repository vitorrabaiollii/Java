public class ex5 {
    public static void main(String[] args) {
        int celsius = 25;
        int km = 100;
        double limite = 80.0;
        double calculo_fah = 9.0 / 5.0 ;
        double calculo_mil = 0.621371;

        double fah = celsius * calculo_fah + 32;
        double milhas = km * calculo_mil;

        System.out.println(celsius + " graus Celsius = " + fah + " graus Fahrenheit");
        System.out.println(km + " km = " + milhas + " milhas");

        if (fah > limite) {
            System.out.println("A temperatura é maior que o limite.");
        } else if (fah < limite) {
            System.out.println("A temperatura é menor que o limite.");
        } else {
            System.out.println("A temperatura é igual ao limite.");
        }   
    }
}
