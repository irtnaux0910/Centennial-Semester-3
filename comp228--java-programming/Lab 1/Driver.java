public class Driver {
    public static void main(String[] args) {
        Singers singer1 = new Singers();

        System.out.println("Default values:");
        System.out.println("Singer ID: " + singer1.getId());
        System.out.println("Singer Name: " + singer1.getName());
        System.out.println("Singer Address: " + singer1.getAddress());
        System.out.println("Singer date of Birth: " + singer1.getDateBirth());
        System.out.println("Number of Albums: " + singer1.getNumberAlbums());

        // Set values using individual setters
        singer1.SetId(324);
        singer1.SetName("Tris Shaun");
        singer1.SetAddress("123 Young Street, Ontario");
        singer1.SetDateBirth("Oct 5");
        singer1.SetNumberOfAlbums(22);

        System.out.println("\nUpdated values:");
        System.out.println("Singer ID: " + singer1.getId());
        System.out.println("Singer Name: " + singer1.getName());
        System.out.println("Singer Address: " + singer1.getAddress());
        System.out.println("Singer date of Birth: " + singer1.getDateBirth());
        System.out.println("Number of Albums: " + singer1.getNumberAlbums());
    }
}
