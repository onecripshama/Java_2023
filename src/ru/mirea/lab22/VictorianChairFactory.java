package ru.mirea.lab22;

class VictorianChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new VictorianChair();
    }
}
