class Face {
    public static void main(String[] args) {
        String name="Alice";
        int age=22;
        double cgp= 9.796;
        // double trauncate=math.floor(cgp);
        //float cgpn=(float)cgp;
        
        String grade="A";
        
        System.out.println("Try programiz.pro");
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgp);
        System.out.println(grade);
        //  System.out.println("new CGP "+ cgpn);
//  System.out.println(trauncate);
 String formattedValue = String.format("%.2f", cgp);
System.out.println(formattedValue); 
    }
}