package ru.mirea.lab22;

class MagicChairFactory extends ChairFactory {
    @Override
    IChair createChair() {
        return new MagicChair();
    }
}