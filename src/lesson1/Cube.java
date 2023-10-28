package lesson1;

public class Cube {
    //      Необходимо написать алгоритм поиска всех доступных комбинаций
//    (посчитать количество) для количества кубиков K с количеством граней N.
//      У вас есть 2 варианта на выбор – количество кубиков может быть строго
//    ограничено (4 кубика, например), либо их количество будет
//    динамическим. Выбор за вами.
    private int count;
    public int cube(int cubes, int edges) {
        if (cubes == 1) return count;
        for (int i = 0; i < edges; i++) {
            for (int j = 0; j < edges; j++) {
                for (int k = 0; k < edges; k++) {
                    for (int l = 0; l < edges; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}

