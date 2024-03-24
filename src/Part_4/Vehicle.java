package Part_4;

class Vehicle {
   int passengers; // количество пассажиров
   int fuelcap;    // запас топлива в галлонах
   int mpg;        // расход топлива в милях на галлон

    Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }

    // Возвращает дальность поездки,
    int range(){
        return mpg * fuelcap;
    }

    // Рассчитывает объем топлива, необходимого для поездки на заданное расстояние
    double fuelNeeded(int miles){
        return (double) miles / mpg;
    }
}
