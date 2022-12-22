// Programação orientada a objetos

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //Constructor
    Carro(){}

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCar(String cor) {
        this.cor = cor;
    }

    String getCar() {
        return cor;
    }

    void seMoldeto(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void seCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    
}