package ru.mirea.lab22;

class MultifunctionalChair implements IChair {
    @Override
    public void sit() {
        System.out.println("Сидим на многофункциональном стуле");
    }
}
