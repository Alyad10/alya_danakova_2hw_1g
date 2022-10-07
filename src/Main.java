public class Main {
    public static void main(String[] args) {

        Furniture chair = createObject("Chair");
        chair.print();
        Furniture bed = createObject("Bed");
        bed.print();
        Furniture cupboard = createObject("Cupboard");
        cupboard.print();



    }
    private static Furniture createObject(String className){
        switch (className){
            case "Chair":
                return new Chair("Plastic","Office");
            case "Bed":
                return new Bed("Brown",2014);
            default:
                return new Cupboard(6,3);
        }



    }

}
