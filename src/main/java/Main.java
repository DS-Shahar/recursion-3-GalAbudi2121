class Main {
  public class RecursiveSolutions {

    public static int q10(int n) {
        if (n == 1) return 1 * 2;
        return n * 2 + q10(n - 1);
    }

    public static int q11(int n, int current) {
        if (n == 0) return 0;
        return current + q11(n - 1, current - 3);
    }

    public static int q12(int n1, int n2, int max) {
        if (n1 >= max && n2 >= max) return 0;
        int nextMultiple = Math.min(n1 < max ? n1 : max, n2 < max ? n2 : max);
        return nextMultiple + q12(n1 + (nextMultiple == n1 ? n1 : 0), n2 + (nextMultiple == n2 ? n2 : 0), max);
    }

    public static int q13a(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return q13a(n - 1) * q13a(n - 1) + q13a(n - 2) * q13a(n - 2);
    }

    public static int q13b(int n) {
        if (n == 1) return 0;
        return q13a(n) + q13b(n - 1);
    }

    public static int q21(String str, int index) {
        if (index == str.length()) return 0;
        char c = str.charAt(index);
        return (c >= 'a' && c <= 'z' ? 1 : 0) + q21(str, index + 1);
    }

    public static String q22(String str, int index) {
        if (index >= str.length()) return "";
        return str.charAt(index) + (index % 3 == 2 ? "!" : "") + q22(str, index + 1);
    }

    public static String q23(String str, int index) {
        if (index < 0) return "";
        return str.charAt(index) + q23(str, index - 1);
    }

    public static void q24(char start, char end) {
        if (start > end) return;
        System.out.print(start + " ");
        q24((char) (start + 1), end);
    }

    public static void q25(int n, int divisor) {
        if (divisor > n) return;
        if (n % divisor == 0) System.out.print(divisor + " ");
        q25(n, divisor + 1);
    }

    public static void q26(int n) {
        if (n == 0) return;
        if ((n % 10) % 2 == 0) System.out.print(Math.abs(n % 10) + " ");
        q26(n / 10);
    }

    public static void q27(int i, int j) {
        if (i > 10) return;
        if (j > 10) {
            System.out.println();
            q27(i + 1, 1);
        } else {
            System.out.print((i * j) + "\t");
            q27(i, j + 1);
        }
    }

    public static void q28(int a1, int d, int n) {
        if (n == 0) return;
        System.out.print(a1 + " ");
        q28(a1 + d, d, n - 1);
    }

    public static void q29(int current, int step, int count) {
        if (count == 0) return;
        System.out.print(current + " ");
        q29(current + step, step + 1, count - 1);
    }

    public static void q30(int current, int count) {
        if (count == 0) return;
        System.out.print(current + " ");
        q30(current == 4 ? 3 : current == 3 ? 5 : current + 1, count - 1);
    }

    public static void q31(int[] arr, int index) {
        if (index >= arr.length) return;
        if (index % 2 == 0) System.out.print(arr[index] + " ");
        q31(arr, index + 1);
    }

    public static void q32(int[] arr, int index) {
        if (index >= arr.length - 1) return;
        if (arr[index] < arr[index + 1]) System.out.print(arr[index] + " ");
        q32(arr, index + 1);
    }
}
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
