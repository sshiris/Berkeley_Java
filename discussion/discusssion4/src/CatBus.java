public class CatBus implements Vehicle,Noisemaker{
    @Override
    public void makeNoise() {

    }

    @Override
    public void revEngine() {

    }

    public void conversation(CatBus target){
        makeNoise();
        target.makeNoise();
    }
}
