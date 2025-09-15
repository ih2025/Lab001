public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 1.04");

        //Task 1         0, 1,  2,  3,  4,   5
        int[] numbers = {5, 10, 85, 4, -30, 22}; // Array 5 elementos

        // Encontrar el menor
        int lowest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }

        // Encontrar el mayor
        int highest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }

        System.out.println(lowest);
        System.out.println(highest);

        // Diferencia
        int difference = highest - lowest;

        System.out.println("El menor es: " + lowest);
        System.out.println("El mayor es: " + highest);
        System.out.println("La diferencia es: " + difference);


        // Task 2

        int lowest = numbers[0];
        int secondLowest = Integer.MAX_VALUE; // Esto es el número más añto que puede guardarse en un tipo int

        // Buscar el menor
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        // Buscar el segundo menor
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > lowest && numbers[i] < secondLowest) {
                secondLowest = numbers[i];
            }
        }

        System.out.println("El menor es: " + lowest);
        System.out.println("El segundo menor es: " + secondLowest);
    }
}

        // Task 3
        double x = 4;
        double y = 7;

        double result = Math.pow (x, 2) +  Math.pow((((4*y)/5) - x), 2);

        System.out.println(result);

    }
}