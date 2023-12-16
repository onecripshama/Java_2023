package ru.mirea.lab22;

class MultifunctionalChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new MultifunctionalChair();
    }
}