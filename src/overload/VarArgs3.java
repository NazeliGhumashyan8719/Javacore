package overload;

// Аргументы переменной длины и перезагрузка
public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int...) : " + "Каличество аргументов: " + v.length + "Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print(" vaTest(String, int ...) : " + msg + v.length + "Содержимое: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest("true, false, false");
    }
}



