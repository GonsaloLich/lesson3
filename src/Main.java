public class Main {
    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.println("Возраст совершеннолетия наступил");
        } else {
            System.out.println("Возраст совершеннолетия ещё не нгаступил");
        }
        int age2 = 17;
        if ( age2 > 18 ) {
            System.out.println("Возраст совершеннолетия наступил");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил");
        }
        int temp = 8;
        if (temp > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp < 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed +  " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        int speed2 = 50;
        if (speed2 > 60) {
            System.out.println("Если скорость " + speed2 +  " то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed2 + " то можно ездить спокойно");
        }
        int year = 21;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в детский сад");
        } else if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в школу");
        } else if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить в университет ");
        } else if (year > 24) {
            System.out.println("Если возраст человека равен " + year + " то ему нужно ходить на работу ");
        }
        int babyYear = 6;
        if (babyYear < 5) {
            System.out.println("Если возраст ребенка равен " + babyYear + " то ему нельзя кататься кататься на аттракционе");
        } else if (babyYear >=5 && babyYear <= 14) {
            System.out.println("Если возраст ребенка равен " + babyYear + " то ему можно кататься в сопровождении взрослого. Если взрослого нет то нельзя.");
        } else if (babyYear > 14) {
            System.out.println("Если возраст ребенка равен" + babyYear + " то ему можно кататься без сопровождении взрослого");
        }
        int van = 90;
        if (van > 60 && van <102) {
            System.out.println("Если в вагоне " + van + " то нет сидячих мест, но есть стоячие места");
        } else if (van >= 1 && van < 60) {
            System.out.println("Если в вагоне " + van + " то есть сидячие места");
        } else if (van >= 102) {
            System.out.println("Если в вагоне " + van +" то мест нет" );
        }




    }
}