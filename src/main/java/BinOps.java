public class BinOps {
    public String binAndIntValuesString(String binString) {
        return binString + "(" +  binStrToInt(binString) + ")";
    }

    public int binStrToInt(String number) {
        return Integer.parseInt(number, 2);
    }

    public String binToStr(int number) {
        return Integer.toBinaryString(number);
    }

    public String sum(String a, String b) {
        return binToStr(binStrToInt(a) + binStrToInt(b));
    }

    public String mult(String a, String b) {
        return binToStr(binStrToInt(a) * binStrToInt(b));
    }
}