import static java.lang.IO.*;
void main() {
    println("ola bem vindo ao seu pokemon pet");
    String nome=readln("insira o nome do seu pokemon");
    Pokemon p =new Pokemon();
    p.setNome(nome);
    boolean ex =true;
    while (ex){
        String op = readln("1-comer; 2-dormir; 3-status; 4-sair");
        switch (op){
            case "1":
                int comida=Integer.parseInt(readln("insira as calorias do alimento"));
                p.comer(comida);
            case "2":
                int dormir=Integer.parseInt(readln("insiras as horas dormidas"));
            case "3":
                p.getNome();
                p.getFome();
                p.getEnergia();
                p.gethumor();
        }
    }
}
