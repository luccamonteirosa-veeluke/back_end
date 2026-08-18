import static java.lang.IO.*;
void main() {
println("ola crie seu personagem");
String nome=readln("coloque seu nome: ");
Personagem p=new Personagem(nome);
boolean ex=true;
while (ex){
    String op=readln("1-atacar; 2-descançar; 3-comer; 4-Status; 5-sair: ");
    switch (op){
        case "1":
            p.atacar();
            p.receberDano();
            continue;
        case "2":
            int horas=Integer.parseInt(readln("quantas horas voce dormiu"));
            p.descançar(horas);
            continue;
        case "3":
            int comida=Integer.parseInt(readln("valor energetico da comida valor de 1 a 10"));
            p.comer(comida);
            continue;
        case "4":
            p.getStatus();
            continue;
        case "5":
            System.out.println("voce saiu");
            ex=false;
    }
}
}
