public class CatBus implements Vehicle,Noisemaker{
    @Override
    public void makeNoise() {

    }

    @Override
    public void revEngine() {

    }

    public void conversation(Noisemaker target){
        makeNoise();
        target.makeNoise();
    }
}
