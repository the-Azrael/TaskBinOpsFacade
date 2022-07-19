public class Main {
    public static void main(String[] args) {
        BinOps op = new BinOps();
        String binString1 = "10";
        String binString2 = "11";
        System.out.println(
                op.binAndIntValuesString(binString1) +
                " + " +
                op.binAndIntValuesString(binString2) +
                " = " +
                op.binAndIntValuesString(op.sum(binString1, binString2)));

        System.out.println(
                op.binAndIntValuesString(binString1) +
                " * " +
                op.binAndIntValuesString(binString2) +
                " = " +
                op.binAndIntValuesString(op.mult(binString1, binString2)));
    }
}
