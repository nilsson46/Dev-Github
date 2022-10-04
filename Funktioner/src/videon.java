public class videon {
    public static void main(String[] args) {

        /* greeting();
        System.out.println("Hej");
        greeting();*/
        /*greeting("David");
        greeting("Berit");
    }

    static void greeting(){
        System.out.println("Hej David");
    }

    static void greeting(String name){

        System.out.println("Hey " + name);*/

        double area = areaOfRectangle(3.0, 4.0);
        System.out.println("Arean är: " + area);

        area = areaOfRectangle(8.0, 2.0);
        System.out.println("Arean är: " + area);

        area = areaOfTriangle(5, 4);
        System.out.println("Arean är: " + area);
    }

    static double areaOfRectangle(double height, double width){
        double area = height * width;
        return area;
    }

    static double areaOfTriangle (double height , double width){
        double area = height * width * 0.5;
        return area;

    }



}
