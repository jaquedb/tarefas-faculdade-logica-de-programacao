public class EstruturaIf {

    public static void main(String[] args) {
        int idade = 18;
        String resposta;

    //IF CLÁSSICO
        /*if (idade>=18) {
            resposta = "Maior de idade";
            
        } else {
            
            resposta = "Menor de idade";
        }*/

        //ESTRUTURA IF TERNÁRIO
        resposta = (idade >=18)? "Maior de idade" : "Menor de idade";

        System.out.println(resposta);
    }


    
}