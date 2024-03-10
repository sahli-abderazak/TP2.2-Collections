package tp2_2;

public class Test {

    public static void main(String[] args) {
      
        Entreprise entreprise = new Entreprise("ABC");

        
        Departement department1 = new Departement(1, 10);
        Departement department = new Departement(2, 10);

        entreprise.ajoutDep(department1);
        entreprise.ajoutDep(department);

      
        employe employee1 = new employe(1, "rzouga", 144, 1);
        employe employee2 = new employe(2, "arij", 500, 1);
        employe employee3 = new employe(3, "walid", 250, 2);

      
        department1.ajoutEmploye(employee1);
        department1.ajoutEmploye(employee2);
        department.ajoutEmploye(employee3);

    
        entreprise.afficheE();

        
        entreprise.DepMinCapacity();

        entreprise.UpdateDep(employee1, 2);
        department1.afficheDep();
        System.out.println("******************");
        department.afficheDep();
        
        entreprise.retirerDep(department);
        entreprise.afficheE();
		
    }
}

