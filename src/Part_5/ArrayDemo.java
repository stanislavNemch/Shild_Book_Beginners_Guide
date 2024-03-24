package Part_5;

class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];

        for (int i = 0; i < 10; i++) {
            sample[i] = i;
        }
        for (int i = 0; i < sample.length; i++) {
            System.out.println("Элемент sample[" + i + "]: " + sample[i] );
        }
    }
}
