class dowhile {
    public static void main(String[] args) {
        int i=0;
        while (i<=10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        do{
            System.out.print(i + " ");
            i++;
        }
        while(i<=20);
    }
}
