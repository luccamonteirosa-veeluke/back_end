public class Personagem {
    private String nome;
    private int vida;
    private int nivel = 1;
    private int energia;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.energia = 100;
    }

    public void receberDano() {
        if (vida < 0) {
            System.out.println("voce esta derrotado");
        } else {

            this.vida = vida - 5;
            System.out.println("voce tomou dano");
        }
    }

    public void descançar(int horas) {
        if (energia==100) {
            System.out.println("voce esta descansado");
        }
        else if (energia<=0 && horas>0) {
            horas=horas*5;
            this.energia=energia+horas;
            if (energia>100){
                this.energia=100;
            }
        }
    }
    public void comer(int comida){
        if (vida<=0){
            System.out.println("voce acordou horas depois");
            this.vida=100;
        }
        else if (comida<=0) {
            System.out.println("não come negativo");
        }
        else {
            comida=comida*5;
            this.vida=vida+comida;
            if (vida>100){
                this.vida=100;
            }
        }
    }
    public void atacar(){
        if (energia<=0){
            System.out.println("voce esta sem energia");
        }
        else if (vida==0) {
            System.out.println("voce esta derrotado");
        }
        this.nivel=nivel+1;
        this.energia=energia-5;
        System.out.println("voce atacou voce tem: " + energia + "restante");
    }
    public void getStatus(){
        System.out.println("seu nome: " + nome);
        System.out.println("sua vida: " + vida);
        System.out.println("sua energia: " + energia);
        System.out.println("seu nivel: " + nivel);
    }
}