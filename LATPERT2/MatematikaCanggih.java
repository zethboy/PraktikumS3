public class MatematikaCanggih extends Matematika
{
    public void modulus(int a, int b)
    {
        if(b != 0){
            System.out.println("Modulus: " + (a % b));
        } else {
            System.out.println("Modulus: Tidak bisa dibagi dengan nol");
        }
    }
}