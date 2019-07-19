package SCIT;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sorted repopository");
        sortedRepo();

        System.out.println("\nOrdered repository");
        orderedRepo();


    }

    private static void sortedRepo() {
        IRepository<String> sortedRepo = new SortedRepository<>();

        sortedRepo.save("Alune");
        sortedRepo.save("Portocale");
        sortedRepo.save("Banane");
        sortedRepo.save("Ardei");
        sortedRepo.save("Prune");
        sortedRepo.save("Test de sters");

        System.out.println("The count is: " + sortedRepo.count());
        System.out.println(sortedRepo.listAll());

        System.out.println("~~Deleting one!~~");
        sortedRepo.remove("Test de sters");

        System.out.println("The new count is: " + sortedRepo.count());
        System.out.println(sortedRepo.listAll());

    }

    private static void orderedRepo() {
        IRepository<String> orderedRepo = new OrderedRepository<>();

        orderedRepo.save("A");
        orderedRepo.save("X");
        orderedRepo.save("D");
        orderedRepo.save("J");
        orderedRepo.save("M");
        orderedRepo.save("Test de sters");


        System.out.println("The count is: " + orderedRepo.count());
        System.out.println(orderedRepo.listAll());

        System.out.println("~~Deleting one!~~");
        orderedRepo.remove("Test de sters");

        System.out.println("The new count is: " + orderedRepo.count());

        System.out.println(orderedRepo.listAll());
    }

}
