public class ComandoSwitch {
    public static void main(String[] args) {
        
        int semana =1;

        switch (semana) {
            case 1:
            System.out.println("Segunda");
            break;
            case 2:
            System.out.println("Terça");
            break;
            case 3:
            System.out.println("Quarta");
            break;
            case 4:
            System.out.println("Quinta");
            break;
            case 5:
            System.out.println("Sexta");
            break;
            case 6:
            System.out.println("Sábado");
            break;
        
            default:
            System.out.println("Informe um número válido");
                break;
        }
    }
    
}
