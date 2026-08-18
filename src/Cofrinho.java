public class Cofrinho {
    private String nome;
    private double meta;
    private float saldo=0;
    private double progresso;
    public void add_dinheiro(float dinheiro) {
        if (dinheiro < 0) {
            System.out.println("Erro valor invalido");
        } else {
            this.saldo = saldo + dinheiro;
            System.out.println("seu dinheiro foi depositado");
        }
    }
    public void ret_dinheiro(float dinheiro){
        if (dinheiro>saldo){
            System.out.println("Erro valor invalido");
        }
        else {
            this.saldo=saldo-dinheiro;
            System.out.println("seu dinheiro foi retirado com sucesso");
        }

    }
    public void getsaldo(){
        System.out.println("seu saldo:  R$" + saldo);
    }
    public void progresso(){
        progresso=saldo/meta;
        System.out.println("seu progresso da meta: " + progresso+ "%");
    }
    public void getStatus(){
        if (saldo==0){
            System.out.println("meta não inicializada");
        } else if (saldo<meta) {
            System.out.println("Economizando");
        }
        else {
            System.out.println("meta alcançada");
        }
    }
    public void setMeta(float meta){
        if (meta<=0){
            System.out.println("valor invalido para a meta");
        }
        this.meta=meta;
        System.out.println("meta à ser batida: " + meta);
    }

}
