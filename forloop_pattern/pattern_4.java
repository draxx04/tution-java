package forloop_pattern;

class pattern_4 {
    public static void main(String[] args) {
        int i, j;
        for (i = 4; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}