public class Matematika
{
    public void pembagian(int a, int b)
    {
        if (b != 0) {
            System.out.println("Hasil Pembagian: " + a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Pembagian dengan nol tidak terdefinisi.");
        }
    }

    public void pertambahan(int a, int b)
    {
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " = " + (a + b));
    }

    public void pengurangan(int a, int b)
    {
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " = " + (a - b));
    }

    public void perkalian(int a, int b)
    {
        System.out.println("Hasil Perkalian: " + a + " * " + b + " = " + (a * b));
    }

    //overloading

    public void pertambahan(double a, double b)
    {
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " = " + (a + b));
    }

    public void pertambahan(int a, int b, int c)
    {
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    public void pertambahan(double a, double b, double c)
    {
        System.out.println("Hasil Pertambahan: " + a + " + " + b + " + " + c + " = " + (a + b + c));
    }

    public void pengurangan(int a, int b, int c)
    {
        System.out.println("Hasil Pengurangan: " + a + " - " + b + " - " + c + " = " + (a - b - c));
    }

    public void perkalian(int a, int b, int c)
    {
        System.out.println("Hasil Perkalian: " + a + " * " + b + " * " + c + " = " + (a * b * c));
    }

    public void pembagian(int a, int b, int c)
    {
        if (b != 0 && c != 0) {
            System.out.println("Hasil Pembagian: " + a + " / " + b + " / " + c + " = " + (a / b / c));
        } else {
            System.out.println("Pembagian dengan nol tidak terdefinisi.");
        }
    }

}