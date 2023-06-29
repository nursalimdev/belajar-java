public class MethodVariableArgument {
    public static void main(String[] args) {
        // without variable args
        int[] nilai = new int[] {70, 50, 80, 100, 95};
        sayCongrats("Nursalim", nilai);
        sayCongratsVarArgs("Andi", 95, 15, 30, 80, 65);
    }

    static void sayCongrats(String name, int[] values) {
        int total = 0;
        for(var value: values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name +", Anda lulus");
        }else {
            System.out.println("Maaf " + name +", Anda gagal");
        }
    }

    static void sayCongratsVarArgs(String name, int... values) {
        int total = 0;
        for(var value: values) {
            total += value;
        }

        int finalValue = total / values.length;

        if(finalValue >= 75) {
            System.out.println("Selamat " + name +", Anda lulus");
        }else {
            System.out.println("Maaf " + name +", Anda gagal");
        }
    }
}
