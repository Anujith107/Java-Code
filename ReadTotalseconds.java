import java.util.Scanner;

class ReadTotalSeconds {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int totsec = Sc.nextInt();
        int hrs = totsec / 3600;
        totsec = totsec % 3600;
        int min = totsec / 60;
        totsec = totsec % 60;
        System.out.println(String.format("%02d Hour: %02d min: %02d sec", hrs, min, totsec));
        Sc.close();
    }
}
