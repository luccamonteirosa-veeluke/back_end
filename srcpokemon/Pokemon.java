public class Pokemon {
    private String nome;
    private int fome = 100;
    private int energia = 0;
    private int humor;

    //metodos

    public void comer(int comida) {
        if (comida < 0) {
            System.out.println("Erro valor invalido");
        } else {


            if (fome == 0) {
                System.out.println("estou saciado");

            }

            this.fome = fome - comida;
            if (comida<0){
                this.fome=0;
            }
        }
    }

    public void dormir(int dormir) {
        if (dormir < 0) {
            System.out.println("Erro valor invalido");
        } else {
            if (energia == 100) {
                System.out.println("estou descançado");
            }
            this.energia = energia + dormir;
            if (energia>100){
                this.energia=100;
            }

        }
    }

    public int getFome() {
        if (fome <= 100 && fome>0) {
            System.out.println("estou com fome");
        }
        if (fome==0){
            System.out.println("estou faminto");
        }
        return fome;
    }

    public int getEnergia() {
        if (energia <= 100) {
            System.out.println("estou descançado");
        }
        if (energia==0){
            System.out.println("estou muito cansado");
        }
        return energia;
    }
    public void gethumor() {
        humor = energia - fome;
        if (humor <= 50) {
            System.out.println("estou meio triste");
        } else if (humor > 50) {
            System.out.println("estou feliz");

        }
    }

    public void getNome() {
        System.out.println("ola meu nome e: " + nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}