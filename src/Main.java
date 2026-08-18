import static java.lang.IO.*;
void main() {
    println("Olá bem vindo ao seu cofrinho");
    float meta=Float.parseFloat(readln("insira sua meta"));
    Cofrinho c=new Cofrinho();
    c.setMeta(meta);
    boolean ex=true;
    while (ex){
        String op= readln("1-adicionar dinheiro; 2-remover dinheiro ; 3-monstrar saldo; 4-mostrar progresso; 5-mostrar status;6-sair ");
        switch (op){
            case "1":
            float dinheiro=Float.parseFloat(readln("insira valor para depositar"));
            c.add_dinheiro(dinheiro);

            case "2":
                float rdinheiro=Float.parseFloat(readln("insira valor para retirar"));
                c.ret_dinheiro(rdinheiro);

            case "3":
                c.getsaldo();
            case "4":
                c.progresso();
            case "5":
                c.getStatus();
            case "6":
                println("voce saiu do sistema");
                ex = false;
            }

        }
    }

