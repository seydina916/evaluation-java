import java.util.List;
import java.util.Scanner;
import entities.Adresse;
import entities.client;
import services.AdresseService;
import services.ClientService;

public class Views {


    public static void main(String[] args) throws Exception {



    public class ClientController {

        private ClientService clientService;

        public String index() {
        return "index";
    }

    public List<Client> listClients() {
        return


        AdresseService AdresseService=new AdresseService();
        ClientService clientService=new ClientService();
           Scanner scanner=new Scanner(System.in);
           int choix;
           do{
              System.out.println("1-Creer un Client");
              System.out.println("2-Lister les clients");
              System.out.println("3-Ajouter une adresse et lui associe un client");
              System.out.println("4-Lister les  Comptes");
              System.out.println("5-Lister les adresse en affichant le nom du client");
              System.out.println("6-Quitter");
              choix=scanner.nextInt();
              scanner.nextLine();
              switch (choix) {
                case 1:
                         Client client=new Client();
                         System.out.println("Entrer le Nom");
                         client.setNom(scanner.nextLine());
                         System.out.println("Entrer le prenom");
                         client.setPrenom(scanner.nextLine());
                         System.out.println("Entrer l'Email");
                         client.setEmail(scanner.nextLine());
                         clientService.addClient(client);
                    break;
                    case 2:
                    List<Client> clients = clientService.listerClients();
                    for (Client cl: clients) {
                      System.out.println("Nom : "+ cl.getNomComplet());
                      System.out.println("prenom : "+ cl.getTel());
                      System.out.println("Email : "+ cl.getEmail());
                      System.out.println("==================================");
                  }
                  break;
                default:
                    break;
            
                }
            }while(choix!=87);    
        
    }
}



