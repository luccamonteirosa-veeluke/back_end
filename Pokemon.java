public class Pokemon {
    private String nome;
    private int fome = 100;
    private int energia = 0;
    private int humor;

    //metodos

    public void setFome(int comida) {
        if (comida < 0) {
            System.out.println("Erro valor invalido");
        } else {


            if (fome == 0) {
                System.out.println("estou saciado");

            }
            this.fome = fome - comida;
        }
    }

    public void setEnergia(int dormir) {
        if (dormir < 0) {
            System.out.println("Erro valor invalido");
        } else {
            if (energia == 100) {
                System.out.println("estou descançado");
            }
            this.energia = energia + dormir;

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